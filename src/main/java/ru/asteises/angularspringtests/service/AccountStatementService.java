package ru.asteises.angularspringtests.service;

import org.springframework.stereotype.Service;
import ru.asteises.angularspringtests.model.dto.AccountStatementDto;

import java.util.List;

@Service
public interface AccountStatementService {

    List<AccountStatementDto> getAllAccountStatement();
}
