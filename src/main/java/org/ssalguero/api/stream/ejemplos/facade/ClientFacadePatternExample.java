package org.ssalguero.api.stream.ejemplos.facade;

public class ClientFacadePatternExample {
    public static void main(String[] args) {
        MobileFacade mobileFacade = new MobileFacade();
        Mobile mobile = mobileFacade.on();

        System.out.println("------------------");
        mobileFacade.off(mobile);
    }
}
