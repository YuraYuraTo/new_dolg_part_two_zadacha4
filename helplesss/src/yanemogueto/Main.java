package yanemogueto;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] text = "In literary theory, a text is any object that can be read, whether this object is a work of literature, a street sign, an arrangement of buildings on a city block, or styles of clothing. It is a coherent set of signs that transmits some kind of informative message.[1] This set of symbols is considered in terms of the informative message's content, rather than in terms of its physical form or the medium in which it is represented.".toCharArray();
		 
        Scanner in = new Scanner(System.in);
 
        System.out.printf("Please enter a number of character : ");
 
        int num =0;
        String c;
        try {
            num = in.nextInt();
        }
        catch ( InputMismatchException ex)
        {
            System.err.println("Error , please enter a digit!");
            System.exit(1);
        }
 
        System.out.printf("Please enter a character : ");
 
        c = in.next();
 
        int k = 0;
 
        for(int i = 0; i < text.length; ++i)
            if (text[i] ==' ') k = 0;
            else  if (k++ == num - 1)  text[i] = c.charAt(0);
 
        System.out.println(text);
    }


}
