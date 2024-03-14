class Employee:
     __name = ""
     __last_name = ""
     __accounts = []
     
     def __init__(self, name,  last_name,  accounts) :
     
        self.__name = name
        self.__last_name = last_name
        self.__accounts = accounts
        
     def  get_name(self) :
        return self.__name


     def get_last_Name(self) :
        return self.__last_name
     
     def get_accounts(self):
        return self.__accounts
    
     def get_Data(self):
         print("Nombre: "+self.__name)
         print("Total de cuentas: {}".format(len(self.__accounts)))
         for account in self.__accounts:
            print("  - Número de cuenta: {}".format(account.get_account_number()))
            print("    Saldo de la cuenta: {}".format(account.get_amount()))
            print("    Tipo de cuenta: {}".format(account.get_type()))
