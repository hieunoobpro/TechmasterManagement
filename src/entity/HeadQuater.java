package entity;

public class HeadQuater {
    private String manager;
    private String lecturers;
    private String className;

    public HeadQuater(String manager, String lecturers, String className) {
        this.manager = manager;
        this.lecturers = lecturers;
        this.className = className;
    }

    @Override
    public String toString() {
        return  "TechmasterCenter: " +
                "\nQuản lý lớp học: " + manager +
                "\nGiảng viên: " + lecturers +
                "\nLớp học: " + className ;
    }
}
