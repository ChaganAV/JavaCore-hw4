public class Program {
    //private static Random random = new Random();
    public static void main(String[] args){
        String[][] stringArray = new String[4][4];
        try {
            App app = new App();
            String[][] stringValues = app.fillArray(stringArray);
            int sumArray = app.getSumArray(stringValues);
            System.out.println("------------------");
            System.out.println("Итого: "+sumArray);
        }catch (ArraySizeException e){
            e.printStackTrace();
        }

    }
}
