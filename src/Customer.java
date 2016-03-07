//import java.util.Comparator;

public class Customer{
	
	private int cid;
	private String name;
	private String surname;
	private String city;
	private String address;
	private long socialSecurityNumber;
	
	public Customer(){
		//
	}
	
	public Customer(int cid,String name,String surname,String city,String address,long socialSecurityNumber) {
		this.cid=cid;
		this.name=name;
		this.surname=surname;
		this.city=city;
		this.address=address;
		this.socialSecurityNumber=socialSecurityNumber;
	}
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	
	


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", surname=" + surname + ", city=" + city + ", address="
				+ address + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}





	
	
	public static int compareTo(String a,String b){
		System.out.println("edrtfghkıj");
		if(a.compareTo(b)<0)return -1;
		else if(a.compareTo(b)>0)return 1;
		return 0;
	}
	
	public static int compareTo(int a,int b){
		if(a>b)return 1;
		else if(a<b)return -1;
		return 0;
	}
	
	public static int compareTo(long a,long b){
		if(a>b)return 1;
		else if(a<b)return -1;
		return 0;
	}	
	
}
