class Bank_Account:
     __account_number = 0
     __amount = 0
     __type = ""
     
     def __init__(self, account_number, type) :
        if type != 'A' and type != 'B' and type != 'C' :
        
            return print("Tipo de cuenta no válido")
        
        self.__account_number = account_number
        self.__type = type
    
     def get_account_number(self) :
        return self.__account_number

     def get_type(self): 
        return self.__type

     def get_amount(self) :
        return self.__amount
    
     def agregar_dinero(self, amount) :
        if type == 'A' :
         self.agregar_dineroA(amount)
        elif type == 'B' :
         self.agregar_dineroB(amount)
        else :
         self.__amount += amount

     def agregar_dineroA(self, amount) :
        if self.__amount + amount <= 50000 :
            self.__amount += amount
        else :
            print("No puede tener más de 50,000 cuenta A")
        
     def agregar_dineroB(self, amount) :
        if self.__amount + amount <= 100000 :
            self.__amount += amount
        else: 
           print("No puede tener más de 100,000 cuenta B")