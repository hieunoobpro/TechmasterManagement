package handle;

import entity.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class IdHandle {
    public boolean updateProductById(ArrayList<Classes> classes, int id, Scanner scanner) {
        if (classes == null) return false;
        else {
            int i = id;
            System.out.println("Cap nhap ten hoc sinh: ");
            String name = scanner.nextLine();
            System.out.println("Cap nhap tuoi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Cap nhap hoc luc: ");
            String rank = scanner.nextLine();
            System.out.println("Cap nhap mon hoc: ");
            String subject = scanner.nextLine();
            Classes classes1 = new Classes(name, age, rank, subject, i);
            classes.set(id, classes1);
            return true;
        }
    }
}
