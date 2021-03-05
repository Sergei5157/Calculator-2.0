import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {
    public static String input;
    public static boolean arabicAndRoman = true;
    public static void main(String[] args) throws Exception {
        Processing.input();
        Processing.arabicAndRoman(input);
        System.out.print("Output: ");
        Processing processing= new Processing();
        processing.printResult();



    }
    public static class Processing{
        public static void input() throws IOException {
            System.out.print("Input: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input = reader.readLine();
        }
        public static void arabicAndRoman(String input){
            if(input.contains("I") | input.contains("V") | input.contains("X")){
                arabicAndRoman=false;
            }
        }
        public  void printResult() throws Exception {
            InputNumbers in = new InputNumbers();
            if(arabicAndRoman){
                System.out.println(in.splitString(input));
            }else{
                System.out.println(RomanNumeral.arabicToRoman(in.splitString(input)));
            }
        }
    }
}