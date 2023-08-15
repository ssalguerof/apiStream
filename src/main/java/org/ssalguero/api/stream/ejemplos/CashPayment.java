package org.ssalguero.api.stream.ejemplos;

import org.ssalguero.api.stream.ejemplos.inteface.Payment;

public class CashPayment extends Shop{
    @Override
    public Payment makePayment() {
        return new Cash();
    }
}
