import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	
	public static void sort(ArrayList<Customer> a,int lo ,int hi ,String type){
		
		 if (hi <= lo) return;
		 int lt = lo, gt = hi;
		 Customer v=new Customer();
		 v=a.get(lo);
		 int i = lo;
		 while (i <= gt)
		 {
			 int cmp;
			 if(type=="cid"){
				 cmp=Customer.BY_CID.compare(a.get(i), v);
				 if (cmp < 0) exch(a, lt++, i++);
				 else if (cmp > 0) exch(a, i, gt--);
				 else i++;
			 }
			 else if(type=="name"){
				 cmp=Customer.BY_NAME.compare(a.get(i), v);
				 if (cmp < 0) exch(a, lt++, i++);
				 else if (cmp > 0) exch(a, i, gt--);
				 else i++;
			 }
			 else if(type=="surname"){
				 cmp=Customer.BY_SURNAME.compare(a.get(i), v);
				 if (cmp < 0) exch(a, lt++, i++);
				 else if (cmp > 0) exch(a, i, gt--);
				 else i++;
				 
			 }
			 else if(type=="city"){
				 cmp=Customer.BY_CITY.compare(a.get(i), v);
				 if (cmp < 0) exch(a, lt++, i++);
				 else if (cmp > 0) exch(a, i, gt--);
				 else i++;
				 
			 }
			 else if(type=="address"){
				 cmp=Customer.BY_ADDRESS.compare(a.get(i), v);
				 if (cmp < 0) exch(a, lt++, i++);
				 else if (cmp > 0) exch(a, i, gt--);
				 else i++;
				 
			 }
			 else if(type=="ssn"){
				 cmp=Customer.BY_NAME.compare(a.get(i), v);
				 if (cmp < 0) exch(a, lt++, i++);
				 else if (cmp > 0) exch(a, i, gt--);
				 else i++;
				 
			 }
		 }
		 sort(a, lo, lt - 1,type);
		 sort(a, gt + 1, hi,type);
		
	}

//	public static void sort(ArrayList<Customer> a, int lo, int hi)
//	{
//	 if (hi <= lo) return;
//	 int lt = lo, gt = hi;
//	 int v=a.get(lo).getCid();
//	 int i = lo;
//	 while (i <= gt)
//	 {
//	 int cmp = Customer.compareTo(a.get(i).getCid(), v);
//	 if (cmp < 0) exch(a, lt++, i++);
//	 else if (cmp > 0) exch(a, i, gt--);
//	 else i++;
//	 }
//	 sort(a, lo, lt - 1);
//	 sort(a, gt + 1, hi);
//	} 
	
//	public static void sortName(List<Customer> a, int lo, int hi)
//	{
//	 if (hi <= lo) return;
//	 int lt = lo, gt = hi;
////	 String v=a.get(lo).getName();
//	 Customer v=new Customer();
//	 v=a.get(lo);
//	 int i = lo;
//	 while (i <= gt)
//	 {
////	 int cmp =Customer.compareTo(a.get(i).getName(), v);
//	 int cmp=Customer.BY_NAME.compare(a.get(i), v);
//	 if (cmp < 0) exch(a, lt++, i++);
//	 else if (cmp > 0) exch(a, i, gt--);
//	 else i++;
//	 }
//	 sortName(a, lo, lt - 1);
//	 sortName(a, gt + 1, hi);
//	}
	
	
	private static void exch(ArrayList<Customer> a,int i,int j){
		Collections.swap(a, i, j);
		
	}

}
