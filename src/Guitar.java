/**
 * Created by sdaribazaron on 2016-09-23.
 */
public class Guitar {
    private String serialNumber;
    private String builder;
    private String model;
    private String type;
    private String backWood;
    private String topWood;
    private double price;

    public Guitar(String serialNumber, Double price, String builder, String model, String type, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }
}
