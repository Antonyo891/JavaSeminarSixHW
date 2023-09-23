import java.util.LinkedHashSet;
import java.util.Set;

public class Stock {
    Set<Laptop> stockSet = new LinkedHashSet<>();

    public Set<Laptop> getStockSet() {
        return this.stockSet;
    }

    public void setStockSet(Set<Laptop> stockSet) {
        this.stockSet = stockSet;}
       
    public void AddLaptop (Laptop laptop) {
        this.stockSet.add(laptop);
        System.out.println("Laptop "+laptop.getLaptopBrand()+" added to warrehouse");
    }

    public void FiltrByRAM (int low,int hi){
        for (Laptop items:stockSet) if ((items.getRam()<=hi)&&(items.getRam()>=low)) 
                                        System.out.println(items);
    }

    public void FiltrByBrand (String brand){
        for (Laptop items:stockSet) if ((items.getLaptopBrand().toLowerCase().equals(brand.toLowerCase()))) 
                                        System.out.println(items);
    }
    
    public void FiltrByOS (String opSystem){
        for (Laptop items:stockSet) if ((items.getOS().toLowerCase().equals(opSystem.toLowerCase()))) 
                                        System.out.println(items);}

    public void FiltrByHDD (int low,int hi){
        for (Laptop items:stockSet) if ((items.getHDD()<=hi)&&(items.getHDD()>=low)) 
                                        System.out.println(items);
    }

    @Override
    public String toString() {
        return "Laptops in stock: '" + getStockSet() + "'" +
            "}";
    }
   
}
