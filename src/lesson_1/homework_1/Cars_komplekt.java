package lesson_1.homework_1;

import lombok.*;

import java.util.ArrayList;

//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Cars_komplekt extends Cars {
    private ArrayList<String> cars_complete_set = new ArrayList<>();

    public Cars_komplekt(ArrayList<String> cars_complete_set) {
        this.cars_complete_set = cars_complete_set;
    }

    public Cars_komplekt(int id, String brand, String model, int year, String color, double Engine, String Fuel, ArrayList<String> cars_complete_set) {
        super(id, brand, model, year, color, Engine, Fuel);
        this.cars_complete_set = cars_complete_set;
    }
}
