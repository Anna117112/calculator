package kata.test;

public class MyException extends Throwable {
    public MyException(String s) {
        super(s);
        System.out.println(s);
    }


}
