package ThrowMyException;

public class MyException extends Throwable {

    public MyException(String message) {
        super(message);
    }

//    @Override
//    public String toString() {
//        return "Jeg siger: " + getMessage();
//    }
}
