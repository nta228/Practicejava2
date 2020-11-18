import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Studentcontroller stdCtrl = new Studentcontroller();
        Studentview stdView = new Studentview();
        List<Student> stdList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do
            {
            System.out.println("1. Them hoc sinh\n" +
                    "2. hien thi ho so\n" +
                    "3. luu\n" +
                    "4. thoat");
            System.out.println("lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case (1):
                    stdList = stdView.addStudent();
                    break;
                case (2):
                    stdCtrl.displayStudent(stdList);
                    break;
                case (3):
                    stdCtrl.updateToDB(stdList);
                    break;
                case (4):
                    System.out.println("Cam on, tam biet !");
                    break;
                default:
                    System.out.println("lua chon khong hop le");
                    break;
            }
        }while (choice != 4);
    }
}