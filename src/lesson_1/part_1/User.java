package lesson_1.part_1;

public class User {
    private long id;
    private int age;
    private String name;
    private double weight;
    private boolean status;

    public User(){

    }

    public User(long id, String name, int age, double weight, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", status=" + status +
                '}';
    }

    public String massage (String msg){
        return msg + " " + this.name + ", and i  " + this.age + " old";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id < 0){
            System.out.println("Error ID");
        }
        else {
            this.id = id;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
