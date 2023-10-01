package ru.asteises.angularspringtests.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.asteises.angularspringtests.model.dto.AccountStatementDto;
import ru.asteises.angularspringtests.service.AccountStatementService;
import ru.asteises.angularspringtests.util.Endpoints;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(Endpoints.API)
public class AccountStatementController {

    private final AccountStatementService service;

    @GetMapping(Endpoints.GET_ALL_ACCOUNT_STATEMENT)
    public ResponseEntity<List<AccountStatementDto>> getAllAccountsStatement() {
        return new ResponseEntity<>(service.getAllAccountStatement(), HttpStatus.OK);
    }
}
