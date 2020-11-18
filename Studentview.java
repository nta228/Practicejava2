import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studentview {
    List<Student> stdList = new ArrayList<>();
    public List<Student> addStudent(){
        Studentcontroller stdCrl = new Studentcontroller();
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap id: ");
        String id = scanner.nextLine();
        System.out.println("nhap ten:");
        String name = scanner.nextLine();
        System.out.println("nhap dia chi:");
        String address = scanner.nextLine();
        System.out.println("nhap so dien thoai:");
        int phone = Integer.parseInt(scanner.nextLine());
        Student obj = new Student(id,name,address,phone);
        stdList.add(obj);
        System.out.println("sinh vien da duoc them vao: ");
        return stdList;
    }
}
