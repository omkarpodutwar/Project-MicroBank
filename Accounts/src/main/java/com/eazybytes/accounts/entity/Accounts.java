package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity //tells the Jpa, treat this class as representation for the table name `customer`
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    @Id //acc no. is usually 10 dig no. thrf. Generation Type is not mentioned as it will start with single digit nos.
    private Long accountNumber;

    private Long customerId;

    private String accountType;

    private String branchAddress;
}
