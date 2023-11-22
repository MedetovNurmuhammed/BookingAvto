import java.util.Arrays;
import java.util.Scanner;

public class Users {
    private String name;
    private String surename;
    private String email;
    private String password;
    private  String phonenumber;
    private  String adress;
    private int chet;

    public Users() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getChet() {
        return chet;
    }

    public void setChet(int chet) {
        this.chet = chet;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public static Users[] adArray(Users[] users, Users registerUser) {

        Users[] newArray = Arrays.copyOf(users, users.length + 1);
        newArray[newArray.length - 1] = registerUser;
        return newArray;
    }

    public static Users registr(Users newusers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        newusers.setName(scanner.nextLine());
        System.out.println("Фамилия :");
        newusers.setSurename(scanner.nextLine());
        System.out.println("Введите номер телефона:");
        newusers.setPhonenumber(scanner.nextLine());
        System.out.println("Введите адресс:");
        newusers.setAdress(scanner.nextLine());
        System.out.println("Введите Email:");
        newusers.setEmail(scanner.nextLine());
        if (newusers.getName().isEmpty() || newusers.getSurename().isEmpty() || newusers.getEmail().isEmpty()) {
            System.out.println("Поля не должны быть пустыми!❌");
        } else if (!newusers.getEmail().contains("@gmail.com")) {
            System.out.println("Не корректый адресс эл.почты!❌");
        } else {
            System.out.println("Введи пароль");
            newusers.setPassword(scanner.nextLine());
            if (newusers.getPassword().length() < 4) {
                System.out.println("Пароль долден быть не менее 4 символа!❌");
                return null;

            } else {
                System.out.println("ВНЕСИТЕ ОПЛАТУ НА СЧЕТ: $");
                newusers.setChet(scanner.nextInt());
                System.out.println("Аккаунт успешно создан!✅");
                return newusers;

            }
        }
        return null;


    }
    public static Users voiti(Users [] users){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Email :");
        String email = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String parol = scanner.nextLine();
        for (int i = 0; i < users.length; i++) {
            if (email.equals(users[i].getEmail()) && parol.equals(users[i].getPassword())){
                System.out.println("Вы вошли в аккаунт!✅");
            return users[i];}}
                System.out.println("Не верный пароль или логин❌");
                return null;

            }}





