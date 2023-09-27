public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            try {
                new MyException();
            } catch (Throwable e) {
                System.out.println("e = " + e);
                if (e.getCause() instanceof MyException) {
                    MyException ex = (MyException) e.getCause();
                    System.out.println("e instanceof " + MyException.class.getName() + ", s = " + ex.get());
                }
            }
        }
    }
}

//e = java.lang.ExceptionInInitializerError - ошибка, которая возникает когда во время статической инициализации класса выбрасывается исключение
//e instanceof MyException, s = Hello пойманное исключение - экземпляр класса MyException,метод init отработал
//e = java.lang.NoClassDefFoundError: Could not initialize class MyException - при попытке создания второго объекта MyException в блоке try,
// возникает исключение NoClassDefFoundError, т.к. класс MyException не может быть загружен из-за неустранимой ошибки инициализации
