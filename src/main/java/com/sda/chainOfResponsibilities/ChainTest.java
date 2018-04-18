package com.sda.chainOfResponsibilities;

import java.util.Scanner;

public class ChainTest {
    public static void main(String[] args) {
        EmergencyCenter emergencyCenter = new EmergencyCenter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String value = scanner.nextLine();
            emergencyCenter.emergency(value);

        }
    }
}
