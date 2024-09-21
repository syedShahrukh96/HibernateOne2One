package Com.shahrukh.hibernate.FirstProject;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "h2_address")
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	private String city;
	private String state;
	private int pincode;
	
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name="EMP-ID")
	private Employee employee;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	




	public Address(int addressId, String city, String state, int pincode, Employee employee) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.employee = employee;
	}
	
	
	//without address id, when we are inserting we dont have ID
	public Address(String city, String state, int pincode, Employee employee) {
		super();
		
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.employee = employee;
	}

	//when we need employee object 
	public Address(String city, String state, int pincode) {
		super();
		
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	
	}

	
	
	









	public int getAddressId() {
		return addressId;
	}










	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}










	public String getCity() {
		return city;
	}










	public void setCity(String city) {
		this.city = city;
	}










	public String getState() {
		return state;
	}










	public void setState(String state) {
		this.state = state;
	}










	public int getPincode() {
		return pincode;
	}










	public void setPincode(int pincode) {
		this.pincode = pincode;
	}










	public Employee getEmployee() {
		return employee;
	}










	public void setEmployee(Employee employee) {
		this.employee = employee;
	}










	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}











	
	
	
	
	
	
	
	
	

	
	
	
	

}
