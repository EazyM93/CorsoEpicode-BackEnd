package sondaAlpha.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import sondaAlpha.entities.SensorRe;

@Configuration
public class SensorConfig {
	
	@Bean("FireSensorParamsBean")
    @Scope("prototype")
	SensorRe fireSensorData(int smokeLevel) {
        return SensorRe.builder().smokeLevel(smokeLevel).build();
    }

    @Bean("FireSensorRandomBean")
    @Scope("prototype")
    SensorRe fireSensorDataRandom() {
        int smokeLevel = (int) (Math.random() * 10);
        return SensorRe.builder().smokeLevel(smokeLevel).build();
    }

}
