package com.sda.chainOfResponsibilities;

public class FirefightersChainItem implements ChainItem {

    @Override
    public boolean isMyResponsibility(String value) {
        return value.contains("fire");
    }

    @Override
    public void action(String value) {
        System.out.println("action for firefighters");
    }
}
