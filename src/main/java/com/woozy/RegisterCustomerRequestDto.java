package com.woozy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCustomerRequestDto {
    private String firstName;
    private String lastName;
    @NotBlank(message = "Email can not be null")
    private String email;
    @NotBlank(message = "Password can not be null")
    private String password;
    private String mobileNumber;
    private Integer age;
    private String drivingLicense;
    private String address;
}
