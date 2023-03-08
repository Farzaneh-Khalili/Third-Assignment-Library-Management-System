import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;

    /*public User(String username, String password) {
        this.username = username;
        this.password = password;
    }*/

    List<String> rentedBooks = new ArrayList<>();

    public User(String username) {

    }

    public void setUsername(String newUsername) {
        username = newUsername;
    }
    public void setPassword(String newPassword) {
        password = newPassword;
    }
    public void rentBook(String book){

       rentedBooks.add(book);
    }
    public String getPassword() {
        return password;
    }

    public void returnBook(String book){
        rentedBooks.remove(book);
    }
}
