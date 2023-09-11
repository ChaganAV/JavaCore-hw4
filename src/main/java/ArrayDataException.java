public class ArrayDataException extends NumberFormatException{
    /**
     * класс исключения, когда строка содержат не число
     * @param message ячейка
     * @param value значение
     */
    public ArrayDataException(String message,String value) {
        super("В ячейке " + message + " лежит: " + value + ", это некорректные данные, ожидается число!");
    }
}
