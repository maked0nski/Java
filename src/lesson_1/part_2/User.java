package lesson_1.part_2;

import lombok.*;

import java.util.ArrayList;



@AllArgsConstructor
@NoArgsConstructor
@Generated
@Setter
@ToString

public class User {
    private  int id;
    private String name;
    private ArrayList<String> skills = new ArrayList<>();
}
