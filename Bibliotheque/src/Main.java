public class Main {
    public static void main(String[] args) {
        Library lb=new Library();
        lb.AddBook();
        System.out.println("Display items of Book");
        lb.DisplayBook();
        lb.Search();
    }
}