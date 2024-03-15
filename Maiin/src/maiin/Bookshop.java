package maiin;

import java.util.ArrayList;

public class Bookshop {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<RentedBook> booksRented = new ArrayList<>();
    public ArrayList<Book> getBooks (){
        return books;
    }
    public void registerBook(int id, String name, String author) {
        Book book = new Book(id, name, author);
        books.add(book);
        System.out.println("Libro agregado ");
    }

    public void listBook() {
        System.out.println("\n**LIBROS**\n");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(String.format("-> Nombre: %s id: %d Autor: %s",
                    books.get(i).getName(), books.get(i).getIdBook(), books.get(i).getAuthor()));
        }
    }

    public ArrayList<RentedBook> getRentedBooks() {
        return booksRented;
    }

    public void listRentedBooks() {
        for (int i = 0; i < booksRented.size(); i++) {
            Book libro = booksRented.get(i).getBook();
            System.out.println("El libro " + libro.getName()+ " ESTA RENTADO");

        }
    }

    public void listusersRent() {
        for (int i = 0; i < booksRented.size(); i++) {
            User usuario = booksRented.get(i).getUser();
            System.out.println(String.format("nombre: %s Edad: %d Id: %d",
             usuario.getName(),usuario.getAge(), usuario.getId()));
        }

    }

    public void rentedBooks(int bookId, User user) {
        boolean foundFlag = false;
        for (int i = 0; i < books.size(); i++) {
            if (bookId == books.get(i).getIdBook()) {

                foundFlag = true;
                if (books.get(i).getEsRentado() == true) 
                {
                    System.out.println("ESE LIBRO NO ESTA DISPONIBLE, YA HA SIDO RENTADO");

                    break;
                } 
                else {
                    books.get(i).setEsRentado(true);
                    Book book = books.get(i);
                    RentedBook rentedBook = new RentedBook(user, book);
                    booksRented.add(rentedBook);
                    System.out.println("El libro ha sido rentado con exito");
                    break;
                }
            } else {
                foundFlag = false;
            }
        }

        if (foundFlag == false) {
            System.out.println("LIBRO NO ENCONTRADO");
        }

    }
}//llave main

