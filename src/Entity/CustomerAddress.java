package Entity;

	public class CustomerAddress {
		private  String doorno;
	    private  String Street;
	    private String city;
	    private String district;
	    private String state;
	    private String country;
	    private int pincode;
		public CustomerAddress(String doorno, String street, String city, String district, String state, String country,
				int pincode) {
			super();
			this.doorno = doorno;
			Street = street;
			this.city = city;
			this.district = district;
			this.state = state;
			this.country = country;
			this.pincode = pincode;
		}
		public String getDoorno() {
			return doorno;
		}
		public void setDoorno(String doorno) {
			this.doorno = doorno;
		}
		public String getStreet() {
			return Street;
		}
		public void setStreet(String street) {
			Street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "CustomerAddress [doorno=" + doorno + ", Street=" + Street + ", city=" + city + ", district=" + district
					+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
		}

	}

