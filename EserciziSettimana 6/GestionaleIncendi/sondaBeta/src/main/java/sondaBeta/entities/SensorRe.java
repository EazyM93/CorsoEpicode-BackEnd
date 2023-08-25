package sondaBeta.entities;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorRe {
	
	@Value("${sensor.id}")
    private long id;

    @Value("${sensor.latitude}")
    private double latitude;

    @Value("${sensor.longitudine}")
    private double longitude;

    private int smokeLevel;

}
