import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {
    static void OutputFiltr (){
    LinkedHashSet<String> charactSet = new LinkedHashSet<>(Arrays.asList
                    ("ram","laptopBrand","HDD","OS"));
        LinkedHashMap<Integer,String> characterMap = new LinkedHashMap<>();
        int i=1;
        for (String items:charactSet) {
            characterMap.put(i,items);
            i++;}
        System.out.println(characterMap);    
    }
    static void FiltrLaptop (Stock stockForFilter){
        OutputFiltr();
        System.out.print("Enter number, to select a filter criterion: ");
        Scanner input = new Scanner(System.in);
        System.out.println();
        int filtrKey = input.nextInt();
        switch (filtrKey) {
            case 1: System.out.print("Enter lower limit of RAM: ");
                Integer lowLimit = input.nextInt();
                System.out.println();
                System.out.print("Enter upper limit of RAM: ");
                Integer upperLimit = input.nextInt();
                stockForFilter.FiltrByRAM(lowLimit, upperLimit);
                break;
            case 2: System.out.print("Enter brand: ");
                Scanner inputBrand = new Scanner(System.in);
                String filtrBrand = inputBrand.nextLine();
                System.out.println();
                stockForFilter.FiltrByBrand(filtrBrand);
                inputBrand.close();
                break;
            case 3: System.out.print("Enter lower limit of HDD: ");
                Integer lowLimHDD = input.nextInt();
                System.out.println();
                System.out.print("Enter upper limit of HDD: ");
                Integer upperLimHDD = input.nextInt();
                stockForFilter.FiltrByHDD(lowLimHDD, upperLimHDD);
                break;
            case 4: System.out.print("Enter OS: ");
                Scanner inputOS = new Scanner(System.in);
                String filtrOS = inputOS.nextLine();
                System.out.println();
                stockForFilter.FiltrByOS(filtrOS);
                inputOS.close();
                break;
        }input.close();
        

    }
    public static void main(String[] args) throws Exception {
        Stock stock = new Stock();
        Laptop lap1 = new Laptop("Samsung", 14, "Intel I5", 6_000,
         1_000, "Windows", "Black");
        Laptop lap2 = new Laptop("HP", 15, "Intel I7", 8_000,
         750, "Windows", "Black");
        Laptop lap3 = new Laptop("MacBoock", 13, "Apple M1", 8_000,
         1_000, "macOS", "Silver");
        Laptop lap4 = new Laptop("Samsung", 17, "Intel I7", 8_000,
         2_000, "Windows", "Pink");
        Laptop lap5 = new Laptop("Acer", 14, "Intel I5", 4_000,
         1_000, "Windows", "White");
        stock.AddLaptop(lap1);stock.AddLaptop(lap2);stock.AddLaptop(lap3);
        stock.AddLaptop(lap4);stock.AddLaptop(lap5);
        System.out.println(stock);
        FiltrLaptop(stock);
    
    }
}
