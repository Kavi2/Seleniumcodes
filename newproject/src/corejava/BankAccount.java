package corejava;

public class BankAccount {

	long AccountNumber=1234567890l;
    String Holdername="Balu";
    Integer accountBalance=350;
    
    public Integer  accountBalance() {
    
    	return accountBalance;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account= new BankAccount();
        Integer Mybalance= account.accountBalance();
    	System.out.println("Account Balance is:" +Mybalance);
        
	}

}
