import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions


    List<String> listOfBooks = new ArrayList<String>();
    List<String> listOfUsers = new ArrayList<String>();
    List<String> listOfLibrarians = new ArrayList<String>();

    HashMap <String, Book> mapper = new HashMap<String, Book>();
    HashMap <String, User> mapperUser = new HashMap<String, User>();
    HashMap <String, Librarian> mapperLibrarian = new HashMap<String, Librarian>();
    Scanner scanner = new Scanner(System.in);

    public void addBook(){
        System.out.println("Enter name and author of the book");
        String name = scanner.next();
        Book B = new Book(name);
        B.setName(name);
        String author = scanner.next();
        B.setAuthor(author);
        System.out.println("Enter number of pages, price, year of publish and ISBN of the book");
        int pages = scanner.nextInt();
        B.setPages(pages);
        int price = scanner.nextInt();
        B.setPrice(price);
        int yearOfPublish = scanner.nextInt();
        B.getYearOfPublish();
        int ISBN = scanner.nextInt();
        B.getISBN();

        mapper.put(name, new Book(name));
        listOfBooks.add(name);

    }

    /* public void removeBook(){
        System.out.println("Enter name of the book you want to remove from the library");
        String name = scanner.next();
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (?.getName.equals(name)) {
                ? = null;
            }
        }

    } */

    public void removeBook() {
        System.out.println("Enter name of the book you want to remove from the library");
        String name = scanner.next();
        Book value = mapper.get(name);
        value = null;

    }

    public void searchBook(){
        System.out.println("Enter name of the book you are looking for");
        String name = scanner.next();
        if(listOfBooks.contains(name)) {
            Book value = mapper.get(name);
            System.out.println("Author of the book : " + value.getAuthor());
            System.out.println("number of pages" + value.getPages());
            System.out.println("price : " + value.getPrice());
            System.out.println("year of publish : " + value.getYearOfPublish());
            System.out.println("ISBN : " + value.getISBN());
            if (value.isRented() == true) {
                System.out.println("and the book is rented");
            }
            else {
                System.out.println("the book is not rented");
            }
        } else {
            System.out.println(name + " doesn't exist in the library");
        }

    }

    public void updateBook(){
        System.out.println("Enter name of the book you want to update");
        String name = scanner.next();
        if(listOfBooks.contains(name)) {
            Book value = mapper.get(name);
            System.out.println("Enter the updated value");
            System.out.println("Enter name and author of the book");
            String newName = scanner.next();
            value.setName(newName);
            String newAuthor = scanner.next();
            value.setAuthor(newAuthor);
            System.out.println("Enter number of pages, price, year of publish and ISBN of the book");
            int newPages = scanner.nextInt();
            value.setPages(newPages);
            int newPrice = scanner.nextInt();
            value.setPrice(newPrice);
            int newYearOfPublish = scanner.nextInt();
            value.setYearOfPublish(newYearOfPublish);
            int newISBN = scanner.nextInt();
            value.setISBN(newISBN);
        } else {
            System.out.println(name + " doesn't exist in the library");
        }


    }

    public void doesBookExist(){
        System.out.println("Enter the name of the book you are looking for ");
        String name = scanner.next();
        if(listOfBooks.contains(name)) {
            System.out.println(name + " does exist in the library");
        } else {
            System.out.println(name + " doesn't exist in the library");
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
        System.out.println("Enter a username and a password");
        String username = scanner.next();
        if (listOfUsers.contains(username)) {
            System.out.println(username + " already taken");
        }
        else {
            User U = new User(username);
            String password = scanner.next();
            Pattern patternPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
            Matcher matcherPassword = patternPassword.matcher(password);
            if (matcherPassword.find()) {

                U.setUsername(username);
                U.setPassword(password);
                mapperUser.put(username, new User(username));
                listOfUsers.add(username);
            }
            else
                System.out.println("choose a password that is at least 8 letters and contains both character and number");

        }
    }

    public void removeUser(){
        System.out.println("Enter the username you want to remove");
        String username = scanner.next();
        User value = mapperUser.get(username);
        value = null;

    }

    public void searchUser(){
        System.out.println("Enter name of the user you are looking for");
        String username = scanner.next();
        if(listOfUsers.contains(username)) {
            System.out.println(username + " does exist in the library");
            User value = mapperUser.get(username);
            System.out.println("password of the user : " + value.getPassword());
        } else {
            System.out.println(username + " doesn't exist in the library");
        }

    }

    public void updateUser(){
        System.out.println("Enter the username of the user you want to update");
        String username = scanner.next();
        if (listOfUsers.contains(username)) {
            User value = mapperUser.get(username);
            System.out.println("Enter the new username");
            String newUsername = scanner.next();
            value.setUsername(newUsername);
            System.out.println("Enter the new password");
            String newPassword = scanner.next();
            value.setPassword(newPassword);
        }
        else {
            System.out.println(username + "doesn't exist in the library");
        }
    }

    public void doesUserExist(){
        System.out.println("Enter the username you are looking for");
        String username = scanner.next();
        if (listOfUsers.contains(username)) {
            System.out.println(username + "does exist in the library");
        }
        else {
            System.out.println(username + "doesn't exist in the library");
        }
    }

    //librarian related functions

    public void addLibrarian(){
        System.out.println("Enter the username and password of the new librarian");
        String username = scanner.next();
        if (listOfLibrarians.contains(username)) {
            System.out.println(username + " already taken");
        }
        else {
            Librarian L = new Librarian(username);
            String password = scanner.next();
            Pattern patternPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
            Matcher matcherPassword = patternPassword.matcher(password);
            if (matcherPassword.find()) {

                L.setUsername(username);
                L.setPassword(password);
                mapperLibrarian.put(username, new Librarian(username));
                listOfLibrarians.add(username);
            }
            else
                System.out.println("choose a password that is at least 8 letters and contains both character and number");

        }



    }

    public void removeLibrarian(){
        System.out.println("Enter the username of the librarian you want to remove");
        String username = scanner.next();
        Librarian value = mapperLibrarian.get(username);
        value = null;


    }

    public void searchLibrarian(){
        System.out.println("Enter username of the librarian you are looking for");
        String username = scanner.next();
        if(listOfLibrarians.contains(username)) {
            System.out.println(username + " does exist in the library");
            Librarian value = mapperLibrarian.get(username);
            System.out.println("password of the librarian : " + value.getPassword());
        } else {
            System.out.println(username + " doesn't exist in the library");
        }
    }

    public void updateLibrarian(){
        System.out.println("Enter the username of the librarian you want to update");
        String username = scanner.next();
        if (listOfLibrarians.contains(username)) {
            Librarian value = mapperLibrarian.get(username);
            System.out.println("Enter the new username");
            String newUsername = scanner.next();
            value.setUsername(newUsername);
            System.out.println("Enter the new password");
            String newPassword = scanner.next();
            value.setPassword(newPassword);
        }
        else {
            System.out.println(username + "doesn't exist in the library");
        }
    }

    public void doesLibrarianExist(){
        System.out.println("Enter the username of the librarian you are looking for");
        String username = scanner.next();
        if(listOfLibrarians.contains(username)) {
            System.out.println(username + " does exist in the library");
        } else {
            System.out.println(username + " doesn't exist in the library");
        }
    }


}
