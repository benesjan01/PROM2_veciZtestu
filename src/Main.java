import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello wordl");

        final int x = 10;
        final double pi = 3.14;

        ExampleClass exampleClass = new ExampleClass();           // instance tridy
        exampleClass.publicMethod();
        System.out.println(exampleClass.publicNumber);

        System.out.println(MyMathClass.pi);
        int sum = MyMathClass.sum(10, 20);

        Car skodaFabia = new Car("Skoda", "Fabia");

        Box<Car> boxOfCar = new Box<>(skodaFabia);
        Box<Integer> boxOfNumber = new Box<>(16);
        Pair<Integer, Car> pairCar = new Pair<>(1, skodaFabia);
        Pair<String, String> parString = new Pair<>("key1", "value 1");

        Box<Pair<String, String>> boxOfPair = new Box<>(parString);

        DataSaver <Car> dataSaver = new FileDataSaver<>()

                if (true){
                    dataSaver = new InMemoryDataSaver<>();
                }
                dataSaver.save(skodaFabia);

                dataSaver = new InMemoryDataSaver<>()

                        dataSaver.save(skodaFabia);
                printSymbol('^' , 5);

                try{
                    //zapis do souboru
                    throw  new NullPointerException("soubor nenalezen");
                }catch (NullPointerException e){

                }
                catch(Exception e){
                    System.out.println(e.getMessage());
        }
    }
                //rekurze v testu, metoda ktera vola sama sebe
        private static void printSymbol (char symbol, int count){
            if (count < 1)
                return;

            String textToPrint = "";
            for (int i =0; i<count, i++){
                textToPrint = textToPrint + symbol;
            }
            System.out.println(textToPrint);
            count = count - 1;
            printSymbol(symbol, count);
        }
  // teoreticky veci v testu - vlakno, xml, VCS

}
