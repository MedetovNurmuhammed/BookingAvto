public class Car {
    private Shifr marka;
    private int price;
    private Driver driver;
    public  int id;

    public Car() {
    }

    public Car(Shifr marka, int price,int id,Driver driver) {
        this.marka = marka;
        this.price = price;
        this.driver = driver;
        this.id = id;
    }



    public long getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
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
                '}';
    }
}
