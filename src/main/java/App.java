import java.util.Random;

public class App {
    private static Random random = new Random();

    /**
     * метод заполняет массив строковыми данными
     * @param stringArray
     * @return возвращает строковый массив
     */
    public String[][] fillArray(String[][] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                if(j == random.nextInt(20)){
                    stringArray[i][j] = "Упс";
                }else {
                    stringArray[i][j] = String.valueOf(random.nextInt(100));
                }
            }
        }
        return stringArray;
    }

    /**
     * метод суммирует значения массива
     * @param array массив
     * @return сумму элементов массива
     * @throws ArraySizeException
     */
    public int getSumArray(String[][] array) throws ArraySizeException {
        if(array.length != 4)
            throw new ArraySizeException(String.format("array[%d][%d]",array.length,array[0].length));
        else {
            for (int i = 0; i < array.length; i++) {
                if(array[0].length!=4){
                    throw new ArraySizeException(String.format("array[%d][%d]",array.length,array[0].length));
                }
            }
        }
        int summaArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    System.out.println(array[i][j]);
                    int value = Integer.parseInt(array[i][j]);
                    summaArray+=value;
                }catch (NumberFormatException e){
                    throw new ArrayDataException(String.format("array[%d][%d]",i,j),array[i][j]);
                }
            }
        }
        return summaArray;
    }
}
