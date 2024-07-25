package calculator;

public class DivideException extends Exception {
    public DivideException(){
        super("분모가 0이면 안됩니다.");
    }
}
