DROP VIEW IF EXISTS view_Pedidos_Usuarios;
CREATE VIEW view_Pedidos_Usuarios 
AS

SELECT 
    u.nome AS "Nome do Usuário",
    COALESCE(SUM(ped.quantidadeprodutos), 0) AS "Quantidade de Produtos",
    COALESCE(MAX(ped.valortotal), 0) AS "Valor do Maior Pedido",
    COALESCE(MIN(ped.valortotal), 0) AS "Valor do Menor Pedido"
FROM usuario u
LEFT JOIN pedido ped ON ped.idusuario = u.idusuario
GROUP BY u.idusuario, u.nome
ORDER BY "Quantidade de Produtos" DESC;
