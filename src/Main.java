
import Entity.Classes;
import Entity.HeadQuater;
import Entity.Student;
import Entity.TechmasterCenter;
import Handle.ClassHandle;
import Handle.HeadquaterHandle;
import Handle.MenuHandle;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuHandle menuHandle = new MenuHandle();
        ArrayList<Classes> classes = new ArrayList<>();
        ClassHandle classHandle = new ClassHandle();
        HeadQuater headQuater = new HeadquaterHandle().headQuaterInput(scanner);
        TechmasterCenter techmasterCenter = new TechmasterCenter(classes, headQuater);
        System.out.println("Nhap so hoc vien: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Classes classes1 = classHandle.classInput(scanner, i);
            classes.add(classes1);
        }
        System.out.println(techmasterCenter);
        menuHandle.opionOfMenu(scanner, classes);
        System.out.println(techmasterCenter);
    }
}