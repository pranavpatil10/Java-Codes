import java.io.*;
import java.util.*;

class File_Reading{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter txt file name:-");
        String fname=sc.nextLine();

        FileInputStream fin=new FileInputStream(fname);

        int ch=fin.read();  //read file char

        while(ch!=-1){          //end of file
             System.out.println((char)ch);
             ch=fin.read();
        } 
        fin.close();

    }
}