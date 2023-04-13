package entity;
public class Student {
    private int id;
    private String name;
    private int age;
    private String rank;

    public Student() {
    }
    public Student(String name, int age, String rank, int autoId) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRank() {
        return rank;
    }
}
