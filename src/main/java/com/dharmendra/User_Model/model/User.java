package com.dharmendra.User_Model.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
//@Table()
public class User {
    @Id
    private Integer userId;

    @NotNull(message = "UserName not be blank")
    private  String userName;
@Email(message = "UserEmail must be in appropriate format")
    private String userEmail;

    //  ^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$
  @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=])[A-Za-z\\d@#$%^&+=]{10,20}$", message = "Wrong password")
    private String userPassword;

    private LocalDate dob;

    @Pattern(regexp = "^\\+91[6-9][0-9]{9}$", message = "+xx-xxxxxxxxxx provide in this format")
    private String contactNumber;

   @Enumerated(EnumType.STRING)
    private Gender userGender;

    @Enumerated(EnumType.STRING)
    private Type userType;


}
