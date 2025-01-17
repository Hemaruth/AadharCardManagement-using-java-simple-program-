import java.util.*;

public class Main  {
	static long contactU;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		boolean flag = false;
	
		AadharDetail2[] a1= {
				AadharDetail2.getAadhar("person 1", "08-01-2002", 908062683, 1126601012, "Thiruvallur,TN"),
				AadharDetail2.getAadhar("person 3", "04-08-2001", 1234567890, 1126601012, "chennai,TN"),
				AadharDetail2.getAadhar("person 2", "18-12-2004", 908062683, 1126601012, "Thiruchy,TN"),
				AadharDetail2.getAadhar("person 4", "21-03-2002", 908062683, 1126601012, "Arakkonam,TN"),
				AadharDetail2.getAadhar("person 5", "30-12-2003", 908062683, 1126601012, "tirutanni,TN")
		};
		
		boolean web_page = true;
		do {
			System.out.println("\t\t\tWelcome To Aadhar Web Portal");
			System.out.println("Choose the option\n1.SignIn\n2.logout");

			switch (sc.nextInt()) {
			case 1: {
				System.out.println("To Sign In enter your contact number");
				contactU = sc.nextLong();
				for(int i=0;i<a1.length;i++) {
					 if (contactU == a1[i].getcontact()) {
	                        flag = true;
	                        a1[i].UI(); 
	                        break; 
	                    }
				}
				
				break;
			}
			case 2:
				web_page = false;
			}
		} while (web_page);
		Thread.sleep(2000);
		System.out.println("THANK YOU & HAVE A GOOD DAY");
	}

}
