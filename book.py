class Book:
    def __init__(self, id_book, name_book, author):
        self._id_book = id_book
        self._name_book = name_book
        self._author = author
        self._is_rented = False

    def get_id_book(self):
        return self._id_book

    def set_id_book(self, value):
        self._id_book = value

    def get_name_book(self):
        return self._name_book

    def set_name_book(self, value):
        self._name_book = value

    def get_author(self):
        return self._author

    def set_author(self, value):
        self._author = value

    def get_is_rented(self):
        return self._is_rented

    def set_is_rented(self, value):
        self._is_rented = value