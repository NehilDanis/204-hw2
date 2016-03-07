import java.util.Comparator;


public class MyComparator {

	public static final Comparator<Customer>BY_CID=new ByCid();
	public static final Comparator<Customer>BY_NAME =new ByName();
	public static final Comparator<Customer>BY_SURNAME =new BySurname();
	public static final Comparator<Customer>BY_CITY =new ByCity();
	public static final Comparator<Customer>BY_ADDRESS =new ByAddress();
	public static final Comparator<Customer>BY_SSN=new BySsn();
	
	public static class ByName implements Comparator<Customer>{
		public int compare(Customer a,Customer b){
			return a.getName().compareToIgnoreCase(b.getName());
		}
	}
	
	public static class BySurname implements Comparator<Customer>{
		public int compare (Customer a,Customer b){
			return a.getSurname().compareTo(b.getSurname());
		}
	}
	
	public static class ByCid implements Comparator<Customer>{
		public int compare (Customer a,Customer b){
			return a.getCid()-b.getCid();
		}
	}
	
	public static class BySsn implements Comparator<Customer>{
		public int compare (Customer a,Customer b){
			return (int)(a.getSocialSecurityNumber()-b.getSocialSecurityNumber());
		}
	}//long
	
	public static class ByCity implements Comparator<Customer>{
		public int compare (Customer a,Customer b){
			return a.getCity().compareTo(b.getCity());
		}
	}
	
	public static class ByAddress implements Comparator<Customer>{
		public int compare (Customer a,Customer b){
			return a.getAddress().compareTo(b.getAddress());
		}
	}
	
}
