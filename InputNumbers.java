import java.util.Arrays;

public class InputNumbers extends Operation{
    Operation op = new Operation();

    private static int one;
    private static int two;



    public int splitString(String input) throws Exception {

        String[] numbers;
        if (input.indexOf('+') > 0) {
                numbers = input.split("[+]");
                convert(numbers);
                return op.sum(one,two);
            }
            if (input.indexOf('-') > 0) {
                numbers = input.split("[-]");
                convert(numbers);
                return op.difference(one, two);
            }
            if (input.indexOf('/') > 0) {
                numbers = input.split("[/]");
                convert(numbers);
                return op.division(one, two);
            }
            if (input.indexOf('*') > 0) {
                numbers = input.split("[*]");
                convert(numbers);
                return op.productOfNumbers(one, two);
            } else {
                throw new UnsuitableConditionException();
            }


    }
    public static void convert(String[] numbers) throws WrongNumberException {
        if (one > 10 | one < 1 | two > 10 | two < 1) {
            try {
                if (arabicAndRoman) {
                    one = Integer.parseInt(numbers[0]);
                    two = Integer.parseInt(numbers[1]);

                } else {
                    one = RomanNumeral.romanToArabic(numbers[0]);
                    two = RomanNumeral.romanToArabic(numbers[1]);
                }
            }catch (NumberFormatException e){
                System.out.println("\n"+"Неподходящий формат чисел");
            }
        }
        throw new WrongNumberException();
    }
}
