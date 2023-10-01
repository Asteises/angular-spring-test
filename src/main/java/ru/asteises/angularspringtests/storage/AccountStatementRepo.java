package ru.asteises.angularspringtests.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.angularspringtests.model.AccountStatement;

import java.util.UUID;

@Repository
public interface AccountStatementRepo extends JpaRepository<AccountStatement, UUID> {
}
