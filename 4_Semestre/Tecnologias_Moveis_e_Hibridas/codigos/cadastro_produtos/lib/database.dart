
import 'package:sqflite/sqflite.dart';

import 'package:path/path.dart';

class Produto {
  int? id;
  String? nome;
  int? codigo;
  String? detalhes;

  Produto({this.id, this.nome, this.codigo, this.detalhes});

  Map<String, dynamic> toMap() {
    return {'id': id, 'nome': nome, 'codigo': codigo, 'detalhes': detalhes};
  }
}

//classe responsavel para gerenciar o banco de dados;

class DatabaseHelper {
  //instanciar uma unica classe(padrao singleton)
  static final DatabaseHelper _instance = DatabaseHelper._internal();
  //criar o construtor que vai retornar  mesma instancia
  factory DatabaseHelper() => _instance;
  //criar um construtor privado, interno
  DatabaseHelper._internal();

  //atributo privado que armazenara a instancia do banco de dados
  Database? _db;

  //metodo getter
  Future<Database> get db async {
    // se ja esta inicializado, retorna aconexão
    if (_db != null) return _db!;
    // se nao, induz a conexão
    _db = await _initDb();
    return _db!;
  }

  //metodo para inicializar o banco de dados
  Future<Database> _initDb() async {
    //definir o caminho para o DB
    final path = join(await getDatabasesPath(), 'produtos.db');
    //abrir o banco mas se nao houver, temos que criar um.
    return await openDatabase(path, version: 1, onCreate: _onCreate);
  }

  //metodo que é executado na criação do banco
  //aqui voces devem colocar todas as tabelas + inserts para um banco inicializar.
  Future<void> _onCreate(Database db, int version) async {
    await db.execute('''create table produtos(
      id integer primary key autoincrement,
      nome varchar(100),
      codigo integer unique,
      detalhes text
      )
''');
  }

  //retornar uma lista com todos os produtos
  Future<List<Produto>> getProdutos() async {
    //pegar a instancia do banco de dados
    final dbClient = await db;
    // fazer a consulta e armazenar o resultado dela
    final List<Map<String, dynamic>> maps = await dbClient.query('produtos');
    // converter cada item do retorno como um objeto
    return List.generate(maps.length, (i) {
      return Produto(
        id: maps[i]['id'],
        nome: maps[i]['nome'],
        codigo: maps[i]['codigo'],
        detalhes: maps[i]['detalhes'],
      );
    });
  }

  // insere novo produto
  Future<int> insertProduto(Produto produto) async {
    //obter o banco de dados
    final dbClient = await db;
    // insere o produto convertendo em map
    return await dbClient.insert('produtos', produto.toMap());
  }

  //Atualizar o produto
  Future<int> updateProduto(Produto produto) async{
    //obter o banco de dados
    final dbClient = await db;
    return await dbClient.update('produtos', 
    produto.toMap(),
    where: 'id=?',
    whereArgs: [produto.id]
    );
  }

  //Deletar produto
    Future<int> deleteProduto(int id) async{
      final dbClient = await db;
      return await dbClient.delete(
        'produtos',
        where: 'id = ?',
        whereArgs: [id],
      );
    }

  //Verificar a existencia de um produto com o codigo
  Future<bool> codigoExiste(int codigo) async{
    final dbClient = await db;
    final result = await dbClient.query(
      'produtos',
      where: 'codigo = ?',
      whereArgs: [codigo]
      );
    //verificar e retornar verdadeiro se existe um produto com esse código
    return result.isEmpty;

  }

}
