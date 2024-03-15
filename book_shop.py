from book import Book
from book_rented import RentedBook

class Bookshop:
    def __init__(self):
        self.books = []
        self.books_rented = []

    def register_book(self, id, name, author):
        book = Book(id, name, author)
        self.books.append(book)
        print("Libro agregado")

    def list_books(self):
        print("\n**LIBROS**\n")
        for book in self.books:
            print(f"-> Nombre: {book.get_name_book()} id: {book.get_id_book()} Autor: {book.get_author()}")

    def get_rented_books(self):
        return self.books_rented

    def list_rented_books(self):
        for rented_book in self.books_rented:
            book = rented_book.get_book()
            print(f"El libro {book.get_name_book()} ESTA RENTADO")

    def list_users_rent(self):
        for rented_book in self.books_rented:
            user = rented_book.get_user()
            book = rented_book.get_book()
            print(f"nombre: {user.get_name()} Edad: {user.get_age()} Id: {user.get_id()}")
            print(f"Libro rentado nombre: {book.get_name_book()} Autor: {book.get_author()} Id: {book.get_id_book()}")

    def rent_book(self, user):
        print("\n***LIBROS DISPONIBLES PARA RENTAR***\n")
        available_books = []
        for book in self.books:
            if not book.get_is_rented():
                available_books.append(book)
        
        if not available_books:
            print("No hay libros disponibles para rentar en este momento.")
            return

        for book in available_books:
            print(f"ID: {book.get_id_book()}, Nombre: {book.get_name_book()}, Autor: {book.get_author()}")

        book_id = int(input("Ingrese el ID del libro que desea rentar: "))
        found_flag = False
        for book in self.books:
            if book_id == book.get_id_book():
                found_flag = True
                if book.get_is_rented():
                    print("ESE LIBRO NO ESTÁ DISPONIBLE, YA HA SIDO RENTADO")
                else:
                    book.set_is_rented(True)
                    rented_book = RentedBook(user, book)
                    self.books_rented.append(rented_book)
                    print("El libro ha sido rentado con éxito")
                break

        if not found_flag:
            print("LIBRO NO ENCONTRADO")