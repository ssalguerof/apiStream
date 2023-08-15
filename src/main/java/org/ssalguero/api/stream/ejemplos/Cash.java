package org.ssalguero.api.stream.ejemplos;

import org.ssalguero.api.stream.ejemplos.inteface.Payment;

public class Cash implements Payment {

    @Override
    public void paymentMethod() {
        System.out.println("Payment Method: Cash");
    }


}
