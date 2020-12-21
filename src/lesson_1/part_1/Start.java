package lesson_1.part_1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
//        System.out.println("khjgffzkjhgf");
//        User vasya = new User();
////        vasya.id = 1;
////        vasya.name= "Vasya";
////        vasya.weight = 78.6;
////        vasya.age = 25;
////        vasya.status = true;
//
//        vasya.setId(-551);
//        vasya.setAge(55);
//        vasya.setName("Vasya");
//        vasya.setWeight(87.6);
//        vasya.setStatus(true);
//
//        System.out.println(vasya);
//
//        User babuin = new User(2, "babuin", 35, 85.92, true);
//        System.out.println(babuin);
//        System.out.println(babuin.massage("Wassap"));
//
////        String [] skills = new String[3];
////        skills[0] = "JS";
////        skills[1] = "Java";
////        skills[2] = "Html";
//        String [] skills = {"Html", "Js", "Css"};
//        Dev dev = new Dev("Nautilus", skills );
//        Dev dev1 = new Dev("Nautilus", new String[]{"Html", "Js", "Css"} );
//
//        System.out.println(dev);
//        System.out.println(dev1);

    ArrayList<String> skills = new ArrayList<>();
    skills.add("Html");
    skills.add("Css");
    skills.add("Js");
        Developer developer = new Developer("Vasya", skills);
        String o0 = skills.get(0);
        String o1 = skills.get(1);
        String o2 = skills.get(2);
        System.out.println(o0);
        System.out.println(o1);
        System.out.println(o2);

        int[] intes = {25,68,457,11};
        for (int i = 0; i < intes.length; i++){
            System.out.println(intes[i]);
        }

        developer.work();
        developer.work("ffsfs");

        SuperDev superDev = new SuperDev("kokos",skills,55);
        System.out.println(superDev);
        superDev.work();


    }
}
