package lesson_1.homework_1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user_default = new User();
        System.out.println(user_default);

        User sasha = new User(1,"Yermakov","Oleksandr", 39, false);
        System.out.println(sasha);

        Work work0 = new Work();
        System.out.println(work0);

        Work work1 = new Work(1, "Kolobok", "Ukraine", 55256L);
        System.out.println(work1);

        Cars cars_noArguments = new Cars();
        Cars laguna = new Cars(1, "Renault", "Laguna", 2013, "Grey", 2.0, "diesel");
        System.out.println(cars_noArguments);
        System.out.println(laguna);

        ArrayList<String> complektation = new ArrayList<>();
        complektation.add("Leather interior");
        complektation.add("Radio");
        complektation.add("Cruise control");
        System.out.println(complektation);

        Cars_komplekt cars_komplekt1 = new Cars_komplekt(1,"mazda", "x5", 2005, "red", 2.5, "diesel", complektation);
        System.out.println(cars_komplekt1);

        Skill skill_1 = new Skill(1, "Html", 9);
        Skill skill_2 = new Skill(2, "Css", 8);
        System.out.println(skill_1);

        ArrayList<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Html");
        skills.add("CSS");
        skills.add("Js");
        skills.add("Python");

        User user3 = new User(3, "Aleks", "Yermak", 85, true, skills);
        System.out.println(user3);

        Produktu produktu = new Produktu(5, "orange", "yelow", 0.150);
        System.out.println(produktu);

        Telefon nokia = new Telefon(1, "Nokia", "3310", 3.14, 16);
        System.out.println(nokia);

        Telefon telefon1 = new Telefon();
        System.out.println(telefon1);


    }
}
