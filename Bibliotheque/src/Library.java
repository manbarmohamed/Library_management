import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Books> books = new ArrayList<Books>();
    ArrayList<Students> students = new ArrayList<Students>();

void Library(){
    this.books=new ArrayList<>();
    this.students=new ArrayList<>();
}


    void AddBook(){
        //Add Books
        Scanner scanner = new Scanner(System.in);
        Books book = new Books();
        System.out.println("Enter title of book: ");
        String title=scanner.nextLine();
        for (Books exist : books){
            if (exist.title.equalsIgnoreCase(title)){
                System.out.println("the book already exists");
                return;
            }
        }
            book.title = title;
            System.out.println("Enter the author of book: ");
            book.author = scanner.nextLine();
            System.out.println("Enter the ISBN of book: ");
            book.ISBN = scanner.nextLine();
            System.out.println("Enter publication date of book: ");
            book.pub_date = scanner.nextLine();
            Students student = new Students();
            try {
                System.out.println("Is the book booked? (true/false):");
                book.isbooked = scanner.nextBoolean();
            }catch (Exception e){
                System.out.println(e);
            }

            books.add(book);
            System.out.println("The book has been added successfully.");

    }
    void DisplayBook(){

//        methode 1
//        for (int i = 0; i < books.size(); i++) {
//            System.out.println("Title: " + books.get(i).title);
//            System.out.println("Author: " + books.get(i).author);
//            System.out.println("ISBN: " + books.get(i).ISBN);
//            System.out.println("Publication Date: " + books.get(i).pub_date);
//            System.out.println("Is Booked: " + books.get(i).isbooked);
//            System.out.println();
//        }

//        methode 2
        if (books.isEmpty()){
            System.out.println("The library is empty. No books to display.");
        }else {
            for (Books book : books) {
                System.out.println("Title: " + book.title);
                System.out.println("Author: " + book.author);
                System.out.println("ISBN: " + book.ISBN);
                System.out.println("Publication Date: " + book.pub_date);
                System.out.println("Is Booked: " + book.isbooked);
                System.out.println();
            }
        }


    }
    void SearchBook(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the title of the book to search: ");
        String titleSearch=scanner.nextLine();
        for (Books books1: books){
            if (books1.title.equals(titleSearch)){
                System.out.println("Book found. ");
                System.out.println("Title: " + books1.title);
                System.out.println("Author: " + books1.author);
                System.out.println("ISBN: " + books1.ISBN);
                System.out.println("Publication Date: " + books1.pub_date);
                System.out.println("Is Booked: " + books1.isbooked);
                System.out.println();

            }
            else {
                System.out.println("Book not found");
            }
        }
    }
}
