package controller;

	import java.util.Scanner;

    import Service.HotelService;

	import Service.HotelService;
	import ServiceImpl.HotelServiceImpl;
	public class HotelApp {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			HotelService h1=new HotelServiceImpl();
			System.out.println("===========Welcome To Hotel Manegement System==========");
			while(true) {
				System.out.println("============Menu===========");
				System.out.println("1.Room Details\n2.Available Room\n3.Allocate room\n4.checkout\n5.findAllCustomer\n6.getCustomerById\n7.Exit");
				System.out.println("");
				System.out.println("Enter Your Option");
		        int op=sc.nextInt();
				switch(op) {
				
				case 1:
					h1.roomInfo();
				    break;
				
				case 2: 
					h1.avilableRooms();
				       break;
					
				case 3: 
					h1.allocateRooms();
					break;
					
				case 4:	
					h1.checkout();
					break;
					
				case 5:	
					h1.findAllCustomer();
					break;
					
				case 6:
					h1.getCustomerById();
					break;
				case 7:	
					System.out.println("Thank You Visit Again");
				    System.exit(0);	
				}
			}
		}
	}