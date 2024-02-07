import java.util.Scanner;

public class Menu {
    void MainInterFace(){
        int choice1;
        Scanner sc=new Scanner(System.in);
        Menu menu=new Menu();
        do {
            String red = "\u001B[31m";
            String reset = "\u001B[0m";
            System.out.println(red+"|-----------------------------------------|");
            System.out.println("|             Library management          |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|              1-- BOOKS ACCESS           |");
            System.out.println("|              2-- STUDENTS ACCESS        |");
            System.out.println("|              3-- Reserve books          |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|-----------------------------------------|"+reset);

            System.out.print("Enter the Choice : ");
            choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    menu.InterFaceBook();
                    break;
                case 2:
                    menu.InterFaceStudent();
                    break;
                case 3:
                    System.out.println("Coming soon!!!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice1 !=4);
    }
    public void InterFaceBook() {
        Library lb = new Library();
        Menu menu=new Menu();
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            String red = "\u001B[31m";
            String reset = "\u001B[0m";
            System.out.println(red+"|-----------------------------------------------|");
            System.out.println("|             Books management                    |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|              1-- Add Book                       |");
            System.out.println("|              2-- Display Books                  |");
            System.out.println("|              3-- Delete Book                    |");
            System.out.println("|              4-- Update Book                    |");
            System.out.println("|              5-- Search to Book                 |");
            System.out.println("|              6-- return to the Main interface   |");
            System.out.println("|              7-- Quitter                        |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|-------------------------------------------------|"+reset);

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
                    System.out.println("Coming soon!!!");
                    break;
                case 5:
                    lb.SearchBook();
                    break;
                case 6:
                    menu.MainInterFace();
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
        Library lb = new Library();
        Menu menu=new Menu();
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            String red = "\u001B[31m";
            String reset = "\u001B[0m";
            System.out.println(red+"|---------------------------------------------------|");
            System.out.println("|             Students management                   |");
            System.out.println("|---------------------------------------------------|");
            System.out.println("|              1-- Add Student                      |");
            System.out.println("|              2-- Display Students                 |");
            System.out.println("|              3-- Delete Student                   |");
            System.out.println("|              4-- Update Student                   |");
            System.out.println("|              5-- Search to Student                |");
            System.out.println("|              6-- return to the Main interface     |");
            System.out.println("|              7-- Quitter                          |");
            System.out.println("|---------------------------------------------------|");
            System.out.println("|---------------------------------------------------|"+reset);

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
                    System.out.println("Coming soon!!!");
                    break;
                case 5:
                    lb.SearchStudent();
                    break;
                case 6:
                    menu.MainInterFace();
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
