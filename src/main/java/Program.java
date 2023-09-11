public class Program {
    //private static Random random = new Random();
    public static void main(String[] args){
        String[][] stringArray = new String[4][4];
        int sumArray = 0;
        try {
            App app = new App();
            String[][] stringValues = app.fillArray(stringArray);
            sumArray = app.getSumArray(stringValues);
            System.out.println("------------------");
            System.out.println("Итого: "+sumArray);
        }catch (ArraySizeException e){
            e.printStackTrace();
        }catch (ArrayDataException e){
            e.printStackTrace();
        }finally {
            System.out.println("Итого: "+sumArray);
        }
    }
}
