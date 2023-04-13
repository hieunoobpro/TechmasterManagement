package handle;
import entity.Classes;

import java.util.Scanner;

public class ClassHandle {
    public Classes classInput(Scanner scanner, int i){
        System.out.println("Nhap ten hoc sinh thu "+ (i+1) +" :" );
        String nameOfStudent = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int ageOfstudent = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap hoc luc: ");
        String rankOfStudent = scanner.nextLine();
        System.out.println("Nhap mon hoc: ");
        String subjectOfStudent = scanner.nextLine();
        return new Classes(nameOfStudent, ageOfstudent, rankOfStudent, subjectOfStudent, i);
    }
}
