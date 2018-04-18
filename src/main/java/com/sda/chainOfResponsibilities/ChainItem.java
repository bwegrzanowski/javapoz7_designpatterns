package com.sda.chainOfResponsibilities;

public interface ChainItem {
    boolean isMyResponsibility(String value);

    void action(String value);
}
