import java.io.*;
import java.net.*;

public class Server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(6777);
        System.out.println("Waiting for client to connect");
        Socket sr = s.accept();
        System.out.println("Connection Established");
        byte b[] = new byte[2002];

        InputStream is = sr.getInputStream();
        FileOutputStream fr = new FileOutputStream("C:\\Users\\Gayatri Galav\\Pictures\\Screenshots\\tttttttt.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
        FileReader r = new FileReader("C:\\Users\\Gayatri Galav\\Pictures\\Screenshots\\tttttttt.txt");
        int vow = 0;
        int conso = 0;
        int i;
        while ((i = r.read()) != '\0') {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O'
                    || i == 'U') {
                vow++;
            } else if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u' && i != 'A' && i != 'E' && i != 'I'
                    && i != 'O' && i != 'U' && i != ' ') {
                conso++;
            }
        }
        System.out.println("Number of vowels are: "+vow);
        System.out.println("Number of consonants are: "+conso);
    }
}
