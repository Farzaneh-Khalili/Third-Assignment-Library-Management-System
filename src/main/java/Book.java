public class Book {

    private String name;
    private String author;
    private int pages;
    private int price;
    private int yearOfPublish;
    private int ISBN;
    private boolean isRented = false;

    public Book(String name) {

    }

    /*public Book(String name, String author, int pages, int price, int yearOfPublish, int ISBN) {

        this.author = author;
        this.name = name;
        this.pages = pages;
        this.price = price;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;

     }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean isRented() {
        return isRented;
    }

    //setIsRented for changing the situation of the book(it is rented or not)
    public void setIsRented() {
        isRented = !isRented;
    }
}
