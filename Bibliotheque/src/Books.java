import java.util.Scanner;

public class Books {
        String title;
        String author;
        String ISBN;
        String pub_date;
        Students std=new Students();
        boolean isbooked;

//        void Books(String title,String author,String ISBN,String pub_date,Students std,Boolean isbooked){
//                this.title
//
//        }
        public void UpdateBook() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter title of book: ");
                this.title=scanner.nextLine();
                System.out.println("Enter the author of book: ");
                this.author = scanner.nextLine();
                System.out.println("Enter the ISBN of book: ");
                this.ISBN = scanner.nextLine();
                System.out.println("Enter publication date of book: ");
                this.pub_date = scanner.nextLine();
                System.out.println("The book has been modified successfully.");


        }


}
