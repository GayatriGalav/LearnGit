import java.util.Scanner;
import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] argv) throws Exception {
        System.out.println("Sending connection request");
        Socket sr = new Socket("localhost", 6777);
        System.out.println("Enter the path of file which is to be sent: ");
        Scanner scanner=new Scanner(System.in);
        // FileInputStream fr = new FileInputStream("C:\\Users\\Gayatri Galav\\Pictures\\Screenshots\\Send.txt");
    FileInputStream fr = new FileInputStream(scanner.nextLine());


        byte b[] = new byte[2002];
        fr.read(b, 0, b.length);
        OutputStream os = sr.getOutputStream();
        os.write(b, 0, b.length);
    }
}
