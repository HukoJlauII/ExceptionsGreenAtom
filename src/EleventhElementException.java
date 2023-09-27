import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Description of the class or method
 *
 * @author HukoJlauII
 */
public class EleventhElementException extends Exception {
    public EleventhElementException() {
        super();
    }

    @Override
    public Throwable getCause() { //Возвращает причину исключения, если она была установлена
        return super.getCause();
    }

    @Override
    public String getMessage() {//Возвращает сообщение об ошибке, описанное в конструкторе класса
        return "Вставка 11-го элемента невозможна";
    }

    @Override
    public String getLocalizedMessage() {// Возвращает локализованное сообщение об ошибке, если такое определено. По умолчанию возвращает значение, возвращаемое методом getMessage()
        return "Попытка добавить 11-й элемент. Ограничение на количество элементов";
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    @Override
    public String toString() {// Возвращает строковое представление исключения. По умолчанию возвращает имя класса и сообщение об ошибке.
        return super.toString();
    }

    @Override
    public void printStackTrace() {//Выводит информацию об исключении в стандартный поток ошибок
        System.out.println("EleventhElementException: Вставка 11-го элемента невозможна");
    }

    @Override
    public void printStackTrace(PrintStream s) {

        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }


}
