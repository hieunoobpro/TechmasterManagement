package Entity;

public class Classes extends Student {
    private String subject;
    private String information;

    public Classes(String name, int age, String rank, String subject, int id) {
        super(name, age, rank, id);
        this.subject=subject;
    }


    @Override
    public String toString() {
        return
                "\n- Ten hoc sinh: " + super.getName() +
                "\nTuoi: " + super.getAge() +
                "\nMon hoc: " + subject  +
                "\nHoc luc: " + super.getRank()+
                "\n--------------------";
    }
}
