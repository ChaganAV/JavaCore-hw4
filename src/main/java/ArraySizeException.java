public class ArraySizeException extends Exception {
    /**
     * класс исключения, при некорректном размере массива
     * @param message
     */
    public ArraySizeException(String message) {
        super(message + " - Некорректный размер массива. Должен быть 4x4");
    }
}
