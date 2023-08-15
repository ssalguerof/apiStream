package org.ssalguero.api.stream.ejemplos;

public class Application {

    private static Shop shop;

    public static void main(String[] args) {
        configure(args);
        goShopping();
    }

    static void configure(String[] args){
        if (null != args && args.length>0 && args[0].equalsIgnoreCase("creditCard")){
            shop = new CreditPayment();
        }else{
            shop = new CashPayment();
        }
    }

    static void goShopping(){
        shop.buySomeThing();
    }
}
