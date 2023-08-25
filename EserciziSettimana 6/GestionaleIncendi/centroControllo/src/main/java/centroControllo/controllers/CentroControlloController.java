package centroControllo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import centroControllo.entities.SensorRe;

@RestController
@RequestMapping("/centro-controllo/allarmi")
public class CentroControlloController {

	private List<SensorRe> alarms = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> handleAlarm(@RequestBody SensorRe fireSensorData) {
        System.out.println("Nuovo allarme ricevuto: " + fireSensorData);
        alarms.add(fireSensorData);
        return ResponseEntity.status(HttpStatus.OK).body("Allarme ricevuto");
    }

    @GetMapping
    public ResponseEntity<List<SensorRe>> getAlarms() {
        if (!alarms.isEmpty()) {
            return ResponseEntity.ok(alarms);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
	
}
