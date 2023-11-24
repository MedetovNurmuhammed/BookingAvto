public class Car {
    private Shifr marka;
    private int price;
    private Driver driver;
    private   int id;
    private Boolean bron;

    public Car() {
    }

    public Car(Shifr marka, int price,int id,Driver driver,Boolean bron) {
        this.marka = marka;
        this.price = price;
        this.driver = driver;
        this.id = id;
        this.bron = bron;
    }



    public long getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Boolean getBron() {
        return bron;
    }

    public void setBron(Boolean bron) {
        this.bron = bron;
    }

    public Shifr getMarka() {
        return marka;
    }

    public void setMarka(Shifr marka) {
        this.marka = marka;
    }




    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", price='" + price + '\'' +
                ", Driver='" + driver + '\''+
                ", Bron='" + bron + '\''+
                '}';
    }
}
