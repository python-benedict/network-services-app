import java.util.Scanner;
public class final_airtime_purchase {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to our data purchase service");
        System.out.println("\n");
        System.out.println("Please select one (1) for vodafone and two (2) for MTN");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\n");

        Scanner value 	= 	new Scanner(System.in);
        Scanner value2 	= 	new Scanner(System.in);
        Scanner value3 	= 	new Scanner(System.in);
        Scanner value4  = 	new Scanner(System.in);
        Scanner value5  = 	new Scanner(System.in);
        Scanner phoneNumber = new Scanner (System.in);
        Scanner amount 	= 	new Scanner(System.in);
        Scanner Reference = new Scanner(System.in);
        Scanner pin 	=   new Scanner(System.in);


          
        int value1 = value.nextInt();
        if (value1 == 1){
            System.out.println("Thanks for selecting, the MTN service portal has been activated for you, enter your purchase code to continue ");
         

        }else if(value1 == 2){
            System.out.println("Thanks for selecting, the Vodafone service portal has been activated for you, enter your purchse code to continue");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            
            int code = value2.nextInt();
            if (code == 110){
                System.out.println("1. Send Money");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Buy Airtime Or Data");
                System.out.println("4. Make Payments");
                System.out.println("5. Financial Services");
                System.out.println("6. My Account");
                System.out.println("7. Self Service");
                
                int code1 = value3.nextInt();
                if (code1 == 1) {
                	System.out.println("1. Vodafone Network");
                	System.out.println("2. Other Networks");
                	System.out.println("3. To Bank Account");
                	System.out.println("4. E-zwich");
                	System.out.println("5. From Linked Bank Account");
                	System.out.println("6. To Unregistered");
                	
                	int code2 = value4.nextInt();
                	if (code2 == 1) {
                		System.out.println("1. To enter recipient number");
                		System.out.println("2. My List");
                		
                		
                		int code3 = value5.nextInt();
                		if (code3 == 1) {
                			System.out.println("Enter Recipient Phone Number Here: ");
                			int phoneNumber1 = phoneNumber.nextInt();
                			if (phoneNumber1 == 546873228) {
                				System.out.println("Enter Amount: ");
                				
                				int amount1 = amount.nextInt();
                				if (amount1 == 5) {
                					System.out.println("Enter Reference ");
                					
                					int Reference1 = Reference.nextInt();
                					if (Reference1 == 123) {
                						System.out.println("Enter Pin");
                						
                						
                						int pin1 = pin.nextInt();
                						if (pin1 == 2002) {
                							System.out.println("Congratulations you have succesfully send GH"+ amount1 + " to " + " Osei Sefa Benedict. Your current balance is ... ");
                						}
                					}
                				}
                			}else {
                				System.out.println("only 546873228 is working as a contact");
                			}
                		}
                		
                	}else if (code2 == 2) {
                		System.out.println("1. MTN");
                		System.out.println("2. AirtelTigo");
                		System.out.println("3. G-Money");
                		System.out.println("4. ZeePay");
                		System.out.println("5. YUP");
                		System.out.println("6. GhanaPay");
                	}else if (code2 == 3) {
                		System.out.println("Select Your Bank Starting With Alphabet");
                		System.out.println("1. A - D");
                		System.out.println("2. E - F");
                		System.out.println("3. G - R");
                		System.out.println("4. S - Z");
                	}else if (code2 == 4) {
                		System.out.println("Enter Account Number: ");
                	}else if(code2 ==5) {
                		System.out.println("Select Your Bank Starting With Alphabet");
                		System.out.println("1. A - D");
                		System.out.println("2. E - F");
                		System.out.println("3. G - R");
                		System.out.println("4. S - Z");
                	}else if (code2 == 6) {
                		System.out.println("A voucher will be generated for withdrawal at an Agent Point by the receiver");
                		System.out.println("My List");
                	}
                	
                }else if (code1 == 2) {
                	System.out.println("From Agent");
                	System.out.println("From ATM");
                }else if(code1 == 3) {
                	System.out.println("1. Buy Airtime");
                	System.out.println("2. Buy Data / 2 Moorch");
                	System.out.println("3. Special Offers");
                }else if(code1 == 4) {
                	System.out.println("1. Pay Bill");
                	System.out.println("2. Buy Goods");
                	System.out.println("3. Fun and Games");
                	System.out.println("4. Generate Voucher");
                	System.out.println("5. My List");
                	System.out.println("6. Pay Small Small");
                	System.out.println("7. Donations");
                	System.out.println("8. Complete Payment / Transaction");
                	System.out.println("9. Schemes");
                	System.out.println("10. School payments");
                }else if (code1 == 5) {
                	System.out.println("Insurance");
                	System.out.println("Pensions");
                	System.out.println("Loans");
                	System.out.println("Overdraft");
                	System.out.println("Savings");
                	System.out.println("Investments");
                	System.out.println("Bank Services");
                }else if (code1 == 6) {
                	System.out.println("Check Balance");
                	System.out.println("My Statements");
                	System.out.println("Change pin");
                	System.out.println("Account Information");
                	System.out.println("My List");
                	System.out.println("Help");
                	System.out.println("Self-Service");
                }else if (code1 == 7) {
                	System.out.println("Reset Pin");
                	System.out.println("Self-Reversal");
                }
            }else {
            	System.out.println("Sorry, *110# is the only code working for vodafone now");
            }
        }else{
            System.out.println("SORRY! the entered value does not match any");
        }
        
    }
}
















