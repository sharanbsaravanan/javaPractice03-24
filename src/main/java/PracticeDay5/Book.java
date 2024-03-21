package PracticeDay5;
/*Define a class named Book with attributes
title, author, and price. Implement methods
to get and set these attributes.

*/
public class Book {
    private  String title,author;
    private  Double price;

    public Book(String title, String author, Double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Double getPrice(){
        return price;
    }
        public void setTitle(String title){
        this.title=title;
        }
    public void setAuthor(String author){
        this.author= author;
    }
    public void setPrice(Double price){
        this.price=price;
    }

    public static void main(String[] args) {
        Book book = new Book("Elect a Clown,Expect a Circus" , "Unknown" , 999.99);
        System.out.println("Title : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("price : " + book.getPrice());
    }

}
