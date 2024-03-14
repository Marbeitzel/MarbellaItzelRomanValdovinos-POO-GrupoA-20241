
package mainn;

public class BankAccount {
    
    private long accountNumber;
    private double amount;
    private char type;

    public BankAccount(long accountNumber, char type) {
        if (type != 'A' && type != 'B' && type != 'C')
        {
            System.out.println("Tipo de cuenta no válido");
            return;
        }
        this.accountNumber = accountNumber;
        this.type = type;
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void agregarDinero(double amount) {
        if (type == 'A') agregarDineroA(amount);
        else if (type == 'B') agregarDineroB(amount);
        else this.amount += amount;
        
    }

    private void agregarDineroA(double amount) {
        if (this.amount + amount <= 50000) {
            this.amount += amount;
        } else {
            System.out.println("No puede tener más de 50,000 cuenta A");
        }
    }

    private void agregarDineroB(double amount) {
        if (this.amount + amount <= 100000) {
            this.amount += amount;
        } else {
            System.out.println("No puede tener más de 100,000 cuenta B");
        }
    }
}


