import java.io.*;
import java.util.*;

class File_Demo{
    public static void main(String args[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter file");
        String fname=s1.next();

        File f1=new File(fname);

        System.out.println("\n\tFile Name: "+f1.getName());
        System.out.println("\tPath: "+f1.getParent());
        System.out.println(f1.exists() ? "\texists" : "\tdoes not exist");
        if(f1.isDirectory()){
            System.out.println("directory");
        }
        if(f1.isFile()){
            System.out.println("File");
        }

        System.out.println("\tFile Size:"+f1.length());
    }
}