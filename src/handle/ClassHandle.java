package handle;
import entity.Classes;

import java.util.Scanner;

public class ClassHandle {
    public Classes classInput(Scanner scanner, int i){
        System.out.println("Nhap ten hoc sinh thu "+ (i+1) +" :" );
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap hoc luc: ");
        String rank = scanner.nextLine();
        System.out.println("Nhap mon hoc: ");
        String subject = scanner.nextLine();
        return new Classes(name, age, rank, subject, i);
    }
}
