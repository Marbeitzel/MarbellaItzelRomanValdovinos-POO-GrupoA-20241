class User:
    def __init__(self, id, name, age):
        self._id = id
        self._name = name
        self._age = age
 
    def get_id(self):
        return self._id

    def set_id(self, value):
        self._id = value

    def get_name(self):
        return self._name

    def set_name(self, value):
        self._name = value

    def get_age(self):
        return self._age

    def set_age(self, value):
        self._age = value