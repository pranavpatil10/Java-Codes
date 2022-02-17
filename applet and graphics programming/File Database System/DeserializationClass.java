import java.io.*;
public class DeserializationClass{
    public static void main(String args[]){
        try{
            FileInputStream fileIn=new FileInputStream("D:\\employee.txt");

            ObjectInputStream in=new ObjectInputStream(fileIn);
            Employee emp1=(Employee) in.readObject();

            System.out.println("Eid:"+emp1.eid);
            System.out.println("Name:"+emp1.name);
            in.close();
            fileIn.close();

        }
        catch(Exception e){
            System.out.println("File not found");
        }
    }
}
