public class Book {
    private String name;
    private float price;
    private String author;

    public Book() {
    }

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Name book: " + name +"\t"+ " Price: "+price+"\t" + " Author: "+author;
    }
}
