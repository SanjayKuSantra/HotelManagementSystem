package Entity;

//public class Customer {
//	package Entity;

	public class Customer {
		 private String customerName;
		    private int customerId;
		    private int customerAge;
		    private long customerPhono;
		    private String customerEmail;
		    private CustomerAddress  customerAddress;
		    private String customerAadhar;
		    private double getCustomerAmt;
		    
		    
			public double getGetCustomerAmt() {
				return getCustomerAmt;
			}
			public void setGetCustomerAmt(double getCustomerAmt) {
				this.getCustomerAmt = getCustomerAmt;
			}
			public Customer(String customerName, int customerId,int customerAge, long customerPhono, String customerEmail,
					CustomerAddress customerAddress, String customerAadhar) {
				super();
				this.customerName = customerName;
				this.customerId = customerId;
				this.customerAge=customerAge;
				this.customerPhono = customerPhono;
				this.customerEmail = customerEmail;
				this.customerAddress = customerAddress;
				this.customerAadhar = customerAadhar;
			}
			public Customer(String cname, int cid, int cage, long cphno, String cemail, String caadhar,
					double getCustomerAmt2, CustomerAddress a) {
				// TODO Auto-generated constructor stub
			}
			public String getCustomerName() {
				return customerName;
			}
			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}
			public int getCustomerId() {
				return customerId;
			}
			public void setCustomerId(int customerId) {
				this.customerId = customerId;
			}
			public int getCustomerAge() {
				return customerAge;
			}
			public void setCustomerAge(int customerAge) {
				this.customerAge = customerAge;
			}
			public long getCustomerPhono() {
				return customerPhono;
			}
			public void setCustomerPhono(long customerPhono) {
				this.customerPhono = customerPhono;
			}
			public String getCustomerEmail() {
				return customerEmail;
			}
			public void setCustomerEmail(String customerEmail) {
				this.customerEmail = customerEmail;
			}
			public CustomerAddress getCustomerAddress() {
				return customerAddress;
			}
			public void setCustomerAddress(CustomerAddress customerAddress) {
				this.customerAddress = customerAddress;
			}
			public String getCustomerAadhar() {
				return customerAadhar;
			}
			public void setCustomerAadhar(String customerAadhar) {
				this.customerAadhar = customerAadhar;
			}
			@Override
			public String toString() {
				return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerAge="
						+ customerAge + ", customerPhono=" + customerPhono + ", customerEmail=" + customerEmail
						+ ", customerAddress=" + customerAddress + ", customerAadhar=" + customerAadhar + "]";
			}
			

	}
