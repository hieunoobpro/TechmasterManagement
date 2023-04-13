package Handle;
import Entity.Classes;
import Entity.TechmasterCenter;
import View.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuHandle {
    public boolean opionOfMenu(Scanner scanner, ArrayList<Classes> classes, int i){
        Menu menu = new Menu();
        switch (menu.menuInput(scanner)){
            case 1:{
                System.out.println("Nhap ten hoc sinh moi: " );
                String name = scanner.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap hoc luc: ");
                String rank = scanner.nextLine();
                System.out.println("Nhap mon hoc: ");
                String subject = scanner.nextLine();
                Classes classes1 = new Classes(name, age,rank, subject, i);
                classes.add(classes1);
                break;
            }
            case 2:{
                System.out.println("Nhap id can tim: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                return updateProductById(classes,(id-1),scanner);
            }
            case 3:{
                System.out.println("Nhap id cua hoc vien can xoa: ");
                int id = scanner.nextInt();
                classes.remove((id-1));
                break;
            }
            case 4:{
                break;
            }
        }
        return false;
    }
    public boolean updateProductById(ArrayList<Classes> classes, int id, Scanner scanner){
        if(classes == null) return false;
        else {
            int i = id;
            System.out.println("Cap nhap ten hoc sinh: " );
            String name = scanner.nextLine();
            System.out.println("Cap nhap tuoi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Cap nhap hoc luc: ");
            String rank = scanner.nextLine();
            System.out.println("Cap nhap mon hoc: ");
            String subject = scanner.nextLine();
            Classes classes1 = new Classes(name, age, rank, subject, i);
            classes.set(id,classes1);
            return true;
        }
    }
}
