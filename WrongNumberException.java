public class WrongNumberException extends Exception{
    public WrongNumberException(){
        System.out.println("\n"+"Введите числа от 1 до 10");
    }
}
class UnsuitableConditionException extends Exception{
    public UnsuitableConditionException(){
        System.out.println("\n"+"Неверное условие ");
    }
}
