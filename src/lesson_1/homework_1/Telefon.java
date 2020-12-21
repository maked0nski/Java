package lesson_1.homework_1;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Telefon {
    private int id;
    private String Brend;
    private String Model;
    private double DisplaySize;
    private int MemorySize;
}
