import java.util.Map;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Laptop {
    private String laptopBrand;
    private Integer diagonal;
    private String CPU;
    private Integer ram;
    private Integer HDD;
    private String OS;
    private String color;
  

    public Laptop(String laptopBrand, Integer diagonal, String CPU, Integer ram, Integer HDD, String OS, String color) {
        this.laptopBrand = laptopBrand;
        this.diagonal = diagonal;
        this.CPU = CPU;
        this.ram = ram;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;


    }

    public String getLaptopBrand() {
        return this.laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public Integer getDiagonal() {
        return this.diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public String getCPU() {
        return this.CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public Integer getRam() {
        return this.ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHDD() {
        return this.HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public String getOS() {
        return this.OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
            " laptopBrand='" + getLaptopBrand() + "'" +
            ", diagonal='" + getDiagonal() + "'" +
            ", CPU='" + getCPU() + "'" +
            ", ram='" + getRam() + "'" +
            ", HDD='" + getHDD() + "'" +
            ", OS='" + getOS() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }

}
