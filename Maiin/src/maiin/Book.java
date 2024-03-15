
package maiin;
import java.util.ArrayList;
import java.util.Random;
public class Book {
    private int idBook = (int)(Math.random()*0+1000);
    private String nameBook;
    private String author;
    private boolean esRentado = false;

    public Book(int idBook, String nameBook, String author) {
        this.idBook = (int)(Math.random()*1000+1);
        this.nameBook = nameBook;
        this.author = author;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int id) {
        this.idBook = idBook;
    }

    public String getName() {
        return nameBook;
    }

    public void setName(String name) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String autor) {
        this.author = autor;
    }

    public boolean getEsRentado() {
        return esRentado;
    }

    public void setEsRentado(boolean esRentado) {
        
        this.esRentado = esRentado;
    }
    
}
