package ru.asteises.angularspringtests.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AccountStatementDto {

    private Date date;
    private String type;
    private float incomeFunds;
    private float refund;
    private float credits;
    private float outstandingRefunds;
    private float outstandingCredits;

    private String accountNumber;
}
