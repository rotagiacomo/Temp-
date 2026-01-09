import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            // file ad accesso diretto
            RandomAccessFile raf=new RandomAccessFile("copia.txt","rw");
            //posizionamento al sesto carattere
            raf.seek(4);
            raf.write('*');
            raf.close();

        } catch (IOException e) {
            System.out.println("errore"+e);
        }
    }
}
