package Handle;

import Entity.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {
    public ArrayList<Classes> addStudent (Scanner scanner, ArrayList<Classes> classes) {
        int i = 0;
        System.out.println("Nhap ten hoc sinh moi: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap hoc luc: ");
        String rank = scanner.nextLine();
        System.out.println("Nhap mon hoc: ");
        String subject = scanner.nextLine();
        Classes classes1 = new Classes(name, age, rank, subject, i);
        classes.add(classes1);
        return classes;
    }
}
