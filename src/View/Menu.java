package View;

import Entity.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Menu {

    public int menuInput(Scanner scanner){
        int option;
        do {
            System.out.println("Chon phuong thuc tinh: ");
            System.out.println("Nhap so 1: Thuc hien them hoc vien");
            System.out.println("Nhap so 2: Cap nhap thong tin hoc vien theo id");
            System.out.println("Nhap so 3: Xoa 1 hoc vien theo id");
            System.out.println("Nhap so 4 de ket thuc chuong trinh");
            option = Integer.parseInt(scanner.nextLine());
        } while (option<0||option>4);
        return option;
    }
}
