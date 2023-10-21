import java.io.*;


public class Support {
    public String getinputdata(String message) {
        String line = null;
        System.out.print(message + " ");
        try {
            BufferedReader sw = new BufferedReader(new InputStreamReader(System.in));
            line = sw.readLine();
            if (line.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return line;

    }
}
