
package homework7;
import java.util.ArrayList;
import java.util.Scanner;
public class Homework7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Bank> banks = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();

        boolean flag = true;
        while (flag == true) {
            System.out.println("\nBIENVENIDOS AL SISTEMA DEL BANCO");
            System.out.println("Selecciona la opcion deseada");
            System.out.println("1: Agregar usuario");
            System.out.println("2: Agregar Banco");
            System.out.println("3: Mostrar a todos los usuarios con su información");
            System.out.println("4: Mostrar la información de algún usuario en específico");
            System.out.println("5: Mostrar cuentas existentes");
            System.out.println("6: Mostrar una cuenta en especifico");
            System.out.println("7: Mostrar bancos existentes");
            System.out.println("8. Agregar dinero a una cuenta");
            System.out.println("9: Exit");

            System.out.println("Ingrese una opción");
            int option = leer.nextInt();

            switch (option) {
                case 1:
                    if (banks.size() == 0) {
                        System.out.println("LISTA DE BANCOS ESTA VACIA, AGREGUE UN BANCO PRIMERO");
                        break;
                    }
                    leer.nextLine();
                    System.out.println("Introduzca el nombre del empleado: ");
                    String name = leer.nextLine();
                    System.out.println("Introduzca el apellido del empleado: ");
                    String lastName = leer.nextLine();
                    System.out.println("¿Cuantas cuentas desea crear para el usuario?");
                    int numberAccounts = leer.nextInt();
                    char valornulo = 'A';

                    Employee employee = new Employee(name, lastName);

                    for (int i = 0; i < numberAccounts; i++) 
                    {

                        System.out.println("Introduzca el numero de cuenta del empleado: ");
                        long accountNumber = leer.nextLong();
                        System.out.println("Introduzca el tipo de cuenta (A, B, C) del empleado: ");
                        char type = leer.next().charAt(0);
                        for (int j = 0; j < banks.size(); j++) {
                            System.out.println(String.format("-> %s, banco: %s", j, banks.get(j).getName()));
                        }
                        System.out.println("A que banco pertenece el numero de cuenta?");
                        int indexbank = leer.nextInt();
                        if (indexbank < 0 || indexbank > banks.size()) {
                            System.out.println("Banco invalido");
                            break;
                        }

                        BankAccount bankAccount = new BankAccount(accountNumber, type);
                        banks.get(indexbank).almacenarCuentas(bankAccount);
                        System.out.println(banks.get(indexbank).getName());
                        employee.almacenarCuentas(bankAccount);
                    }
                    System.out.println("Usuario agregado ");
                    employee.getData();
                    employees.add(employee);
                    break;

                case 2:
                    System.out.println("Introduzca el nombre del banco");
                    leer.nextLine();
                    String bankName = leer.nextLine();
                    Bank bank = new Bank(bankName);
                    banks.add(bank);
                    System.out.println(String.format("Banco %s, agregado", bankName));
                    break;

                case 3:
                    System.out.println("**USUARIOS**");
                    for (int i = 0; i < employees.size(); i++) 
                    {
                        employees.get(i).getData();

                    }
                    break;

                case 4:
                    for (int i = 0; i < employees.size(); i++) 
                    {
                        System.out.println(String.format("%s: %s ", i, employees.get(i).getName()));
                    }
                    System.out.println("Introduce el numero deseado a ver");
                    int id = leer.nextInt();
                    if (id < 0 || id > employees.size()) {
                        System.out.println("USUARIO INVALIDO");
                        break;
                    }
                    System.out.println("Información del usuario");
                    employees.get(id).getData();

                    break;

                case 5:
                    for (int i = 0; i < banks.size(); i++) 
                    {
                        System.out.println(i + ": " + banks.get(i).getName());
                        banks.get(i).mostrarCuentas();
                    }

                    break;

                case 6:
                    for (int i = 0; i < banks.size(); i++) 
                    {
                        System.out.println(i + ": " + banks.get(i).getName());
                    }
                    System.out.println("Introduce el numero deseado a ver");
                    int idbank = leer.nextInt();
                    if (idbank < 0 || idbank > banks.size())
                    {
                        System.out.println("BANCO INVALIDO");
                        break;
                    }
                    for (int i = 0; i < banks.get(idbank).getAccounts().size(); i++)
                    {
                        System.out.println(banks.get(idbank).getAccounts().get(i).getAccountNumber());
                    }
                    System.out.println("Introduce el numero de cuenta a mostrar ");
                    int idAccount = leer.nextInt();
                    banks.get(idbank).mostrarCuentaEnEspecifico(idAccount);
                    break;

                case 7:
                    if (banks.size() == 0) 
                    {
                        System.out.println("LISTA DE BANCOS ESTA VACIA");
                        break;
                    }
                    for (int i = 0; i < banks.size(); i++) 
                    {
                        System.out.println(banks.get(i).getName());
                    }
                    break;

                case 8:
                    if (employees.size() == 0) 
                    {
                        System.out.println("NO EXISTEN USUARIOS REGISTRADOS");
                        break;
                    }
                    System.out.println("Usuarios disponibles: ");
                    for (int i = 0; i < employees.size(); i++) 
                    {
                        System.out.println(String.format("Informacion de los usuarios: \n-> %s ", i));
                        employees.get(i).getData();
                    }
                    System.out.println("Seleccione el número de usuario al que desea agregar dinero:");
                    int userChoice = leer.nextInt();
                    if (userChoice < 0 || userChoice > employees.size() - 1) 
                    {
                        System.out.println("ERROR: Selección de usuario no válida.");
                        break;
                    }
                    Employee selectedEmployee = employees.get(userChoice);
                    System.out.println("Cuentas del usuario: ");
                    selectedEmployee.getData();

                    System.out.println("Introduzca el numero de cuenta del empleado");
                    long accountNumber = leer.nextInt();
                    System.out.println("Cuando dinero desea agregar?");
                    double amount = leer.nextInt();

                    for (int i = 0; i < employees.size(); i++)
                    {

                        for (int j = 0; j < employees.get(i).getAccounts().size(); j++) 
                        {

                            if (employees.get(i).getAccounts().get(j).getAccountNumber() == accountNumber) 
                            {
                                employees.get(i).getAccounts().get(j).agregarDinero(amount);
                                System.out.println(employees.get(i).getAccounts().get(j).getAmount());
                                System.out.println(String.format("Se ha agregado %f a la cuenta %d", amount, accountNumber));
                            }
                        }

                    }

                    break;
                case 9:
                    flag = false;
                    break;
            }

        }
    }

        
    }
    

