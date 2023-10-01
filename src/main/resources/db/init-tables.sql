CREATE TABLE IF NOT EXISTS account
(
    id UUID PRIMARY KEY,
    organization VARCHAR,
    address VARCHAR
);

CREATE TABLE IF NOT EXISTS account_statement
(
    id UUID PRIMARY KEY,
    date TIMESTAMP,
    type VARCHAR,
    income_funds FLOAT,
    refund FLOAT,
    credits FLOAT,
    outstanding_refunds FLOAT,
    outstanding_credits FLOAT,
    account_id UUID,
    CONSTRAINT account_fk FOREIGN KEY (account_id) REFERENCES account (id)
);