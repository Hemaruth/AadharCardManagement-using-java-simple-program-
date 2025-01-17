import java.util.Scanner;

class AadharDetail2 {
	static Scanner sc = new Scanner(System.in);
	private String name;
	private String dob;
	private long contact;
	private long AadharNo;
	private String Address;

	private AadharDetail2() {

	}

	private AadharDetail2(String name, String dob, long contact, long AadharNo, String Address) {
		this.name = name;
		this.dob = dob;
		this.contact = contact;
		this.AadharNo = AadharNo;
		this.Address = Address;
	}

	public static AadharDetail2 getAadhar(String name, String dob, long contact, long AadharNo, String Address) {
		return new AadharDetail2(name, dob, contact, AadharNo, Address);
	}
	public boolean doverify() throws Exception {
		System.out.println("Enter your contact number to verify");
		long c = sc.nextInt();
		if (c == this.contact) {
			System.out.print("Enter Otp : ");
			Thread.sleep(3000);
			int otp = (int) (Math.random() * 9999 + 9999);

			System.out.println(otp);
			int U_otp = sc.nextInt();
			if (otp == U_otp) {
				return true;
			}

		}
		return false;
	}



	public String getname() {
		return name;
	}

	public String getdob() {
		return dob;
	}

	public String getAddress() {
		return Address;
	}

	public long getcontact() {
		return contact;
	}

	public long getAadharNo() {
		return AadharNo;
	}

	public void setname(String name) {
		this.name = name;
		;
	}

	public void setAddress(String Address) {
		this.Address = Address;
		;
	}

	public void setdob(String dob) {
		this.dob = dob;
		;
	}

	public void setcontact(long contact) {
		this.contact = contact;
		;
	}
	public void UI() throws Exception {
		System.out.println("YOUR AADHAR");
		boolean flag1 = true;
		do {
			System.out.println("Choose the option\n1Get Aadhar Details\n2Update Aadhar Details\n3exit");
			switch (sc.nextInt()) {
			case 1: {

				System.out.println("To Verify Enter contact number");
				long num = sc.nextLong();
				System.out.print("Enter Otp:");
				Thread.sleep(3000);
				int otp = (int) (Math.random() * 9999 + 9999);
				System.out.println(otp);
				int Uotp = sc.nextInt();
				if (otp == Uotp) {
					System.out.println(
							"Select the option:\n1Name of the holder\n2Address\n3Contact_no\n4Aadhar_number\n5Dob\n6Exit");
					boolean flag2 = true;
					do {
						switch (sc.nextInt()) {
						case 1: {
							System.out.println("Name :");
							System.out.println(getname());
							break;
						}
						case 3: {
							System.out.println("Contact:");
							System.out.println(getcontact());
							break;
						}
						case 2: {
							System.out.println("Address :");
							System.out.println(getAddress());
							break;
						}
						case 4: {
							System.out.println("Aadhar_Number :");
							System.out.println(getAadharNo());
							break;
						}
						case 5: {
							System.out.println("Date Of Birth :");
							System.out.println(getdob());
							break;
						}
						case 6: {
							flag2 = false;
							break;
						}
						}
					} while (flag2);
				}
				break;
			}
			case 2: {
				boolean flag3 = true;
				do {
					System.out.println("\t\t\tUpdate Aadhar Details");
					System.out.println("Choose the option\n1.Name\n2.DOB\n3.Address\n4.Exit");

					switch (sc.nextInt()) {
					case 1: {
						System.out.println("Name :");
						setname(sc.next());
						Thread.sleep(3000);
						System.out.println("updated name successfully");
						break;
					}

					case 3: {	
						System.out.println("Address :");
						setAddress(sc.next());
						Thread.sleep(3000);
						System.out.println("updated Address successfully");
						break;
					}
					case 2: {
						System.out.println("Date Of Birth :");
						setdob(sc.next());
						Thread.sleep(3000);
						System.out.println("updated DOB successfully");
						break;
					}
					case 4: {
						flag3 = false;
						break;
					}
					}
				} while (flag3);
				break;
			}

			case 3: {
				flag1 = false;
				break;
			}

			}

		} while (flag1);
	}
}
