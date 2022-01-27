package vs.elasticbloodmeasurements;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class BloodMeasurementController {

    final BloodPressure bloodPressure = new BloodPressure();
    final Faker faker = new Faker();

    final int CAPACITY = 1_000;

    @GetMapping
    public List<BloodMeasurement> blood() {
        return Stream.iterate(0, i -> i + 1).limit(CAPACITY)
                .map(i -> new BloodMeasurement(faker.name().fullName(), bloodPressure.systolic(),
                        bloodPressure.diastolic(), bloodPressure.getTimeOfDay(i)))
                .toList();
    }

}
