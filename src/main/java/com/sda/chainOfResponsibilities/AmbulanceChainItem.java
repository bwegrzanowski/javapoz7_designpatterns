package com.sda.chainOfResponsibilities;

public class AmbulanceChainItem implements ChainItem {

    @Override
    public boolean isMyResponsibility(String value) {
        return value.contains("sick");
    }

    @Override
    public void action(String value) {
        System.out.println("action for ambulance");
    }
}
