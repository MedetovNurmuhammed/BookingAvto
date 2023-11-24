import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Management management = new Management();
        Users currentUser = null;
        Scanner scanner = new Scanner(System.in);

        Outerloop:
      while (true){ System.out.println("""
            
                1.РEГИСТРАЦИЯ
                2.ВОЙТИ
                3.EXIT
                ВЫБЕРИТЕ КОМАНДУ : 
                """);
        String acation = scanner.nextLine();

        switch (acation){
            case "1"->{
               Users registrUser =  Users.registr(new Users());
               management.setUsers( Users.adArray(management.getUsers(),registrUser));

            }
            case "2"->{

              Users loginUser =   Users.voiti(management.getUsers());
              currentUser = loginUser;
              Innerloop:
              while (true){

                System.out.println(

                        "Доступные Машины:"+
                        "1."+Shifr.FERRARI+" - Цена: $10000"+
                        "\n"+2+"."+Shifr.AUDI+" - Цена: $7000"+"\n"
                        +3+"."+Shifr.KIA+" - Цена: $9000"+
                        "\n"+4+"."+Shifr.BMW+" - Цена: $12000"+"\n"+5
                        +"."+Shifr.MERSEDEC+" - Цена: $95001"+
                        "\n"+6+"."+Shifr.TAYOTA+" - Цена: $10000"+"\n"+7+
                        "."+Shifr.HONDA+" - Цена: $11990"+"\n"+8+
                        "."+Shifr.VOLKSWAGEN+" - Цена: $6000"+"\n"+
                        "Ваш выбор :(0. Чтобы закончить прграмму!");
                  switch (scanner.nextInt()){
                      case 0:break Innerloop;
                  }
                Management.booking(management.getCars(), currentUser);
//                management.getCars();


            }}



            case"3"->{
                System.out.println("Вы вышли из программы!✅");
                break Outerloop;

            }

        }}}}



