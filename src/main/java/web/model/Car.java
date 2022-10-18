package web.model;

public class Car {

    private String model;

    private int series;

    private String manufacturer;

    public Car() {
    }

    public Car(String model, int series, String manufacturer) {
        this.model = model;
        this.series = series;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", series=" + series + ", manufacturer='" + manufacturer + '\'' + '}';
    }
}
