package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account informtation"
)
public class CustomerDto {


    @Schema(
            description = "Name of the customer", example = "Omkar"
    )
    @NotEmpty(message = "Name cannot be null or empty.")
    @Size(min = 2, max = 40, message = "Customer name should be min 2 to max 40 characters.")
    private String name;


    @Schema(
            description = "Email of the customer", example = "Omkar@gmail.com"
    )
    @NotEmpty (message = "Email address cannot be null or empty.")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Enter a valid email address example: name@example.com")
    private String email;


    @Schema(
            description = "Mobile Number of the customer", example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits only.")
    private String mobileNumber;


    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
