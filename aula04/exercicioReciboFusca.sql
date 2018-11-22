DELETE FROM endereco WHERE ID = 3

SELECT * FROM cidade

select * from endereco

insert into endereco (pessoa_id,cidade_id,tipoLogradouro,Logradouro,numero,complemento,cep,tipo) 
values (3,8, 'Rua','Santos Dumont', 500, 'Comercial', 87415411,0)

 

UPDATE endereco SET cidade_id = 9 where cidade_id = 20

SELECT CIDADE.NOME, UF.NOME FROM CIDADE 
INNER JOIN UF ON UF.ID = CIDADE.UF_ID
ORDER BY UF.NOME

select COUNT (nome)
from cidade
where uf_id = 20;


