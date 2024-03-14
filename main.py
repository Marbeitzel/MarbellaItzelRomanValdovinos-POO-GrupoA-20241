from employee import Employee
from bank_account import Bank_Account
from bank import Bank
flag = True
banks = []
employees = []
while flag ==True : 
    print ("BIENVENIDOS AL SISTEMA DEL BANCO")
    print ("Selecciona la opcion deseada")
    print ("1: Agregar usuario")
    print ("2: Agregar Banco")
    print ("3: Mostrar a todos los usuarios con su información")
    print ("4: Mostrar la información de algún usuario en específico")
    print ("5: Mostrar cuentas existentes")
    print ("6: Mostrar una cuenta en especifico")
    print ("7: Mostrar bancos existentes")
    print ("8. Agregar dinero a una cuenta")
    print ("9: Exit")
    
    option = input ("Ingresa la opcion: ")
    option = int(option)
    if option == 1:
        if len(banks) == 0 :
                print("LISTA DE BANCOS VACIA, PRIMERO AGREGUE UN BANCO ")
                continue
        bank_acount = 0
        accounts = []
        name = input ("Introduzca el nombre del empleado: ")
        last_name = input ("Introduzca el apellido del empleado: ")
        number_accounts = int(input (" Cuantas cuentas desea crear para el usuario? "))
        
        for i in range (0,number_accounts) :
            account_number = input ("Introduzca el numero de cuenta del empleado: ")
            type = input ("Introduzca el tipo de cuenta (A, B, C) del empleado: ")
            for bank_index in range (0, len(banks)) :
                print ("{} -> banco: {}".format(bank_index, banks[bank_index].get_name()))
            bank =input ("A que banco pertenece el numero de cuenta?: ")
            bank =int (bank)
            if bank < 0 or bank >= len (banks) :
                print ("Banco invalido")
                break
            
            bank_acount = Bank_Account(account_number, type)
            banks[bank].almacenar_cuentas(bank_acount)
            print(banks[bank].get_name())
            accounts.append(bank_acount)
        if bank_acount == 0:
            continue
        employee = Employee(name, last_name,  accounts)
    
        employees.append (employee)
        print (format("Usuario {} agregado".format(name)))
        employee.get_Data()
        
    elif option == 2:
        bank_name = input ("Introduzca el nombre del banco:")
        bank = Bank (bank_name)
        banks.append (bank)
        print ('Banco {} agregado'.format(bank_name))
    
    elif option == 3: 
        for i in range (0, len(employees)) :
            print (employees[i].get_Data())
    
    elif option == 4 :
        for i in range (0, len (employees)):
            print ("{} : {} ".format(i, employees[i].get_name()))
        account_number = int(input ("Introduce el numero deseado a ver"))
        
        if account_number < 0 or account_number >= len(employees):
            print ("USUARIO INVALIDO")
            continue
        
        print (employees[account_number].get_Data())
    
    elif option == 5:
        for i in range (0, len (banks))  :
            print ( "BANCO {} : {} " .format(i,banks[i].get_name() ))
            banks[i].mostrar_cuentas()
    
    elif option == 6:
        for i in range (0, len (banks)) :
            print ("{} : {} " .format(i,banks[i].get_name()))
            
        bank =int(input ("Introduce el numero deseado a ver"))
        
        if (bank < 0 or bank >= len (banks)) :
            print ("BANCO INVALIDO")
            continue
        if(len (banks[bank].get_accounts()) == 0 ):
            print("este banco no tiene cuentas asociadas")
            continue
        
        for i in range (0, len (banks[bank].get_accounts())) :
            print (banks[bank].get_accounts()[i].get_account_number())
        idAccount = int(input ("Introduce el numero de cuenta a mostrar "))
        banks[bank].mostrar_cuenta_en_especifico(idAccount)
    
    elif option == 7:
        if len (banks) == 0 :
            print ("LISTA DE BANCOS ESTA VACIA")
            continue
        
        for i in range (0, len (banks)):
            print ("banco {}".format(i)+": "+banks[i].get_name())
    
    elif option == 8: 
        if len(employees) == 0:
            print("no existen usuarios registrados ")
            continue
        print("Usuarios disponibles:")
        for i in range(0, len(employees)):
            print(f"{i}: {employees[i].get_name()} {employees[i].get_last_Name()}")
 
        user_choice = int(input("Seleccione el número de usuario al que desea agregar dinero: "))

        if user_choice < 0 or user_choice > len(employees)-1: 
            print("ERROR: Selección de usuario no válida.")
            continue
        
        selected_employee = employees[user_choice]

        print("Cuentas del usuario:")
        selected_employee.get_Data()

        account_number = input("Introduzca el número de cuenta del empleado: ")
        amount = float(input("¿Cuánto dinero desea agregar? "))

        account_found = False
        for account in selected_employee.get_accounts():
            if account.get_account_number() == account_number:
                account.agregar_dinero(amount)
                print("Se ha agregado {} a la cuenta {}".format(amount, account_number))
                print("Nuevo saldo de la cuenta:", account.get_amount())
                account_found = True
                break

        if not account_found:
            print("ERROR: No se encontró la cuenta.")
     
            

    else :
        flag = False 
        break

        