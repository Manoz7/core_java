
public class BankAccount {

	static String bankName = "Nepal Bank Limited";
	String accountHoldersName;
	String accountNumber;
	float balance;

	public static void main(String[] args) {
		System.out.println(BankAccount.bankName);

		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHoldersName = "John Cena";
		bankAccount.accountNumber = "1234567890123";
		bankAccount.balance = 2015f;

		System.out.println(bankAccount.accountHoldersName);
		System.out.println(bankAccount.accountNumber);
		System.out.println(bankAccount.balance);
	}

}
