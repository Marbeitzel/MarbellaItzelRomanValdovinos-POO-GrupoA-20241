
package homework7;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
     public void almacenarCuentas( BankAccount bankAccount )
     {
         accounts.add(bankAccount);
         
     }

    public ArrayList<BankAccount> getAccounts() 
    {
        return accounts;
    }
    
    public void mostrarCuentas()
    {
        System.out.println("\n**CUENTAS**\n");
        for (int i= 0; i<accounts.size(); i++ )
        {
            System.out.println(i+": " + "Numero de cuenta: " +accounts.get(i).getAccountNumber() +" tipo de cuenta: " + accounts.get(i).getType());
        }
        
    }
    
    public void mostrarCuentaEnEspecifico(long accountNumber)
    {
       for (int i= 0; i<accounts.size(); i++ )
       {
           long account = accounts.get(i).getAccountNumber();
           if (account == accountNumber)
           {
               System.out.println(i+": " + "Numero de cuenta: " +accounts.get(i).getAccountNumber() +" tipo de cuenta: " + accounts.get(i).getType());
           }
       }
    }
    
}
