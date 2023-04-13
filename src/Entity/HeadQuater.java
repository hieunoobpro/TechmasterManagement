package Entity;

public class HeadQuater {
    private String manager;
    private String lecture;
    private String className;

    public HeadQuater(String manager, String lecture, String className) {
        this.manager = manager;
        this.lecture = lecture;
        this.className = className;
    }

    @Override
    public String toString() {
        return  "TechmasterCenter: " +
                "\nQuản lý lớp học: " + manager +
                "\nGiảng viên: " + lecture +
                "\nLớp học: " + className ;
    }
}
