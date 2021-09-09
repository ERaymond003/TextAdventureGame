
package textadventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TextAdventure {

    
    public static void main(String[] args) throws IOException {
        BufferedReader in;
        String input;
        
        in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("> ");
            input = in.readLine();
            System.out.println("You entered '" + input + "'");
        } while (!"q".equals(input));
    }
    
}
