import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ReadInput {
	public static void readList(String args){ 
		ArrayList<Customer> nameOrdered = new ArrayList<Customer>(); 
        ArrayList<Customer> surnameOrdered = new ArrayList<Customer>(); 
        ArrayList<Customer> addressOrdered = new ArrayList<Customer>(); 
        ArrayList<Customer> cidOrdered = new ArrayList<Customer>(); 
        ArrayList<Customer> cityOrdered = new ArrayList<Customer>(); 
        ArrayList<Customer> ssnOrdered = new ArrayList<Customer>(); 
        
		try {
            BufferedReader in = new BufferedReader(new FileReader(args));
            in.readLine();
            String str=null;
            while ((str = in.readLine()) != null) {
            	String ar[]=str.split(Pattern.quote("|"));//Each line is partitioned by using | separator.
            	int cid = Integer.parseInt(ar[0]);
                long ssn=Long.parseLong(ar[5]);
            	Customer cstmr=new Customer(cid, ar[1], ar[2], ar[3], ar[4], ssn);
            	nameOrdered.add(cstmr);
                surnameOrdered.add(cstmr);
                addressOrdered.add(cstmr);
                cidOrdered.add(cstmr);
                cityOrdered.add(cstmr);
                ssnOrdered.add(cstmr);
            }
            
            System.out.println(nameOrdered.toString());
            System.out.println("--------------------------");
            Sort.sort(nameOrdered, 0, nameOrdered.size()-1,"name");
            System.out.println(nameOrdered.toString());
            
            
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
	}
	
	public static void readCommand(String args){
		
		try {
            BufferedReader in = new BufferedReader(new FileReader(args));
            String commandText=null;
            while ((commandText = in.readLine()) != null) {
//            	String ar[]=commandText.split(" ");//Each line is partitioned by using | separator.
//            	System.out.println(commandText);
            	splitt(commandText);
            	
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
		
	}
	
	private static void splitt(String commandText){
		String [] command=commandText.split(" WHERE ");
		
		//command[0] --> command + which parts do you want to show on output file.
		//command[1] --> according to what we choose the people to show on output file.
		String [] beforeWhere=command[0].split(" ");
		String [] part=beforeWhere[1].split(",");
		for(int i=0;i<part.length;i++){
    		System.out.println(part[i]);
    	}
		
		
		String [] afterWhere=command[1].split(" AND ");
		for(int i=0;i<afterWhere.length;i++){
    		System.out.println(afterWhere[i]);
    	}
		for(int i=0;i<afterWhere.length;i++){
			String [] partitions=afterWhere[i].split("((>)|(<)|(=)|(~))");
			for (int j = 0; j < partitions.length; j++) {
				System.out.println(partitions[j]);
			}
		}
	
		
		//part and afterWhere and also commandText will send through functions as a parameter.
		
	}
	

}
