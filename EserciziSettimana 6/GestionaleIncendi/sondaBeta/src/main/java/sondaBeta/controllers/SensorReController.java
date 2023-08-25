package sondaBeta.controllers;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import sondaBeta.entities.SensorRe;

@RestController
@RequestMapping("/sensors")
@AllArgsConstructor
public class SensorReController {
	
	private EventQueue eventQueue; 

    private RestTemplate restTemplate;

    @GetMapping("/{sensorId}")
    public ResponseEntity<List<SensorRe>> getFireReadings(
            @PathVariable String sensorId) {
        List<SensorRe> sensorReadings = eventQueue.getAllEvents();
        if (!sensorReadings.isEmpty()) {
            return ResponseEntity.ok(sensorReadings);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{sensorId}")
    public ResponseEntity<SensorRe> postFireReading(
            @PathVariable String sensorId,
            @RequestBody SensorRe fireSensorData) {
        eventQueue.addEvent(fireSensorData); 

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<SensorRe> requestEntity = new HttpEntity<>(fireSensorData, headers);

        String url = "http://localhost:8081/control-process/sensors";
        restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                SensorRe.class);

        return ResponseEntity.ok(fireSensorData);
    }

}
