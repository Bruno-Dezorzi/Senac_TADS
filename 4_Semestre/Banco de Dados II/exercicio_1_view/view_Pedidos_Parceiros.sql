DROP VIEW IF EXISTS view_Pedidos_Parceiros;
CREATE VIEW view_Pedidos_Parceiros 
AS

SELECT 
    ped.idpedido AS "Número do Pedido",
    ped.data AS "Data do Pedido",
    ped.valortotal AS "Valor do Pedido",
    ped.quantidadeprodutos AS "Quantidade de Produtos",
    par.idparceiro AS "ID do Parceiro",
    par.nome AS "Nome do Parceiro",
    CONCAT(e.logradouro, ', ', e.numero, ' - ', c.nome, ', ', est.sigla, ', ', p.nome) AS "Endereço do Parceiro",
    t.numero AS "Telefone do Parceiro"
FROM pedido ped
INNER JOIN parceiro par ON ped.idparceiro = par.idparceiro
LEFT JOIN endereco e ON e.idparceiro = par.idparceiro
LEFT JOIN cidade c ON e.idcidade = c.idcidade
LEFT JOIN estado est ON c.idestado = est.idestado
LEFT JOIN pais p ON est.idpais = p.idpais
LEFT JOIN telefone t ON t.idparceiro = par.idparceiro
ORDER BY ped.idpedido ASC;