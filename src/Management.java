import java.util.Arrays;
import java.util.Scanner;

public class Management {
  private Users[] users = new Users[0];


    public Users[] getUsers() {
        return users;
    }

    public void setUsers(Users[] users) {
        this.users = users;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }


    public Car[] getCars() {
        return this.cars;
    }
    Driver driver1 = new Driver("Нурмухаммед","Медетов",0707374657);
    Driver driver2 = new Driver("Алиаскар","Темирбеков",0705436556);
    Driver driver3 = new Driver("Нурлан","Абибиллаев",0707474357);
    Driver driver4 = new Driver("Нурислам","Абибиллаев",070545445);
    Driver driver5 = new Driver("Жигит","Турумбкеов",070537465);
    Driver driver6 = new Driver("Нуртаазим","Асаков",0707374657);
    Driver driver7 = new Driver("Нургазы","Алымбеков",0707374657);
    Driver driver8 = new Driver("Алинур","Салымбеков",0707573633);
    Car car1 = new Car(Shifr.FERRARI,10000,1,driver1,false);
    Car car2 = new Car(Shifr.AUDI,7000,2,driver2,false);
    Car car3 = new Car(Shifr.KIA,9000,3,driver3,false);
    Car car4 = new Car(Shifr.BMW,12000,4,driver4,false);
    Car car5 = new Car(Shifr.MERSEDEC,95001,5,driver5,false);
    Car car6 = new Car(Shifr.TAYOTA,11990,6,driver6,false);
    Car car7 = new Car(Shifr.HONDA,10950,7,driver7,false);
    Car car8 = new Car(Shifr.VOLKSWAGEN,6000,8,driver8,false);
      private Car[]cars = {car1,car2,car3,car4,car5,car6,car7,car8};



    public  static  void booking(Car[] cars,Users curentUser){

    Bank bank = new Bank();
    System.out.println("id: ");
    int a = new  Scanner(System.in).nextInt();
        for (Car car : cars) {
        if (!car.getBron()){
        if (a==car.getId()&&car.getPrice()< curentUser.getChet()) {
            car.setBron(true);
            curentUser.setChet(curentUser.getChet() - car.getPrice());
            System.out.println("Машина успешно забронирован!✅");
            System.out.println("Ваш счет: " + curentUser.getChet());



        }
        else {
            System.out.println("У вас не хватает средств!");
            System.out.println("Ваш счет : $"+ curentUser.getChet());
            System.out.println("""
                                Хотите оформить кредит?
                                1.Да
                                2.Нет
                                """);
            Scanner scanner = new Scanner(System.in);
            String aq = scanner.nextLine();
            switch (aq){
                case "1","да"->{
                    System.out.println("Введите сумму : ");
                int kredit = scanner.nextInt();
                bank.credit(curentUser,kredit);
                    System.out.println("Ваш счет пополнен на "+aq);
                }case "2","нет"->{break;


                }

            }
            }

    }else {
            System.out.println("Машина уже забронировано!");
        }
}}


    @Override
    public String toString() {
        return "Management{" +
                "driver1=" + driver1 +
                ", driver2=" + driver2 +
                ", driver3=" + driver3 +
                ", driver4=" + driver4 +
                ", driver5=" + driver5 +
                ", driver6=" + driver6 +
                ", driver7=" + driver7 +
                ", driver8=" + driver8 +
                ", car1=" + car1 +
                ", car2=" + car2 +
                ", car3=" + car3 +
                ", car4=" + car4 +
                ", car5=" + car5 +
                ", car6=" + car6 +
                ", car7=" + car7 +
                ", car8=" + car8 +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}

