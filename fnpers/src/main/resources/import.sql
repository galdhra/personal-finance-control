-- tb_user 
INSERT INTO tb_user (birth_date, profile_creation_date, email, name, profession) VALUES ('1990-05-10 00:00:00', '2024-01-01 10:00:00', 'user1@example.com', 'João Silva', 'Engenheiro');
INSERT INTO tb_user (birth_date, profile_creation_date, email, name, profession) VALUES ('1985-08-20 00:00:00', '2024-02-01 11:30:00', 'user2@example.com', 'Maria Souza', 'Médica');

-- tb_account
INSERT INTO tb_account (name, user_id) VALUES ('Conta Principal João', 1);
INSERT INTO tb_account (name, user_id) VALUES ('Conta Principal Maria', 2);

-- tb_bank 
INSERT INTO tb_bank (name, place) VALUES ('Banco do Brasil', 13592);
INSERT INTO tb_bank (name, place) VALUES ('Caixa Econômica', 24372);

--tb_bank_account
INSERT INTO tb_bank_account(name, number, type, account_id, bank1_id) VALUES ('conta principal', 678901, 0, 1, 2);
INSERT INTO tb_bank_account(name, number, type, account_id, bank1_id) VALUES ('reserva de emergência', 123456, 0, 2, 1);

-- tb_category 
INSERT INTO tb_category (name) VALUES ('Alimentação');
INSERT INTO tb_category (name) VALUES ('Transporte');

-- tb_credit_card 
INSERT INTO tb_credit_card (credit_limit, number, payed, due_date, banner, name, account_id, bank2_id) VALUES (5000.0, 123456, False, '2025-06-10 00:00:00', 'Visa', 'Cartão João', 1, 2);
INSERT INTO tb_credit_card (credit_limit, number, payed, due_date, banner, name, account_id, bank2_id) VALUES (3000.0, 654321, True, '2025-06-15 00:00:00', 'Mastercard', 'Cartão Maria', 1, 2);

-- tb_budget 
INSERT INTO tb_budget (planned_pay, real_pay, name, account_id, category_id) VALUES (1000.0, 950.0, 'Orçamento Alimentação João', 1, 2);
INSERT INTO tb_budget (planned_pay, real_pay, name, account_id, category_id) VALUES (500.0, 600.0, 'Orçamento Transporte Maria', 2, 1);

-- tb_expense 
INSERT INTO tb_expense (amount, pay_method, payed, recurring, stallment, type, date, description, name, observation, account_id, category_id) VALUES (200.0, 1, True, False, False, 1, '2025-05-01 00:00:00', 'Mercado', 'Compra mês', 'Sem observações', 1, 2);
INSERT INTO tb_expense (amount, pay_method, payed, recurring, stallment, type, date, description, name, observation, account_id, category_id) VALUES (100.0, 2, False, True, True, 2, '2025-05-02 00:00:00', 'Ônibus', 'Vale transporte', 'Reembolso pendente', 2, 1);

-- tb_debt
INSERT INTO tb_debt (amount, interest, origin, payed, stallment, type, account_id, due_date, expense_id, name) VALUES (500.0, 5.0, 100.0, False, True, 2, 1, '2025-07-01 00:00:00', 1, 'Dívida cartão João');
INSERT INTO tb_debt (amount, interest, origin, payed, stallment, type, account_id, due_date, expense_id, name) VALUES (300.0, 3.0, 150.0, True, False, 1, 2, '2025-06-15 00:00:00', 2, 'Dívida boleto Maria');

-- tb_income 
INSERT INTO tb_income (amount, type, date, name, observation, source, account_id, category_id)  VALUES (3000.0, 1, '2025-05-01 00:00:00', 'Salário João', 'Recebido via PIX', 'Empresa A', 1, 2);
INSERT INTO tb_income (amount, type, date, name, observation, source, account_id, category_id)  VALUES (4000.0, 2, '2025-05-01 00:00:00', 'Salário Maria', 'Recebido via TED', 'Empresa B', 2, 1);

-- tb_investiment 
INSERT INTO tb_investiment (initial_amount, redemption, date, name, observation, account_id, bank3_id) VALUES (2000.0, 1, '2025-03-01 00:00:00', 'CDB João', 'Rende 110% CDI', 1, 2);
INSERT INTO tb_investiment (initial_amount, redemption, date, name, observation, account_id, bank3_id) VALUES (1500.0, 2, '2025-04-01 00:00:00', 'Tesouro Maria', 'Liquidez D+1', 2, 1);

-- tb_goal 
INSERT INTO tb_goal (now_amount, target, due, name, observation, account_id, budget_id, category_id)VALUES (5000.0, 1, '2025-12-31 00:00:00', 'Viagem João', 'Meta de férias', 1 ,2 ,1);
INSERT INTO tb_goal (now_amount, target, due, name, observation, account_id, budget_id, category_id) VALUES (3000.0, 2, '2025-11-30 00:00:00', 'Notebook Maria', 'Compra parcelada', 2, 1, 2);
