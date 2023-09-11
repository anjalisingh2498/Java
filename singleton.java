package prg7;

class AccountDetails {
	private String accountHolder;
	private int accountNumber;
	private int balance;
	
	private static AccountDetails acc;
	private AccountDetails(String name, int no, int bal) {
		this.accountHolder = name;
		this.accountNumber = no;
		this.balance = bal;
	}
	public static AccountDetails getInstance(String name, int no, int bal) {
		if(acc == null) {
			synchronized(AccountDetails.class) {
				if(acc == null) {
					acc = new AccountDetails(name, no, bal);
				}
			}
		}
		return acc;
	}
	public String getName() {
		return accountHolder;
	}
	public int getNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
}

public class Singleton {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				AccountDetails det1 = AccountDetails.getInstance("abc", 1250, 500);
				System.out.println("AccName:" + det1.getName());
				System.out.println("AccNo:" + det1.getNumber());
				System.out.println("Balance:" + det1.getBalance());		
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				AccountDetails det2 = AccountDetails.getInstance("xyz", 1135, 1000);
				System.out.println("AccName:" + det2.getName());
				System.out.println("AccNo:" + det2.getNumber());
				System.out.println("Balance:" + det2.getBalance());		
			}
		});
		t1.start();
		t2.start();
	}
}
