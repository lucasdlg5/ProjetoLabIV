--liquibase formatted sql

--changeset kevin:201810211827
--comment:Insert registers into CLI_CLIENTE table

INSERT INTO CLI_CLIENTE (CLI_NOME,CLI_CPF,CLI_LOGIN,CLI_SENHA,END_ID,CLI_CONTATO) VALUES('KEVIN MIKIO','076.687.108-84','KEVIN.MIKIO','123',1,'(12)984672362');


--rollback DELETE FROM CLI_CLIENTE;