package com.sda.builder;

import java.util.Arrays;

public class UserTest {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Jan")
                .lastName("Nowak")
                .phoneNumber("98329u4")
                .birthDate("01-01-1971")
                .build();

//        rownowazne z:
//        user.setFirstName("jan");
//        user.setLastName("Nowak");
//        user.setBirthDate("01-01-1991");
//        user.setPhoneNumber("9893892389");

        Arrays.asList(User.builder()
                        .firstName("Jan")
                        .lastName("Nowak")
                        .phoneNumber("98329u4")
                        .birthDate("01-01-1971")
                        .build(),
                User.builder().firstName("adada").build());

//
        UserWithLombok userWithLombok = new UserWithLombok();
    }
}
