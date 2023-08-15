package org.ssalguero.api.stream.ejemplos;

import org.ssalguero.api.stream.ejemplos.inteface.Payment;

public class CreditPayment extends Shop{

    @Override
    public Payment makePayment() {
        return new CreditCard();
    }
}
