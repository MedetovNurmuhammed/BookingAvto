import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Users [] users  = new Users[0];
        Users currentUser = null;
        Scanner scanner = new Scanner(System.in);
        Outerloop:
      while (true){ System.out.println("""
                ДОБРО ПОЖАЛОВАТЬ!
                1.РУГИСТРАЦИЯ
                2.ВОЙТИ
                3.EXIT
                ВЫБЕРИТЕ КОМАНДУ : 
                """);
        String acation = scanner.nextLine();

        switch (acation){
            case "1"->{
               Users registrUser =  Users.registr(new Users());
               users = Users.adArray(users,registrUser);

            }
            case "2"->{

              Users loginUser =   Users.voiti(users);
              currentUser = loginUser;


            }
            case"3"->{
                System.out.println("Вы вышли из программы!✅");
                break Outerloop;

            }

        }



