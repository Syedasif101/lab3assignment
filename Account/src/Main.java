import java.util.Scanner;

class Account{
	String name;
	int accNo;
	//String typeOfAccount;
	
	void getDetails(String n, int a) {
		name=n;
		accNo=a;
		System.out.println(name+" "+accNo);
		
	}
	
	class  Savingac  {
		void getbalance() {
			
		}
		void depositAmount() {
			
		}
		void WidrawAmount() {
			
		}
	
		
	}
	class Currentac {
		void getbalance() {
			
		}
		void depositAmount() {
			
		}
		void WidrawAmount() {
			
		}
		
	}
}
class Main{
	public static void main(String args[]) {
		Account A1=new Account();
		
		
		A1.getDetails("Syedasif", 3808);
		Account.Savingac in=A1.new Savingac();
		Scanner sc=new Scanner();
		System.out.println("Enter which type of account you got");
		
		
		
		
	}
}