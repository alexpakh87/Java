package org.example.exersize.ekkel.chief5;

public class TryEnum {
    Money switchMoney;

    public TryEnum() {
    }

    public TryEnum(Money switchMoney) {
        this.switchMoney = switchMoney;
    }

    public void discribe() {
        switch (switchMoney) {
            case RUB:
                System.out.println("RUB Russian currency");
                break;
            case DOLLAR:
                System.out.println("DOLLAR USA currency");
                break;
            case FUNT:
                System.out.println("FUNT Great Britain currency");
                break;
            case LIRA:
                System.out.println("LIRA Italian currency");
                break;
            case PESSO:
                System.out.println("PESSO Spanish currency");
                break;
            case TENGE:
                System.out.println("TENGE Kazakhstan currency");
                break;
            default:
                System.out.println("Euro");
                break;
        }
    }

    public static void main(String[] args) {

        for (Money money : Money.values()) {
            
            System.out.println(money + ", ordinal " + money.ordinal());


            TryEnum tr = new TryEnum(money);
            tr.discribe();
        }
    }
}
