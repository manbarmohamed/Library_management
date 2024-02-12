import java.util.Scanner;

public class Menu {
    Library lb = new Library();

    void MainInterFace(){
        int choice1;
        Scanner sc=new Scanner(System.in);
        do {
            
            System.out.println("|+---------------------------------------+|");
            System.out.println("|             Library management          |");
            System.out.println("|+---------------------------------------+|");
            System.out.println("|              1-- BOOKS ACCESS           |");
            System.out.println("|              2-- STUDENTS ACCESS        |");
            System.out.println("|              3-- Reserve books          |");
            System.out.println("|+---------------------------------------+|");
            System.out.println("|+---------------------------------------+|");

            System.out.print("Enter the Choice : ");
            choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    InterFaceBook();
                    break;
                case 2:
                    InterFaceStudent();
                    break;
                case 3:
                    ReserveInterFace();
                    break;
                case 4:
                    System.out.println("End Programme!!!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice1 !=4);
    }
    void ReserveInterFace(){
        int choice1;
        Scanner sc=new Scanner(System.in);
        do {

            System.out.println("|+---------------------------------------+|");
            System.out.println("|             Reserve management          |");
            System.out.println("|+---------------------------------------+|");
            System.out.println("|              1-- reserve book           |");
            System.out.println("|              2-- Filter book            |");
            System.out.println("|              3-- Quitter                |");
            System.out.println("|+---------------------------------------+|");
            System.out.println("|+---------------------------------------+|");

            System.out.print("Enter the Choice : ");
            choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    lb.ReserveBook();
                    break;
                case 2:
                    lb.FilterBookReserved();
                    break;
                case 3:
                    System.out.println("End Programme!!!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice1 !=3);
    }
    public void InterFaceBook() {
        int choice;
        Scanner sc=new Scanner(System.in);
        do {

            System.out.println("|+-----------------------------------------------+|");
            System.out.println("|             Books management                    |");
            System.out.println("|+-----------------------------------------------+|");
            System.out.println("|              1-- Add Book                       |");
            System.out.println("|              2-- Display Books                  |");
            System.out.println("|              3-- Delete Book                    |");
            System.out.println("|              4-- Update Book                    |");
            System.out.println("|              5-- Search to Book                 |");
            System.out.println("|              6-- return to the Main interface   |");
            System.out.println("|              7-- Quitter                        |");
            System.out.println("|+-----------------------------------------------+|");
            System.out.println("|+-----------------------------------------------+|");

            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lb.AddBook();
                    break;
                case 2:
                    lb.DisplayBook();
                    break;
                case 3:
                    lb.DeleteBook();
                    break;
                case 4:
                    lb.UpdateBook();
                    break;
                case 5:
                    lb.SearchBook();
                    break;
                case 6:
                    MainInterFace();
                    break;
                case 7:
                    System.out.println("End Programme!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 7);

    }
    public void InterFaceStudent() {
        int choice;
        Scanner sc=new Scanner(System.in);
        do {

            System.out.println("|+-------------------------------------------------+|");
            System.out.println("|             Students management                   |");
            System.out.println("|+-------------------------------------------------+|");
            System.out.println("|              1-- Add Student                      |");
            System.out.println("|              2-- Display Students                 |");
            System.out.println("|              3-- Delete Student                   |");
            System.out.println("|              4-- Update Student                   |");
            System.out.println("|              5-- Search to Student                |");
            System.out.println("|              6-- return to the Main interface     |");
            System.out.println("|              7-- Quitter                          |");
            System.out.println("|+-------------------------------------------------+|");
            System.out.println("|+-------------------------------------------------+|");

            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lb.AddStudents();
                    break;
                case 2:
                    lb.DisplayStudent();
                    break;
                case 3:
                    lb.DeleteStudent();
                    break;
                case 4:
                    lb.UpdateStudent();
                    break;
                case 5:
                    System.out.println("Enter the name of the student to search: ");
                    String nameSearch=new Scanner(System.in).nextLine();

                    if (lb.SearchStudent(nameSearch)!= null){
                        System.out.println("Name : "+lb.SearchStudent(nameSearch).name);
                        System.out.println("Address : "+lb.SearchStudent(nameSearch).adress);
                        System.out.println("ID : "+lb.SearchStudent(nameSearch).id);
                    }
                    break;
                case 6:
                    MainInterFace();
                    break;
                case 7:
                    System.out.println("End Programme!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 7);

    }
}
