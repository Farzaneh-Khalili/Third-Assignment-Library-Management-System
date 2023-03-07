import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions


    List<Book> listOfBooks =new ArrayList<Book>();
    Scanner scanner = new Scanner(System.in);

    public void addBook(){
        Book B = new Book();
        System.out.println("Enter name and author of the book");
        String name = scanner.next();
        B.setName(name);
        String author = scanner.next();
        B.getAuthor(author);
        System.out.println("Enter number of pages, price, year of publish and ISBN of the book");
        int pages = scanner.nextInt();
        B.setPages(pages);
        int price = scanner.nextInt();
        B.setPrice(price);
        int yearOfPublish = scanner.nextInt();
        B.getYearOfPublish();
        int ISBN = scanner.nextInt();
        B.getISBN(ISBN);

    }

    public void removeBook(){
        System.out.println("Enter name of the book you want to remove from the library");
        String name = scanner.next();

    }

    public void searchBook(){
        //TODO
    }

    public void updateBook(){
        //TODO
    }

    public void doesBookExist(){
        System.out.println("Enter the name of the book you are looking for ");
        String name = scanner.next();
        if(listOfBooks.contains(name)) {
            System.out.println(name + " is present in the list.");
        } else {
            System.out.println(name + " is not present in the list.");
        }
    }

    public void increaseBook(){
        //TODO
    }

    public void decreaseBook(){
        //TODO
    }

    //user related functions

    public void addUser(){
        User U = new User();
        System.out.println("Enter username and password of the new user");
        String username = scanner.next();
        String password = scanner.next();
        U.setUsername(username);
        U.setPassword(password);
    }

    public void removeUser(){
        //TODO
    }

    public void searchUser(){
        //TODO
    }

    public void updateUser(){
        //TODO
    }

    public void doesUserExist(){
        //TODO
    }

    //librarian related functions

    public void addLibrarian(){
        Librarian L = new Librarian();
        System.out.println("Enter the username and password of the new librarian");
        String username = scanner.next();
        String password = scanner.next();
        L.setUsername(username);
        L.setPassword(password);
    }

    public void removeLibrarian(){
        //TODO
    }

    public void searchLibrarian(){
        //TODO
    }

    public void updateLibrarian(){
        //TODO
    }

    public void doesLibrarianExist(){
        //TODO
    }


}
