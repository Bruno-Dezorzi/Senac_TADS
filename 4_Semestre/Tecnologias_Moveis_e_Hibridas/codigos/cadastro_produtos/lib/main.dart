import 'package:flutter/material.dart';
import 'package:sqflite/sqlite_api.dart';
import 'database.dart';

void main(){
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: ProdutoListScreen(), //define a primeira tela
  ));
}

//criação da tela principal
//terá estado dinâmico

class ProdutoListScreen extends StatefulWidget {
  @override
  _ProdutoListScreen createState() => _ProdutoListScreenState();

}

//classe do estado da tela principal
//(onde fica os dados dos estados que mudarao com o tempo)
class _ProdutoListScreenState extends State<ProdutoListScreen>{
  //instanciar o helper do banco de dados
  final dbHelper = DatabaseHelper();
  //lista que irá armazenar os produtos do banco de dados
  List<Produto> produtos[];
  //metodo que executa a busca dos produtos
  @override
  void initState(){
    super.initState();
    _carregarProdutos();//metodo para carregar os produtos do bd
  }
  //metodo que atualiza a interface com os produtos
  Future<void> _carregarProdutos() async{
    final lista = await dbHelper.getProdutos();//busca dos produtos
    setState(() {
      produtos=lista;
    });
  }

  void _confirmaExclusao (int id){
    showDialog(
      context: context,
      builder: (_) => AlertDialog(
        title: Text('Confirmar'),
        content: Text("Deseja realmente excluir esse produto? Se estiver fazendo isso você é gay!"),
        actions: [
          //botão 'não', apenas fecha o pop-up
            TextButton(
              onPressed: ()=> Navigator.pop(context),
              child: Text('Não')
              ),
              // botão sim
              TextButton(onPressed: () async{
                await dbHelper.deleteProduto(id);
                Navigator.pop(context);
                _carregarProdutos();
              },
              child: Text("Sim"))
        ],
      )
    );
  }
  //metodo para adicionar ou editar um produto
  //abrir um formulario
  void _abrirFormulario({Produto? produto}) async{
    final resultado = await Navigator.push(
      context,
      MaterialPageRoute(
        builder: (_)=> ProdutoFormScreen(produto:produto),
      ),
    );
    if (resultado == true){
      _carregarProdutos();
    }

    @override
    Widget build(BuildContext context){
      return Scaffold(
        appBar: AppBar(
          title: const Text('Cadastro de Produtos'),
          flexibleSpace: Container(
            decoration: const BoxDecoration(
              gradient: LinearGradient(
                colors: [Colors.red, Colors.yellow],//cores gradientes do appbar
                begin: Alignment.topLeft,
                end: Alignment.topRight
              )
            ),
          ),
        ),
        body: ListView.builder(
          itemCount: produtos.length,
          itemBuilder: (context, index){
            final produto = produtos[index];
            return ListTile(
              title: Text(
                produto.nome!,
                style: TextStyle(fontWeight: FontWeight.bold),
              ),
              subtitle: Text(
                'Código: ${produto.codigo}',
                style: TextStyle(fontSize: 13),
              ),
              onTap: () => _abrirFormulario(produto: produto),
              trailing: IconButton(
                onPressed: () => _confirmaExclusao(produto.id!),
                icon: Icon(Icons.delete, color: Colors.red,)),
            );
          },
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: () => _abrirFormulario(),
          child: Icon(Icons.add),
          ),
      );
    }
  }
}

//tela de cadastro de edição de produto
class ProdutoFormScreen extends StatefulWidget{
  final Produto? produto; // o produto é opcional, se null então add
  ProdutoFormScreen({this.produto});

  @override
  ProdutoFormScreenState createState() => _ProdutoListScreenState();
}

class _ProdutoListScreenState extends State<ProdutoFormScreen>{
  final _formKey = GlobalKey<FormState>(); //chave do formulário para validação
  final dbHelper = DatabaseHelper();//instancia o helper do db

  late String nome;
  late String codigo;
  late String detalhes;

  //controladores
  late TextEditingController nomeCtrl;
  late TextEditingController codigoCtrl;
  late TextEditingController detalhesCtrl;

  @override
  void initState(){
    super.initState();
    nomeCtrl = TextEditingController(text: widget.produto?.nome ?? '');
    codigoCtrl = TextEditingController(text: widget.produto?.codigo.toString() ?? '');
    detalhesCtrl = TextEditingController(text: widget.produto?.detalhes ?? '');

  }

  void _salvar() async{
    if (_formKey.currentContext!.validate()){
      final novoProduto = Produto(
        id: widget.produto?.id,
        nome: nomeCtrl.text,
        codigo: int.parse(codigoCtrl.text),
        detalhes: detalhesCtrl.text,
      );
      //verifica se o código existe no banco
      final codigoExistente = await dbHelper.codigoExiste(novoProduto.codigo!);

      //se for um produto sendo editado...
      final codigoIgualDoMesmoProduto = widget.produto != null && widget.produto!.codigo == novoProduto.codigo;
      // se já existe, mostra um alerta
      if(codigoExistente && !codigoIgualDoMesmoProduto){
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text("Código existente")),
        );
        return;
      } 
    }
  }

}