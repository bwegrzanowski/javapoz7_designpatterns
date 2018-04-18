package com.sda.chainOfResponsibilities;

public class DefaultChainItem implements ChainItem {

    @Override
    public boolean isMyResponsibility(String value) {
        return true;
    }

    @Override
    public void action(String value) {
        System.out.println("default chain item");
    }
}
