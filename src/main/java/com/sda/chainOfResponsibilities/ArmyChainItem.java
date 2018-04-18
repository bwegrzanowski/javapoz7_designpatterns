package com.sda.chainOfResponsibilities;

public class ArmyChainItem implements ChainItem{
    @Override
    public boolean isMyResponsibility(String value) {
        return value.contains("war");
    }

    @Override
    public void action(String value) {
        System.out.println("action for army");
    }
}
