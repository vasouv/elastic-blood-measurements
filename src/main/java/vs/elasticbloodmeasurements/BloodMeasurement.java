package vs.elasticbloodmeasurements;

import java.math.BigDecimal;

public record BloodMeasurement(String name, BigDecimal sys, BigDecimal dia, TimeOfDay time) {

}
