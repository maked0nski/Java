package lesson_1.homework_1;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString

public class User {
    private int id;
    private String FirstName;
    private String LastName;
    private int age;
    private boolean work;
    private ArrayList<String> skills;

    public User() {
    }

    public User(int id, String firstName, String lastName, int age, boolean work) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.work = work;
    }

    public User(int id, String firstName, String lastName, int age, boolean work, ArrayList<String> skills) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.work = work;
        this.skills = skills;
    }
}
