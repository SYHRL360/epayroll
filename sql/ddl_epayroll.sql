
-- creating account table
CREATE TABLE IF NOT EXISTS wdl.account (
    id SERIAL PRIMARY KEY,
    account_number VARCHAR(20) NOT NULL,
    account_name VARCHAR(30) NOT NULL,
    currency VARCHAR(5) NOT NULL DEFAULT 'IDR'
);

-- creating an index for faster by account number
CREATE INDEX idx_account_number ON wdl.account(account_number);


-- creating bank_statement table
CREATE TABLE IF NOT EXISTS wdl.bank_statement (
    id SERIAL PRIMARY KEY,
    company_account_number VARCHAR(20) NOT NULL,
    transaction_id VARCHAR(30) NOT NULL,
    description TEXT DEFAULT NULL,
    transaction_amount NUMERIC(19) NOT NULL DEFAULT 0,
    balance NUMERIC(19) NOT NULL DEFAULT 0 CHECK (balance >= 0),
    transaction_date TIMESTAMP DEFAULT NULL
);

-- creating an index for faster by transaction_id
CREATE INDEX idx_transaction_id ON wdl.bank_statement(transaction_id);

-- creating payroll_transaction table
CREATE TABLE IF NOT EXISTS wdl.payroll_transaction (
    id SERIAL PRIMARY KEY,
    transaction_id VARCHAR(30) NOT NULL,
    recipient_account_number VARCHAR(20) NOT NULL,
    recipient_account_name VARCHAR(30) NOT NULL,
    bank_name VARCHAR(30) NOT NULL DEFAULT 'BNI',
    transaction_amount NUMERIC(19) NOT NULL DEFAULT 0,
    transaction_date TIMESTAMP DEFAULT NULL,
    description TEXT DEFAULT NULL,
    sender_account_number VARCHAR(20) NOT NULL,
    approval_status INT NOT NULL
);


-- creating an index for faster by transaction_id
CREATE INDEX idx_transaction_id ON wdl.payroll_transaction(transaction_id);
