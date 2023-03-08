import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> listOfBooks = new ArrayList<String>();
        List<String> listOfUsers = new ArrayList<String>();
        List<String> listOfLibrarians = new ArrayList<String>();

        HashMap<String, Book> mapper = new HashMap<String, Book>();
        HashMap <String, User> mapperUser = new HashMap<String, User>();
        HashMap <String, Librarian> mapperLibrarian = new HashMap<String, Librarian>();

        Librarian mainLibrarian = new Librarian("librarian");
        mainLibrarian.setUsername("librarian");
        mainLibrarian.setPassword("pass1234");
        listOfLibrarians.add("librarian");

        User firstUser = new User("user");
        firstUser.setUsername("user");
        firstUser.setPassword("user78910");
        listOfUsers.add("user");

        Book first = new Book("one");
        first.setAuthor("person one");
        first.setPrice(40000);
        first.setPages(150);
        first.setISBN(3);
        first.setYearOfPublish(2019);
        listOfBooks.add("one");


        Library lib = new Library();

        runMenu();

    }

    public static void runMenu(){

        Library lib = new Library();

        List<String> listOfBooks = new ArrayList<String>();
        List<String> listOfUsers = new ArrayList<String>();
        List<String> listOfLibrarians = new ArrayList<String>();

        HashMap<String, Book> mapper = new HashMap<String, Book>();
        HashMap <String, User> mapperUser = new HashMap<String, User>();
        HashMap <String, Librarian> mapperLibrarian = new HashMap<String, Librarian>();

        System.out.println("Welcome to the Library\nPlease choose who are you? Enter the number");
        System.out.println("\n1.User   \n2.Librarain");

        Scanner scanner = new Scanner(System.in);
        int mainCommand = scanner.nextInt();

        switch (mainCommand) {
            case 1 :
                System.out.println("I...\n1.Already have an account\n2.Don't have an account(create one)");
                int accountCommand = scanner.nextInt();
                switch (accountCommand) {
                    case 1 :
                        System.out.println("Enter your username and password");
                        String username = scanner.next();
                        String password = scanner.next();
                        if(listOfUsers.contains(username)) {
                            User value = mapperUser.get(username);
                            if (password.equals(value.getPassword())) {
                                System.out.println("welcome to the library " + username);
                                System.out.println("What do you want to do?\n1.rent a book\n2.return a book");
                                int bookCommand = scanner.nextInt();
                                switch (bookCommand) {
                                    case 1 :
                                        System.out.println("Enter name of the book you want to rent");
                                        String bookRent = scanner.next();
                                        Book valueBookRent = mapper.get(bookRent);
                                        if (valueBookRent.isRented()) {
                                            System.out.println(bookRent + " is rented");
                                            runMenu();
                                        }
                                        else {
                                            valueBookRent.setIsRented();
                                            listOfBooks.add(bookRent);
                                            System.out.println("Renting was successful");
                                            runMenu();
                                        }
                                        break;
                                    case 2 :
                                        System.out.println("Enter name of the book you want to return");
                                        String bookReturn = scanner.next();
                                        Book valueBookReturn = mapper.get(bookReturn);
                                        valueBookReturn.setIsRented();

                                        runMenu();
                                        break;
                                    default:
                                        System.out.println("Choose 1 or 2");
                                        runMenu();
                                }

                            }
                            else {
                                System.out.println("password is incorrect");
                                runMenu();
                            }
                        } else {
                            System.out.println(username + " doesn't exist in the library");
                            runMenu();
                        }
                        break;
                    case 2 :
                        lib.addUser();
                        runMenu();


                        break;
                }
            case 2 :
                System.out.println("Enter your username and your password");
                String username = scanner.next();
                String password = scanner.next();
                if (listOfLibrarians.contains(username)) {
                    Librarian value = mapperLibrarian.get(username);
                    if (password.equals(value.getPassword())) {
                        System.out.println("Welcome to the library " + username);
                        System.out.println("Which part do you want to go?\n1.Book\n2.User\n3.Librarain");
                        int librarian = scanner.nextInt();
                        switch (librarian) {
                            case 1 :
                                System.out.println("Do you want to ... \n1.add a book\n2.remove a book\n3.search a book\n4.update a book\n5.check if a book exist");
                                int  bookCommand = scanner.nextInt();
                                switch (bookCommand) {
                                    case 1 :
                                        lib.addBook();
                                        runMenu();
                                        break;

                                    case 2 :
                                        lib.removeBook();
                                        runMenu();
                                        break;

                                    case 3 :
                                        lib.searchBook();
                                        runMenu();
                                        break;

                                    case 4 :
                                        lib.updateBook();
                                        runMenu();
                                        break;

                                    case 5 :
                                        lib.doesBookExist();
                                        runMenu();
                                        break;

                                    default:
                                        System.out.println("choose from 1 to 5");
                                }

                                break;

                            case 2 :
                                System.out.println("Do you want to ... \n1.add a user\n2.remove a user\n3.search a user\n4.update a user\n5.check if a user exist");
                                int userCommand = scanner.nextInt();
                                switch (userCommand) {
                                    case 1 :
                                        lib.addUser();
                                        runMenu();
                                        break;

                                    case 2 :
                                        lib.removeUser();
                                        runMenu();
                                        break;

                                    case 3 :
                                        lib.searchUser();
                                        runMenu();
                                        break;

                                    case 4 :
                                        lib.updateUser();
                                        runMenu();
                                        break;

                                    case 5 :
                                        lib.doesUserExist();
                                        runMenu();
                                        break;

                                    default:
                                        System.out.println("choose from 1 to 5");
                                }
                                break;

                            case 3 :
                                System.out.println("Do you want to ... \n1.add a librarian\n2.remove a librarian\n3.search a librarian\n4.update a librarian\n5.check if a librarian exist");
                                int librarianCommand = scanner.nextInt();
                                switch (librarianCommand) {
                                    case 1 :
                                        lib.addLibrarian();
                                        runMenu();
                                        break;

                                    case 2 :
                                        lib.removeLibrarian();
                                        runMenu();
                                        break;

                                    case 3 :
                                        lib.searchLibrarian();
                                        runMenu();
                                        break;

                                    case 4 :
                                        lib.updateLibrarian();
                                        runMenu();
                                        break;

                                    case 5 :
                                        lib.doesLibrarianExist();
                                        runMenu();
                                        break;

                                    default:
                                        System.out.println("choose from 1 to 5");
                                }
                                break;

                            default:
                                System.out.println("choose from 1 to 3");
                                runMenu();
                        }
                    }
                    else {
                        System.out.println("Password is incorrect");
                        runMenu();
                    }
                }
                else {
                    System.out.println(username + " doesn't exist");
                    runMenu();
                }



                break;
            default:
                System.out.println("Choose 1 or 2");
                //run the menu again
        }


    }

}
