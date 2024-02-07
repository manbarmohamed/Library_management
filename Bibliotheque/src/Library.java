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
                //System.out.println();
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
    void DeleteBook(){
        Books bk=new Books();
        System.out.println("Enter the book title will delete: ");
        String Title=new Scanner(System.in).nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).title.equals(Title)){
                books.remove(i);
                System.out.println("The book has been deleted successfully.");
            }
        }

    }
    void AddStudents(){
        Scanner sc=new Scanner(System.in);
        Students students1=new Students();
        System.out.println("Enter your name: ");
        String Name=sc.nextLine();
        for (Students std: students){
            if (std.name.equals(Name)){
                System.out.println("The student already exists.");
                return;
            }
        }
        students1.name=Name;
        System.out.println("Enter your Address: ");
        students1.adress=sc.nextLine();
        System.out.println("Enter your identify: ");
        students1.id=sc.nextInt();
        students.add(students1);
        System.out.println("The student has been added successfully.");
    }
    void DisplayStudent(){
        if (students.isEmpty()){
            System.out.println("The list of student is empty. No student to display.");
        }else {
            for (Students std1: students){
                System.out.println("Name : "+std1.name);
                System.out.println("Address : "+std1.adress);
                System.out.println("ID : "+std1.id);

            }
        }

    }
    void SearchStudent(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the student to search: ");
        String nameSearch=scanner.nextLine();
        for (Students std: students){
            if (std.name.equals(nameSearch)){
                System.out.println("Student Found");
                System.out.println("Name : "+std.name);
                System.out.println("Address : "+std.adress);
                System.out.println("ID : "+std.id);
            }else {
                System.out.println("The Student Not Found");
            }
        }

    }
    void DeleteStudent(){
    Students std=new Students();
        System.out.println("Enter the name of the student to search: ");
        String nameDeleted=new Scanner(System.in).nextLine();
        for(int i=0;i<students.size();i++){
            if(students.get(i).name.equals(nameDeleted)){
                students.remove(i);
                System.out.println("The Student has been deleted successfully.");
            }
        }
//        for (Students std1: students){
//            if (std1.name.equals(nameDeleted)){
//                students.remove(std1);
//                System.out.println("The student has been deleted successfully.");
//
//            }
//        }

    }
}
