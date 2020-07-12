import java.util.Scanner;

/**
 * Created by KPS on 7/12/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence = scanner.nextLine();
        String result = "";
         if(sentence.length()>3){
             result=sentence.substring(0,3);
         }
        else{if (sentence.length()<3){
            int numH = 3-sentence.length();
            result+=sentence;
            while (numH>0){
                result+="#";
                numH--;
            }
        }}
        System.out.println(result);
    }
}
