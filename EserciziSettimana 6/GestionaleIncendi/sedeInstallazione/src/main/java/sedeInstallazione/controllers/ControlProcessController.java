package sedeInstallazione.controllers;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import sedeInstallazione.entities.SensorRe;
import sedeInstallazione.utils.EventQueue;

@RestController
@RequestMapping("/control-process")
public class ControlProcessController {
	
	private EventQueue eventQueue; 

    private RestTemplate restTemplate;

    public ControlProcessController(EventQueue eventQueue, RestTemplate restTemplate) {
        this.eventQueue = eventQueue;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sensors")
    public ResponseEntity<List<SensorRe>> readSensorData() {
        List<SensorRe> sensorReadings = eventQueue.getAllEvents();
        if (!sensorReadings.isEmpty()) {
            return ResponseEntity.ok(sensorReadings);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @PostMapping("/sensors")
    public ResponseEntity<SensorRe> addSensorData(@RequestBody SensorRe fireSensorData) {
        eventQueue.addEvent(fireSensorData);

        if (fireSensorData.getSmokeLevel() > 5) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<SensorRe> requestEntity = new HttpEntity<>(fireSensorData, headers);

            String url = "http://localhost:8080/control-center/alarms";
            restTemplate.exchange(
                    url,
                    HttpMethod.POST,
                    requestEntity,
                    Void.class);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(fireSensorData);
    }

}
