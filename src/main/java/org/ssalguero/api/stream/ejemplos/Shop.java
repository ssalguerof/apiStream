package org.ssalguero.api.stream.ejemplos;

import org.ssalguero.api.stream.ejemplos.inteface.Payment;

public abstract class Shop {
    public void buySomeThing(){
        Payment payment = makePayment();
        makePayment().paymentMethod();

    }

    public abstract Payment makePayment();
}
