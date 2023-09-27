import java.util.ArrayList;
import java.util.List;

/**
 * Description of the class or method
 *
 * @author HukoJlauII
 */
public class ExceptionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            try {

                if (list.size() != 10) {
                    list.add(1);
                } else {
                    throw new EleventhElementException();
                }

            } catch (Exception e) {
                System.out.println("Размер массива:" + list.size());
                System.out.println("e - исключение класса " + e.getClass().getName());
                System.out.println(e.getMessage());
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
                System.out.println(e.toString());
            } finally {
                System.out.println("Элемент номер " + (i + 1) + " добавлен");
            }
        }
    }
}
