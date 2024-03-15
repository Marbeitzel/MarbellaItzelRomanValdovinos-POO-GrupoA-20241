class RentedBook:
    def __init__(self, user, book):
        self._user = user
        self._book = book

    def get_user(self):
        return self._user

    def set_user(self, user):
        self._user = user

    def get_book(self):
        return self._book

    def set_book(self, book):
        self._book = book