package com.sda.builder;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor()
@Data
public class UserWithLombok {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phoneNumber;


}
