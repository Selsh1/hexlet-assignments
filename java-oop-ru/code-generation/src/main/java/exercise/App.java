package exercise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;

// BEGIN
class App {
    static void save(Path path, Car car) {
        try {
            Files.write(path, car.serialize().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Car extract(Path path) {
        Car car;

        try {
            car = Car.unserialize(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return car;
    }
}
// END
