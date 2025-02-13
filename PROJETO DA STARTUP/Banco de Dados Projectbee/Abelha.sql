DELETE FROM abelha;

INSERT INTO abelha 
VALUES 
    (1, 'Apis mellifera', 'Abelha europeia', 'Apidae', 'Apis', 'mellifera', 'América do Norte', 'Florestas tropicais', 'Sociável', 2.3, 'Amarelo', 'Polinizador', 'Pouco preocupante', 3.5, 'Colmeia 1', 'Néctar, Pólen', '00001', 'Observação qualquer', TRUE),
    (2, 'Bombus terrestris', 'Mamangava', 'Apidae', 'Bombus', 'terrestris', 'Europa', 'Pradarias', 'Solitário', 3.8, 'Preto', 'Produtor de mel', 'Quase ameaçada', 4.2, 'Colmeia 2', 'Pólen', '00003','Observação qualquer', FALSE),
    (3, 'Xylocopa virginica', 'Abelha carpinteira', 'Apidae', 'Xylocopa', 'virginica', 'América do Sul', 'Desertos', 'Parasita', 4.1, 'Vermelho', 'Desempenha papel na cadeia alimentar', 'Vulnerável', 2.9, 'Colmeia 3', 'Mel', '00005', 'Observação qualquer', TRUE),
    (4, 'Megachile rotundata', 'Abelha cortadeira', 'Megachilidae', 'Megachile', 'rotundata', 'África', 'Montanhas', 'Comunitário', 2.7, 'Azul', 'Reciclador de nutrientes', 'Em perigo', 5.6, 'Colmeia 4', 'Seiva', '00007','Observação qualquer', FALSE),
    (5, 'Melipona quadrifasciata', 'Uruçu-amarela', 'Meliponini', 'Melipona', 'quadrifasciata', 'América do Sul', 'Ambientes urbanos', 'Sociável', 3.2, 'Amarelo', 'Produtor de mel', 'Quase ameaçada', 2.7, 'Colmeia 5', 'Néctar, Pólen', '00009', 'Observação qualquer', TRUE),
    (6, 'Anthophora abrupta', 'Abelha das orquídeas', 'Apidae', 'Anthophora', 'abrupta', 'América do Norte', 'Savanas', 'Solitário', 2.5, 'Preto', 'Desempenha papel na cadeia alimentar', 'Pouco preocupante', 2.3, 'Colmeia 6', 'Pólen', '00011', 'Observação qualquer', FALSE),
    (7, 'Osmia lignaria', 'Mandaguari', 'Megachilidae', 'Osmia', 'lignaria', 'Europa', 'Manguezais', 'Parasita', 3.6, 'Vermelho', 'Controlador de pragas', 'Vulnerável', 2.8, 'Colmeia 7', 'Seiva', '00013', 'Observação qualquer', TRUE),
    (8, 'Andrena haemorrhoa', 'Abelha de fogo', 'Andrenidae', 'Andrena', 'haemorrhoa', 'Ásia', 'Florestas temperadas', 'Sociável', 3.1, 'Azul', 'Espécie-chave', 'Pouco preocupante', 3.2, 'Colmeia 8', 'Néctar, Pólen', '00015', 'Observação qualquer', FALSE),
    (9, 'Euglossa imperialis', 'Euglossina', 'Apidae', 'Euglossa', 'imperialis', 'América do Sul', 'Pântanos', 'Nomádico', 2.9, 'Amarelo', 'Indicador de qualidade ambiental', 'Quase ameaçada', 3.8, 'Colmeia 9', 'Néctar', '00017', 'Observação qualquer', TRUE),
    (10, 'Lasioglossum leucozonium', 'Lasioglossum', 'Halictidae', 'Lasioglossum', 'leucozonium', 'Oceania', 'Áreas costeiras', 'Inquieto', 2.2, 'Verde', 'Engenheiro de ecossistemas', 'Pouco preocupante', 3.5, 'Colmeia 10', 'Néctar, Pólen', '00019', 'Observação qualquer', FALSE),
    (11, 'Apis cerana', 'Abelha asiática', 'Apidae', 'Apis', 'cerana', 'Ásia', 'Florestas tropicais', 'Sociável', 2.6, 'Amarelo', 'Polinizador', 'Vulnerável', 2.9, 'Colmeia 11', 'Néctar, Pólen', '00021','Observação qualquer', TRUE),
    (12, 'Trigona carbonaria', 'Marmelada', 'Apidae', 'Trigona', 'carbonaria', 'América do Sul', 'Florestas tropicais', 'Comunitário', 3.0, 'Vermelho', 'Produtor de mel', 'Quase ameaçada', 3.1, 'Colmeia 12', 'Mel', '00023','Observação qualquer', FALSE),
    (13, 'Bee', 'Bumblebee', 'Apidae', 'Bombus', 'bimaculatus', 'América do Norte', 'Florestas temperadas', 'Sociável', 3.2, 'Amarelo', 'Polinizador', 'Quase ameaçada', 2.7, 'Colmeia 13', 'Néctar, Pólen', '00025','Observação qualquer', TRUE),
    (14, 'Stingless bee', 'Tetragonisca angustula', 'Apidae', 'Tetragonisca', 'angustula', 'América do Sul', 'Florestas tropicais', 'Comunitário', 2.9, 'Preto', 'Produtor de mel', 'Pouco preocupante', 3.8, 'Colmeia 14', 'Mel, Cerume', '00027','Observação qualquer', FALSE),
    (15, 'Carpenter bee', 'Xylocopa violacea', 'Apidae', 'Xylocopa', 'violacea', 'Europa', 'Pradarias', 'Solitário', 3.6, 'Azul', 'Controlador de pragas', 'Vulnerável', 2.8, 'Colmeia 15', 'Pólen', '00029','Observação qualquer', TRUE),
    (16, 'Leafcutter bee', 'Megachile centuncularis', 'Megachilidae', 'Megachile', 'centuncularis', 'Ásia', 'Montanhas', 'Comunitário', 2.8, 'Vermelho', 'Reciclador de nutrientes', 'Quase ameaçada', 3.1, 'Colmeia 16', 'Seiva', '00031', 'Observação qualquer', FALSE),
    (17, 'Mining bee', 'Andrena agilissima', 'Andrenidae', 'Andrena', 'agilissima', 'América do Norte', 'Ambientes urbanos', 'Solitário', 2.5, 'Amarelo', 'Espécie-chave', 'Pouco preocupante', 2.3, 'Colmeia 17', 'Pólen', '00033','Observação qualquer', TRUE),
    (18, 'Sweat bee', 'Halictus rubicundus', 'Halictidae', 'Halictus', 'rubicundus', 'África', 'Desertos', 'Comunitário', 2.7, 'Verde', 'Indicador de qualidade ambiental', 'Em perigo', 4.2, 'Colmeia 18', 'Néctar', '00035','Observação qualquer', FALSE),
    (19, 'Mason bee', 'Osmia bicornis', 'Megachilidae', 'Osmia', 'bicornis', 'Oceania', 'Savanas', 'Parasita', 3.4, 'Preto', 'Engenheiro de ecossistemas', 'Pouco preocupante', 3.5, 'Colmeia 19', 'Seiva', '00037','Observação qualquer', TRUE),
    (20, 'Squash bee', 'Peponapis pruinosa', 'Apidae', 'Peponapis', 'pruinosa', 'América do Sul', 'Pântanos', 'Nomádico', 2.6, 'Laranja', 'Agente de dispersão de sementes', 'Quase ameaçada', 3.8, 'Colmeia 20', 'Néctar', '00039', 'Observação qualquer', FALSE)
    ;

 ALTER TABLE abelha DROP PRIMARY KEY;
ALTER TABLE abelha MODIFY COLUMN id_especie INT AUTO_INCREMENT PRIMARY KEY;
