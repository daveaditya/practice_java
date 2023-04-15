class SavingsAccount {
	String owner;
	int acctNumber;
	int balance;
	BalanceChangeHandler[] subscribers;
	int numSubscribers;
	
	SavingsAccount(String o,int a) {
		owner = o;
		acctNumber = a;
		balance = 0;
		subscribers = new BalanceChangeHandler[20];
		numSubscribers = 0;
	}
	
	void addHandler(BalanceChangeHandler h) {
		if(numSubscribers < 20) {
			subscribers[numSubscribers] = h;
			numSubscribers++;
		}
	}
	
	void changeBalance(int amount) {
		if(amount!=0) {
			balance += amount;
			
			for(int i=0;i<numSubscribers;i++) {
				subscribers[i].balanceChanged(amount,this);
			}
		}
	}
	
	int getBalance() {
		return(balance);
	}
	
	int getAcctNumber() {
		return(acctNumber);
	}
	
	String getOwner() {
		return(owner);
	}
}

class FeeHandler implements BalanceChangeHandler {
	public void balanceChanged(int change, SavingsAccount acct) {
		System.out.println("Deducting a fee from account " + acct.getAcctNumber());
	}
}

class FraudHandler implements BalanceChangeHandler {
	public void balanceChanged(int change, SavingsAccount acct) {
		System.out.println("Checking for fraudulent withdrawal" + " of amount: " + change + " from" + " account " + acct.getAcctNumber());
	}
}

interface BalanceChangeHandler {
	void balanceChanged(int change,SavingsAccount acct);
}

class SavingsAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount acct = new SavingsAccount("Sam", 1234);
		FeeHandler feeHandler = new FeeHandler();
		FraudHandler fraudHandler = new FraudHandler();
		
		acct.addHandler(feeHandler);
		acct.addHandler(fraudHandler);
		
		acct.changeBalance(0);
		acct.changeBalance(10);
		acct.changeBalance(-10);
	}

}
