package be.odisee.bank;

import java.util.ArrayList;

/* Dit is nog de oude Bank met aggregatie. Hier kan je wel nog aan */
public class Bank {

    private final ArrayList<Account> accounts = new ArrayList<Account>();

    public void openAccount(Account account){
        if(!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    private int numAccounts(){
        return accounts.size();
    }

    public void closeAccount(final Account account){
        accounts.remove(account);
    }


    public String toString() {
        String str=String.format("Bank managing %d accounts:\n",numAccounts());
        for (Account account : accounts) {
            str+=account.toString()+"\n";
        }
        return str;
    }

    public static void main(String[] args) {
        //Hoe een Bank met composition zou gebruikt kunnen worden
        Bank myBank=new Bank();
/*        myBank.openAccount();
        myBank.openAccount();
        myBank.openAccount();
        myBank.withdraw(1,20); //should print Cannot withdraw money that is not present
*/
        System.out.println(myBank.toString()); //should print 3 accounts with 0 balance
    }
}
