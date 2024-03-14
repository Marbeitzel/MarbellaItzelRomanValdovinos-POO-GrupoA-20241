class Bank:
    __name = ""
    __accounts = []
    
    def __init__(self, name) :
        self.__name = name
        self.__accounts = [] 

    def get_name(self)  :
        return self.__name
    
    def almacenar_cuentas( self, account_number ) :
        self.__accounts.append(account_number)

    def get_accounts (self) :      
        return self.__accounts
    
    def mostrar_cuentas(self) :
        print("\n**CUENTAS**\n")
        for i in range (0, len (self.__accounts)):
            print("{} : Numero de cuenta: {} tipo de cuenta: {}".format(i,self.__accounts[i].get_account_number(),self.__accounts[i].get_type()))
        print("\n")
        
    def mostrar_cuenta_en_especifico(self,  account_number) :
    
       for i in range (0, len (self.__accounts)) :
           print( self.__accounts[i].get_account_number()) 
           account = self.__accounts[i].get_account_number()
           if int(account) == int(account_number) :
               print("{} : Numero de cuenta: {} tipo de cuenta: {}".format(i,self.__accounts[i].get_account_number(),self.__accounts[i].get_type()))
 
               