package lesson_1.homework_1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Work {
    private int id;
    private String FirmName;
    private String adress;
    private long payment;
}
