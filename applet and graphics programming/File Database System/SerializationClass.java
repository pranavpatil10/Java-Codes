import java.io.*;
class Employee implements Serializable{
     int eid;
     String name;

}

public class SerializationClass{
    public static void main (String args[])throws Exception{
        Employee emp=new Employee();
        emp.eid=10;
        emp.name="pranav";

        FileOutputStream fileOut=new FileOutputStream("D:\\employee.txt");

        ObjectOutputStream out=new ObjectOutputStream(fileOut);

        out.writeObject(emp);
        out.close();
        fileOut.close();
        System.out.println("Data Saved!!");

    }
}