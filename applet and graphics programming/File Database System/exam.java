import java.io.*;
import java.util.*;

class exam{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter txt file name:-");
        String fname=sc.nextLine();

        FileInputStream fin=new FileInputStream(fname);

        int ch=fin.read();
        int cnt =0;
          //read file char
    
        while(ch!=-1){          //end of file
             char x=(char)ch;
             if(x%2==0)
                 cnt++;
            
             ch=fin.read();
                 
        } 
        
        System.out.println(cnt);

    }
}