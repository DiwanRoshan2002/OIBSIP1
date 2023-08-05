package basicjava;

import java.util.Scanner;

public class atm_interface {
public static void main(String[] args) {
	double choice;
	double withdraw;
	double deposit;
	double remaining_balance;
	char yn;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("________ATM_______");
		System.out.print("Enter your UserId: ");
		String id =sc.next();
		System.out.print("Enter your UserPin: ");
		 String pin =sc.next();
		if(id.equals("Roshan")   && pin.equals("690")) {
			
			System.out.println("****Valid Details****");
			System.out.println("UserName: "+id+"\nUserPin: "+pin);
			double checkbalance=50000;
				
			do {
				System.out.println("-------MENU-----");
				System.out.println("1.check Balanace \n2.Withdraw \n3.Deposit \n4.Quit");
				System.out.println("");
				System.out.print("Enter your choice:");
				 choice=sc.nextInt();
			
			
			
				if(choice==1) {
					System.out.println("Current Balance: "+checkbalance);
				}
				else if(choice==2){
					System.out.println("Enter the withdraw amount:");
					withdraw=sc.nextDouble();
					if(withdraw>checkbalance) {
						System.out.println("Unsufficient Funds");
					}else if(withdraw<=checkbalance) {
						remaining_balance=(checkbalance-withdraw);
						checkbalance=remaining_balance;
						System.out.println("The remaining balance is: "+remaining_balance);
						System.out.println("The withdrawl Request "+withdraw+"successfully processed");
					}
				}else if(choice==3) {
					System.out.println("Enter the Deposit amount:");
					deposit=sc.nextDouble();
					System.out.println("The amount has been deposited:"+deposit);
					System.out.println("The current balance is: "+(checkbalance+deposit));
				}else {
					System.out.println("thank you for visiting the atm");
				}
				
				System.out.println("do you want to continue y/n");
				yn=sc.next().charAt(0);
			}while (yn=='Y'|| yn=='y');
		
		
		}else {
			System.err.println("-!----Invalid details-----!");
		}
	} while (true);

}
}
	