package sedeInstallazione.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorRe {

	  private long id;
	  private double latitude;
	  private double longitude;
	  private int smokeLevel;
	
}
