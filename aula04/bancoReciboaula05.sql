select * from PESSOA
SELECT * FROM CIDADE
SELECT * FROM ENDERECO
SELECT * FROM RECIBO

insert into uf (nome)
values ('AC'),('AL'),('AP'),('AM'),('BA'),('CE'),('DF'),('ES'),('GO'),('MA'),('MT'),('MS'),('MG'),('PA'),('PB'),('PR'),('PE'),('PI'),('RJ'),
('RN'),('RS'),('RO'),('RR'),('SC'),('SP'),('SE'),('TO')

INSERT INTO CIDADE (NOME, UF_ID)
VALUES ('CURITIBA', 16), ('MARINGA', 16),('LUNARDELI', 16),('APUCARANA', 16),('SANTA FE', 16),('SAO MIGUEL DO IGUACU', 16),
('ARAPONGAS', 16),('PONTA GROSSA', 16),('JANDAIA DO SUL', 16)

INSERT INTO CIDADE(NOME, UF_ID)
VALUES ('CAMPINAS', 25),('BAURU',25),('SANTOS',25),('SAO PAULO',25),('JUNDIAI',25),('UBATUBA',25)

DELETE FROM RECIBO WHERE ID = 1

UPDATE RECIBO SET PRESTADOR_ID = CLIENTE_FK 



SELECT 
PESSOA.NOME,
UF.NOME,
CIDADE.NOME
FROM
PESSOA INNER JOIN CIDADE ON (CIDADE.ID = PESSOA.ID)
INNER JOIN UF ON (UF.ID = CIDADE.UF_ID)
  





ALTER TABLE recibo
change COLUMN prestador_id cliente_fk int;

INSERT INTO RECIBO (VALOR,CLIENTE_FK,EMITENTE_ID,DATAEMISSAO)
VALUES (1000.50, 10,9, '2018-09-25 09:30:00')







INSERT INTO PESSOA (NOME,DOCUMENTO)
VALUES ('MARIANA SANTOS', 841215485)

INSERT INTO ENDERECO (PESSOA_ID,CIDADE_ID,TIPOLOGRADOURO,LOGRADOURO,NUMERO,COMPLEMENTO,CEP,TIPO)
VALUES (10,4,'RUA','TOKYO',1100,'RESIDENCIA', 8745100,1)

SELECT
RECIBO.ID,
RECIBO.DATAEMISSAO,
RECIBO.VALOR,
PESSOA.NOME,
CIDADE.NOME,
UF.NOME,
emitente.nome,
estado.nome

FROM RECIBO
INNER JOIN PESSOA ON RECIBO.CLIENTE_FK = PESSOA.ID 
inner join endereco on endereco.pessoa_id = pessoa.id
INNER JOIN CIDADE ON PESSOA.ID = CIDADE.ID
INNER JOIN UF ON CIDADE.UF_ID = UF.ID
INNER JOIN PESSOA emitente ON RECIBO.emitente_id = emitente.ID 
inner join endereco emitend on emitend.pessoa_id = emitente.id
INNER JOIN CIDADE emicidade ON emitente.ID =emicidade.ID
INNER JOIN UF estado ON emicidade.UF_ID = estado.ID





SELECT UF.NOME, COUNT(*) FROM CIDADE
INNER JOIN UF ON UF.ID = CIDADE.UF_ID
GROUP BY UF.NOME;

select u.nome, count(r.id) as quantidadeRecibo from recibo r
inner join pessoa p on p.id = r.emitente_id
inner join endereco e on e.pessoa_id = p.id
inner join cidade c on c.id = e.cidade_id
inner join uf u on u.id = c.id
where u.nome = 'PR'
group by u.nome

