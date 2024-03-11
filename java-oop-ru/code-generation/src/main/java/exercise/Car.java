package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

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
    String serialize() {
        var str = "";

        try {
            str = new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return str;
    }

    static Car unserialize(String json) {
        Car car;

        try {
            car = new ObjectMapper().readValue(json, Car.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return car;
    }
    // END
}
