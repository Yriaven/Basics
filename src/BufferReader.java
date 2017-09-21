import java.io.*;

public class BufferReader {

    public static void main(String[] args) throws IOException {

        File file = new File("Test.txt");
        System.out.println("Our file" + file);


        System.out.println(file.exists()+ "------" + file.isDirectory());


        String tekst = "Sukces !!!";

        OutputStream op = new FileOutputStream(file);
        op.write(tekst.getBytes());
        op.close();


        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));


        String wyswietl = bf.readLine();

        System.out.println(wyswietl);

    }
}
