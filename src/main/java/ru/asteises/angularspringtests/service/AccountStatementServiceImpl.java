package ru.asteises.angularspringtests.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.asteises.angularspringtests.model.AccountStatement;
import ru.asteises.angularspringtests.model.dto.AccountStatementDto;
import ru.asteises.angularspringtests.storage.AccountStatementRepo;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class AccountStatementServiceImpl implements AccountStatementService {

    private final AccountStatementRepo repo;
    @Override
    public List<AccountStatementDto> getAllAccountStatement() {
        List<AccountStatement> accountStatements = repo.findAll();

    }
}
