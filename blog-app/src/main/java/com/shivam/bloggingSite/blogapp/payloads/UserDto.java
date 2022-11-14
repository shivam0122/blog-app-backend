package com.shivam.bloggingSite.blogapp.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    @NotEmpty
    @Size(min = 4, message = "Username name must be greater than 4 characters")
    private String name;

    @Email(message = "Email must be a Valid One!")
    private String email;

    @NotNull
    @Size(min = 5, max = 10, message = "Password must be between 5 and 10 character")
    private String password;

    @NotNull
    private String about;
}
