
package mainn;
import java.util.ArrayList;
public class Employee {
    
    
    private String name;
    private String lastName;
    private BankAccount account;
    private ArrayList<BankAccount> accounts ;

    
    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
       
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }
    
    public void setAccount(BankAccount account) {
        this.account = account;
    }

   
    
    

    public void almacenarCuentas( BankAccount accountNumber )
     {
         accounts.add(accountNumber);
         
     }
    
     public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
    
    
    public void getData()
    {
        System.out.println(String.format("Nombre: %s",  name));
        //System.out.println(String.format("Total de cuentas: %d",accounts.size()));
        System.out.println(String.format("Total de cuentas: %d",accounts.size()));
        for (int i = 0; i < accounts.size(); i++)
        {
            
            
            System.out.println(String.format("Numero de cuenta: %d", getAccounts().get(i).getAccountNumber()));
            System.out.println(String.format("Saldo de la cuenta: %f", getAccounts().get(i).getAmount()));
            System.out.println(String.format("Tipo de cuenta %s",  getAccounts().get(i).getType()));
            System.out.println("");
        }        
    }
}
    



