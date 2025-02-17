package ThrowMyException;

public class ThrowMyException {
    public void run() throws MyException {
        throw new MyException("Fejl");
    }

    public static void main (String[] args) {
        ThrowMyException throwMyException = new ThrowMyException();

        try {
            throwMyException.run();
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
