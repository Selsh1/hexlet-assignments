package exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Data
@AllArgsConstructor
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    @SneakyThrows
    String serialize() {
        return new ObjectMapper().writeValueAsString(this);
    }

    @SneakyThrows
    static Car unserialize(String json) {
        return new ObjectMapper().readValue(json, Car.class);
    }
    // END
}
