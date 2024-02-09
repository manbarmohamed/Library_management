import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    String name ;
    String adress;
    int id ;
    ArrayList<Books> book=new ArrayList<Books>();

    public void UpdateBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of Student: ");
        this.name=scanner.nextLine();
        System.out.println("Enter the Address of Student: ");
        this.adress = scanner.nextLine();
        System.out.println("Enter the ID of Student: ");
        this.id = scanner.nextInt();
        System.out.println("The Student has been modified successfully.");


    }

}
