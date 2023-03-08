public class Librarian {
    /*
    * The librarian should have a username and a password
    * The librarian should be able to search users, librarians and books
    * The librarian should be able to add\remove,update user add\remove,update_
    _ librarian and add\remove,update book
     */
    private String username;
    private String password;

    public Librarian(String username) {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
