package org.ssalguero.api.stream.ejemplos.facade;

public class WifiService implements MobileService{
    @Override
    public void start() {
        System.out.println("Wifi service started");
    }

    @Override
    public void close() {
        System.out.println("Wifi service closed");
    }
}
