package maiin;

import java.util.ArrayList;
import java.util.Scanner;

public class Maiin {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        Bookshop user = new Bookshop();
        Bookshop books = new Bookshop();

        boolean flag = true;
        while (flag == true) {
            System.out.println("\nBIENVENIDOS AL SISTEMA DE LA LIBRERIA");
            System.out.println("Selecciona la opcion deseada");
            System.out.println("1: Registrar usuario");
            System.out.println("2: Registrar libro");
            System.out.println("3: Rentar libro");
            System.out.println("4: Listar usuarios registrados");
            System.out.println("5: Listar libros registrados");
            System.out.println("6: Listar usuarios que han rentado un libro");
            System.out.println("7: Listar libros no rentados");
            System.out.println("8. Listar libros rentados");
            System.out.println("9: Exit");

            System.out.println("Ingrese una opción");
            int option = leer.nextInt();

            switch (option) {
                case 1:
                    leer.nextLine();
                    System.out.println("Introduzca el nombre del usuario: ");
                    String name = leer.nextLine();
                    System.out.println("Introduzca la edad del usuario: ");
                    int age = leer.nextInt();
                    int id = (int) (Math.random() * 1000 + 1);
                    User usuario = new User(id, name, age);
                    users.add(usuario);
                    break;

                case 2:
                    leer.nextLine();
                    System.out.println("Introduzca el nombre del libro: ");
                    String nameBook = leer.nextLine();
                    System.out.println("Introduzca el autor del libro: ");
                    String author = leer.nextLine();
                    int idBook = (int) (Math.random() * 1000 + 1);
                    books.registerBook(idBook, nameBook, author);
                    break;

                case 3:
                    System.out.println("\n**USUARIOS**\n");
                    for (int i = 0; i < users.size(); i++) {
                        System.out.println(String.format("-> %s, Nombre: %s, id: %d, edad: %d",
                                i, users.get(i).getName(), users.get(i).getId(), users.get(i).getAge()));
                    }

                    System.out.println("Ingrese el id del usuario que va  a rentar el libro: ");
                    int userId = leer.nextInt();

                    for (int j = 0; j < users.size(); j++) {
                        if (users.get(j).getId() == userId) {
                            User usuarioRent = users.get(j);
                            books.listBook();
                            System.out.println("Ingrese el id del libro que desea rentar: ");
                            int BookId = leer.nextInt();
                            books.rentedBooks(BookId, usuarioRent);
                        }
                    }

                    break;

                case 4:
                    System.out.println("\n***USUARIOS***\n");
                    for (int i = 0; i < users.size(); i++) {
                          System.out.println(String.format("nombre: %s Edad: %d Id: %d",
                                  users.get(i).getName(),users.get(i).getAge(), users.get(i).getId()));
                    }
                    break;
                case 5:
                    System.out.println("\n***LIBROS***\n");
                    books.listBook();
                    break;
                case 6:
                    System.out.println("\n***USUARIOS QUE HAN RENTADO UN LIBRO***\n");
                    books.listusersRent();
                    break;
                case 7: 
                    System.out.println("***\nLIBROS NO RENTADOS\n****");
                    for (int i = 0; i < books.getBooks().size(); i++) {
                        Book libro = books.getBooks().get(i);
                        //System.out.println(libro.getName());
                        if(libro.getEsRentado() == false){
                            System.out.println("el libro "+libro.getName()+" no ha sido rentado");
                        }
                    }
                    break;
                case 8:
                    System.out.println("\n***LIBROS RENTADOS***\n");
                    books.listRentedBooks();
                    break;
                case 9:
                    flag = false;
                    break;

            }
        }

    }

}
