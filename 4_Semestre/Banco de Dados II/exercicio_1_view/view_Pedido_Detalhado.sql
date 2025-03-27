DROP VIEW IF EXISTS view_Pedido_Detalhado;
CREATE VIEW view_Pedido_Detalhado 
AS


SELECT 
    p.idpedido AS "Número do pedido",
    par.nome AS "Nome do Parceiro",
    CONCAT(e_parc.logradouro, ', ', e_parc.numero, ' - ', c_parc.nome, ', ', est_parc.sigla) AS "Endereço do Parceiro",
    tp.descricao AS "Tabela de preço",
    cp.descricao AS "Condição de pagamento",
    u.nome AS "Nome do Usuário",
    CONCAT(e_user.logradouro, ', ', e_user.numero, ' - ', c_user.nome, ', ', est_user.sigla) AS "Endereço do Usuário"
FROM pedido p
INNER JOIN parceiro par ON p.idparceiro = par.idparceiro
LEFT JOIN endereco e_parc ON e_parc.idparceiro = par.idparceiro
LEFT JOIN cidade c_parc ON e_parc.idcidade = c_parc.idcidade
LEFT JOIN estado est_parc ON c_parc.idestado = est_parc.idestado
INNER JOIN tabelapreco tp ON p.idtabelapreco = tp.idtabelapreco
INNER JOIN condicaopagamento cp ON p.idcondicaopagamento = cp.idcondicaopagamento
INNER JOIN usuario u ON p.idusuario = u.idusuario
LEFT JOIN endereco e_user ON e_user.idusuario = u.idusuario
LEFT JOIN cidade c_user ON e_user.idcidade = c_user.idcidade
LEFT JOIN estado est_user ON c_user.idestado = est_user.idestado
ORDER BY p.idpedido asc;



