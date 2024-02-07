import java.util.Scanner;

public class Menu {
    public void listChoice() {
        Library lb = new Library();
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("|-----------------------------------------|");
            System.out.println("|             library management          |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|              1-- Add Book               |");
            System.out.println("|              2-- Display Books          |");
            System.out.println("|              3-- Delete Book            |");
            System.out.println("|              4-- Update Book            |");
            System.out.println("|              5-- Search to Book         |");
            System.out.println("|              6-- Add Student            |");
            System.out.println("|              7-- Quitter                |");
            System.out.println("|-----------------------------------------|");
            System.out.println("|-----------------------------------------|");

            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lb.AddBook();
                    break;
                case 2:
                    lb.DisplayBook();
                    break;
                case 5:
                    lb.SearchBook();
                    break;
//                case 4:
//                    modifyBook();
//                    break;
//                case 5:
//                    addStudent();
//                    break;
//                case 6:
//                    showStudent();
//                    break;
                case 7:
                    System.out.println("End Programme!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 7);

    }
}
