package Entity;

import java.util.ArrayList;

public class TechmasterCenter {

    private ArrayList<Classes> classroom;
    private HeadQuater headQuaters;

    public TechmasterCenter(ArrayList<Classes> classroom, HeadQuater headQuaters) {
        this.classroom = classroom;
        this.headQuaters = headQuaters;
    }

    @Override
    public String toString() {
        return "\n" + headQuaters +
                "\nDanh sach thanh vien: " + classroom ;
    }
}

