import java.io.*;
public class RandomAccessFileDemo{
    public static void main(String args[]){
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("\nenter file name:");
            String fname=in.readLine();

            System.out.println("\nenter data:");
            String data=in.readLine();

            RandomAccessFile raf = new RandomAccessFile(fname,"rw");

            for(int i=0;i<data.length();i++){
                raf.write(data.charAt(i));
            }

            raf.seek(2);   //go at position 2

            System.out.println("data: "+raf.readLine());
        }
        catch(IOException ex){
            System.out.println(ex);

        }
    }
}