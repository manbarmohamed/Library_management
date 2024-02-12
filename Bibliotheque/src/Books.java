import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class Books {
        String title;
        String author;
        String ISBN;
        LocalDate pub_date;
        Students std = new Students();
        LocalDate reservationDate;

        boolean isbooked;

//        void Books(String title,String author,String ISBN,String pub_date,Students std,Boolean isbooked){
//                this.title
//
//        }
        public void UpdateBook() {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter title of book: ");
                this.title=scanner.nextLine();
                System.out.println("Enter the author of book: ");
                this.author = scanner.nextLine();
                System.out.println("Enter the ISBN of book: ");
                this.ISBN = scanner.nextLine();
                System.out.println("Enter publication date of book (DD/MM/YYYY): ");
                String pubDateString = scanner.nextLine();
                try {
                        LocalDate pubDate = LocalDate.parse(pubDateString, formatter);
                        this.pub_date = pubDate;
                } catch (Exception e) {
                        System.out.println("Invalid date format. Please use DD/MM/YYYY.");
                        return;
                }
                System.out.println("The book has been modified successfully.");


        }


}
