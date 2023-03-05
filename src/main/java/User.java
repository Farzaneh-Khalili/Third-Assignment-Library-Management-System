import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    List<String> rentedBooks = new ArrayList<>();
    public void setUsername(String newUsername) {
        username = newUsername;
    }
    public void setPassword(String newPassword) {
        password = newPassword;
    }
    public void rentBook(String book){
       rentedBooks.add(book);
    }

    public void returnBook(String book){
        rentedBooks.remove(book);
    }
}
