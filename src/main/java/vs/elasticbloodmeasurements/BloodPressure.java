package vs.elasticbloodmeasurements;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;

public class BloodPressure {

    private final Random random = new Random();
    private final MathContext precision = new MathContext(3);

    private final double SYS_MIN = 9.1;
    private final double SYS_MAX = 21.3;
    private final double DIA_MIN = 4.9;
    private final double DIA_MAX = 12.4;

    public BigDecimal systolic() {
        return new BigDecimal(random.doubles(SYS_MIN, SYS_MAX).findFirst().getAsDouble(), precision);
    }

    public BigDecimal diastolic() {
        return new BigDecimal(random.doubles(DIA_MIN, DIA_MAX).findFirst().getAsDouble(), precision);
    }

    public TimeOfDay getTimeOfDay(int i) {
        return i % 2 == 0 ? TimeOfDay.EVENING : TimeOfDay.MORNING;
    }

}
