package ServiceImpl;

    
	import java.util.Collection;
    import java.util.LinkedHashMap;
    import java.util.Scanner;
    import java.util.Set;

    import Entity.CustomerAddress;

	import Entity.Customer;
	import Service.HotelService;
	import deo.HotelRepo;

	public class HotelServiceImpl implements HotelService,HotelRepo{
		Scanner sc=new Scanner(System.in);
//		private Integer rollNo;
//		private Set<Integer> a1;
		{
			for(int i=1;i<=10;i++) {
				cm.put(i, null);
			}
			for(int i=1;i<=8;i++) {
				sm.put(i, null);
			}
			for(int i=1;i<=5;i++) {
				dm.put(i, null);
			}
		}
		public void roomInfo() {
			System.out.println("==============Classic Rooms==============");
			System.out.println("Hot Watter:Yes");
			System.out.println("AC:No");
			System.out.println("TV:No");
			System.out.println("wifi:No");
			System.out.println("price:2000 RS");
			System.out.println("==============Standerd Rooms==============");
			System.out.println("Hot Watter:Yes");
			System.out.println("AC:No");
			System.out.println("TV:Yes");
			System.out.println("wifi:No");
			System.out.println("price:2500 RS");
			System.out.println("==============Duplex Rooms==============");
			System.out.println("Hot Watter:Yes");
			System.out.println("AC:Yes");
			System.out.println("TV:Yes");
			System.out.println("wifi:Yes");
			System.out.println("price:3000 RS");
		}
		public void checkRoom(LinkedHashMap<Integer, Customer> l1) {
			boolean flag=false;
			for(Integer ele:l1.keySet()) {
				if(cm.get(ele)==null) {
					System.out.print(ele+" ");
					flag=true;
				}
			}
			System.out.println();
			if(flag==false) {
				System.out.println("No Rooms Are Available");
			}
		}
	   
		public void avilableRooms() {
			System.out.println("==============Available Rooms=============");
			System.out.println("==============Classic Romms===============");
			checkRoom(cm);
			System.out.println("=============Standered Romms==============");
			checkRoom(sm);
			System.out.println("===============Duluxe Romms===============");
			checkRoom(dm);
		}
		
		Customer createCustomer() {
			System.out.println("============Enter Customer Details===========");											
			System.out.println("Enter Customer Name:--");
			String cname = sc.next();
			System.out.println("Enter Customer id:--");
			int cid = sc.nextInt();
			System.out.println("Enter Customer Age:--");
			int cage =sc.nextInt();
			System.out.println("Enter Customer Customer Phono:--");
			long cphno =sc.nextLong();
			System.out.println("Enter Customer Email:--");
			String cemail =sc.next();
			sc.nextLine();
			System.out.println("Enter Customer AadharNo:--");
			String caadhar =sc.next();
//			System.out.println("Enter Customer getCustomerAmt:--");
//			double getCustomerAmt=sc.nextDouble();
			System.out.println("Enter Customer doorno:--");
			String dooron=sc.next();
			System.out.println("Enter Customer Street");
			String Street=sc.next();
			sc.nextLine();
			System.out.println("Enter Customer City");
			String City=sc.next();
			sc.nextLine();
			System.out.println("Enter Customer district");
			String district=sc.next();
			sc.nextLine();
			System.out.println("Enter Customer State");
			String State=sc.next();
			sc.nextLine();
			System.out.println("Enter Customer Country");
			String Country=sc.next();
			sc.nextLine();
			System.out.println("Enter Customer Pincode");
			int Pincode=sc.nextInt();
			
			CustomerAddress a=new CustomerAddress(dooron,Street,City,district,State,Country,Pincode);
			return new Customer(cname, cid, cage, cphno, cemail, a, Country);
	}
		void mapRoom(LinkedHashMap<Integer,Customer>l1,int roomNo,double amt) {
			if(l1.get(roomNo)==null) {
				Customer c=createCustomer();
				L1.add(c);
				l1.put(roomNo,c);
				c.setGetCustomerAmt(amt);
				   System.out.println("Room No:"+roomNo+" had been alloocated for "+c.getCustomerName());
				   System.out.println("==========================================================");
			}else {
				System.out.println("Room is not available................!!!!!");
			}
		}
		public void allocateRooms() {
			System.out.println("=========================Menu====================");
			System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
			int op=sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter Room No................!!!!!");
				int roomNo1=sc.nextInt();
				if(roomNo1>1 && roomNo1<=10) {
					mapRoom(cm,roomNo1,2000);
				} else
				 {
					System.out.println("Enter Correct Room No..............!!!!!");
				}
			
				break;
			case 2:
				System.out.println("Enter Room No..............!!!!");
				int roomNo2=sc.nextInt();
				if(roomNo2>1 && roomNo2<=8) {
					mapRoom(sm,roomNo2,2500);
				} else {
					System.out.println("Enter Correct Room No..............!!!!!");
				}
				break;
			case 3:
				System.out.println("Enter Room No..............!!!!");
				int roomNo3=sc.nextInt();
				if(roomNo3>1 && roomNo3<=5) {
					mapRoom(dm,roomNo3,3000);
				} else {
					System.out.println("Enter Correct Room No..............!!!!!");
				}
				break;
				default:
					System.out.println("Invalid Option....................!!!!!");
			}
		}
		void unMapRoom(LinkedHashMap<Integer,Customer> l1,int roomNo) {
			if(l1.get(roomNo)!=null) {
				Customer c1=l1.get(roomNo);
				System.out.println(c1);
				System.out.println(c1.getCustomerName()+" need to pay "+c1.getClass()+"Rs.");
				l1.put(roomNo, null);
//				l1.remove(c1);
			}
			else {
				System.out.println("Invalid RoomNo......................!!!!!");
			}
		}
		
		public void checkout() {
			System.out.println("=============================Menu==============================");
			System.out.println("1.Classic Room\n2.Standard Room\n3.Delux Room");
			int op=sc.nextInt();
			System.out.println("Enter the Room No:--");
			System.out.println("Enter Your Option.....................!!!!");
			int roomno =sc.nextInt();
			switch(op) {
			case 1:if(roomno>=1 && roomno<=10) {
				unMapRoom(cm, roomno);
			}
			else {
				System.out.println("Invalid RoomNo..................!!!!");
			} break;
			case 2:if(roomno>=1 && roomno<=8) {
				unMapRoom(sm, roomno);
			}
			else {
				System.out.println("Invalid RoomNo..................!!!!");
			} break;
			case 3:if(roomno>=1 && roomno<=5) {
				unMapRoom(dm, roomno);
			}
			else {
				System.out.println("Invalid RoomNo..................!!!!");
			} break;
			default: System.out.println("Invalid Option.....................!!!!");
			}
		}
		public void findAllCustomer() {
			if(L1.size()==0) {
				System.out.println("Database is Empty....................!!!!!");
			}
			else {
				for(Customer ele:L1) {
					System.out.println(ele);
				}
			}
		}
		public void getCustomerById() {
			boolean flag=false;
			System.out.println("Enter the Customer id:--");
			int cid=sc.nextInt();
			for(Customer ele:L1) {
				if(ele.getCustomerId()==cid) {
					System.out.println();
				}
			}
			if(flag==false) {
			System.out.println("Invalid Customer id................!!!!");
		}
		}
	}