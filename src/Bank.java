public class Bank {
    public int bankakcha = 10000000;

    public int getKredit() {
        return bankakcha;
    }
    public void credit(Users curentUser,int kredit){
        if (kredit<=bankakcha) {
            bankakcha -= kredit;
            curentUser.setChet(curentUser.getChet() + kredit);
            System.out.println("Вы успешно получили кредит!✅");
            System.out.println("Ваш счет :" + curentUser.getChet() + "$");
        }
         else if (kredit<0) {
            System.err.println("Сумма не должен быть отрицательным!❌");
        }else {
            System.out.println("Такой суммы нет в банке!");
        }
    }
}
