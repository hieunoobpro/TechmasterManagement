package Handle;

import Entity.HeadQuater;

import java.util.Scanner;

public class HeadquaterHandle {
    public HeadQuater headQuaterInput(Scanner scanner){
        System.out.println("Nhap ten lop hoc: ");
        String classname = scanner.nextLine();
        System.out.println("Nhap ten giang vien: ");
        String lecture = scanner.nextLine();
        System.out.println("Nhap ten quan ly: ");
        String manager = scanner.nextLine();
        return new HeadQuater(classname, lecture, manager);
    }
}
