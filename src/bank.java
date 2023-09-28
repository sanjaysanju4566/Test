
public class bank {
	static int currentbalance = 1000;
public static void greetcustomer() {
	System.out.println("hello customer welcome to the bank");
}
public  static void deposit(int amount) {
	currentbalance = currentbalance + amount;
	System.out.println("Amount deposited successfully");
}
public  static void withdrawl(int amount) {
	currentbalance = currentbalance - amount;
	System.out.println("Amount withdrawn successfully");
}
public int getcurrentbalance() {
	return currentbalance;
	
}

public static void main(String[] args) {
greetcustomer();
bank Bank = new bank();
 bank.deposit(500);
 bank.deposit(currentbalance);
 bank.withdrawl(currentbalance);
 


}
}

