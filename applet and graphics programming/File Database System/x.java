import java.util.*;
class x {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String T="V";
        String t="N"

		
		
        
        

        
		System.out.println("enter the quantity of food");
		int q=sc.nextInt();
		System.out.println("enter the distance");
		int d=sc.nextInt();
		
		if(T=="V" && q>=1 && d>0){
		    if(d<=3){
		        int total_amount=(q*12);
		        System.out.println(total_amount);
		    }
		    else if(d>3&&d<=6){
		        int total_amount=(q*12)+1;
		        System.out.println(total_amount);
		        
		    }
		    else{
		        int total_amount=(q*12)+2;
		        System.out.println(total_amount);
		    }
		
	    }      
		
	}
}