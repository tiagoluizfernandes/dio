import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Tiago Luiz Fernandes
 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = 0;

        line = Integer.parseInt(br.readLine());

        while (line != 0 ) {
            boolean found = false;

            for(int i = 0; i <= originalWord.length() -1; i++) {
                if(originalWord.substring(0,i).endsWith(originalWord.substring(i))) {
                    System.out.println(originalWord.substring(0,i));
                    found = true;
                }
            }

            if(!found) {
                System.out.println(originalWord);
            }
        }
    }
}