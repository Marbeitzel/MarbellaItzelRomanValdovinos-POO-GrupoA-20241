from user import User
from book_shop import Bookshop
import random

def main():
    users = []
    books = Bookshop()

    while True:
        print("\nBIENVENIDOS AL SISTEMA DE LA LIBRERIA")
        print("Selecciona la opcion deseada")
        print("1: Registrar usuario")
        print("2: Registrar libro")
        print("3: Rentar libro")
        print("4: Listar usuarios registrados")
        print("5: Listar libros registrados")
        print("6: Listar usuarios que han rentado un libro")
        print("7: Listar libros no rentados")
        print("8: Listar libros rentados")
        print("9: Exit")

        option = int(input("Ingrese una opción: "))

        if option == 1:
            name = input("Introduzca el nombre del usuario: ")
            age = int(input("Introduzca la edad del usuario: "))
            user_id = random.randint(1, 1000)  # Generar ID único aleatorio
            usuario = User(user_id, name, age)
            users.append(usuario)

        elif option == 2:
            name = input("Introduzca el nombre del libro: ")
            author = input("Introduzca el autor del libro: ")
            book_id = random.randint(1, 1000)  # Generar ID único aleatorio
            books.register_book(book_id, name, author)

        elif option == 3:
            print("\n**USUARIOS**\n")
            for user in users:
                print(f"-> {user.get_name()}, Nombre: {user.get_name()}, id: {user.get_id()}, edad: {user.get_age()}")

            user_id = int(input("Ingrese el id del usuario que va a rentar el libro: "))
            for user in users:
                if user.get_id() == user_id:
                    usuario_rent = user
                    
                    books.rent_book( usuario_rent)
                    break
            else:
                print("Usuario no encontrado.")

        elif option == 4:
            print("\n***USUARIOS***\n")
            for user in users:
                print(f"nombre: {user.get_name()} Edad: {user.get_age()} Id: {user.get_id()}")

        elif option == 5:
            print("\n***LIBROS***\n")
            books.list_books()

        elif option == 6:
            print("\n***USUARIOS QUE HAN RENTADO UN LIBRO***\n")
            books.list_users_rent()

        elif option == 7:
            print("\n***LIBROS NO RENTADOS***\n")
            for book in books.books:
                if not book.get_is_rented():
                    print(f"el libro {book.get_name_book()} no ha sido rentado")

        elif option == 8:
            print("\n***LIBROS RENTADOS***\n")
            books.list_rented_books()

        elif option == 9:
            break

if __name__ == "__main__":
    main()

