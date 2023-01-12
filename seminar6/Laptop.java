package seminar6;

public class Laptop {

    private String brand;

    private String model;

    private int ram;

    private int rom;

    private String os;

    private String color;

    public Laptop(String brand, String model, int ram, int rom, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Производитель: " + brand + ", модель: " + model + ", RAM: " + ram +
                " ГБ, накопитель: " + rom + " ГБ, операционная система: " + os + ", цвет: " + color;
    }
}