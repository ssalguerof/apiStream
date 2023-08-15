package org.ssalguero.api.stream.ejemplos.facade;

import java.util.List;

public class Mobile {
    private Battery battery;
    private CPU cpu;

    private List<MobileService> mobileServices;

    public Mobile(Battery battery, CPU cpu, List<MobileService> mobileServices){
        this.battery = battery;
        this.cpu = cpu;
        this.mobileServices = mobileServices;
    }

    public Battery getBattery() {
        return battery;
    }

    public CPU getCpu() {
        return cpu;
    }

    public List<MobileService> getMobileServices() {
        return mobileServices;
    }
}
