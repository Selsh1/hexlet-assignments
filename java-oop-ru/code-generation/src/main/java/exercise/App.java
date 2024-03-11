package exercise;

import lombok.SneakyThrows;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;

// BEGIN
class App {
    @SneakyThrows
    static void save(Path path, Car car) {
        Files.write(path, car.serialize().getBytes(StandardCharsets.UTF_8));
    }

    @SneakyThrows
    static Car extract(Path path) {
        return Car.unserialize(Files.readString(path));
    }
}
// END
