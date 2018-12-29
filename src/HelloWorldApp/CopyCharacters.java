package HelloWorldApp;

import java.io.*;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src/HelloWorldApp/xanadu.txt");
            out = new FileWriter("src/HelloWorldApp/characteroutput.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
