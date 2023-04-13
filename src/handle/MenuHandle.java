package handle;
import entity.Classes;
import view.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuHandle {
    public boolean opionOfMenu(Scanner scanner, ArrayList<Classes> classes){
        Menu menu = new Menu();
        switch (menu.menuInput(scanner)){
            case 1:{
                  StudentHandle addStudentHandle = new StudentHandle();
                  addStudentHandle.addStudent(scanner, classes);
                break;
            }
            case 2:{
                System.out.println("Nhap id can tim: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                IdHandle idHandle = new IdHandle();
                idHandle.updateProductById(classes,(id-1),scanner);
                break;
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
}
