//importar a bibliote básica dos widget
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

//criar a função principal do app
class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    //criar o build principal
    return MaterialApp(
      title: 'Instragam Pirata', //titulo da aplicação
      debugShowCheckedModeBanner: false, // removo da interface a faixa de debug
      home: HomePage(), //defino a pagina inicial
    );
  }
}

//criar a tela inicial
class HomePage extends StatelessWidget {
  //lista das nossas imagens
  final List<Map<String, String>> posts = [
    {
      'image': 'assets/lands_01.jpg',
      'desc':
          'QUE SHOW DA XUXA É ESSE?????????????????????????????????????????',
    },
    {'image': 'assets/lands_02.jpg', 'desc': 'Que coisa absurda!'},
    {'image': 'assets/lands_03.jpg', 'desc': 'NANI?'},
    {'image': 'assets/lands_04.jpg', 'desc': 'Cuidado o tubarão vai te pegar'},
  ];

  //vamos passar uma da internet para ser a nossa img de perfil
  final String profileImage =
      'https://em-content.zobj.net/source/apple/391/smiling-face-with-sunglasses_1f60e.png';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      //fornece a estrutura básica
      appBar: AppBar(
        centerTitle: true,
        title: Text('InstraPirata'),
        backgroundColor: Colors.red,
      ), //barra de titulo
      body: ListView.builder(
        //Lista os posts que podem ser vistos
        itemCount: posts.length, //quantidade de itens na lista
        itemBuilder: (context, index) {
          //para cada item, criamos um PostCard (widget personalizado)
          return PostCard(
            imagePath: posts[index]['image']!,
            description: posts[index]['desc']!,
            profileImageurl: profileImage,
          );
        },
      ),
    );
  }
}

//vamos criar um widget que representa cada post do tipo cartão
class PostCard extends StatefulWidget {
  final String imagePath; //caminho da img do post
  final String description; //descrição do post
  final String profileImageurl; // url da img de perfil

  const PostCard({
    required this.imagePath,
    required this.description,
    required this.profileImageurl,
  });

  //cria o estado do widget
  @override
  State<PostCard> createState() => _PostCardState();
  //_PostCardState var privada
}

//classe que define o comportamento do PostCard quando ele muda
class _PostCardState extends State<PostCard> {
  bool isLiked = false; //indica se o post foi curtido
  int likeCount = 0; //contador de curtidas
  List<String> comments = []; //lista de comentários
  //criar um controlador para controlar o texto do campo comentário
  final TextEditingController _commentController = TextEditingController();

  //criar uma função para abrir a caixa de comentários, que vai estar
  //na parte de baixo da tela
  void _openCommentsBottomSheet() {
    showModalBottomSheet(
      context: context,
      isScrollControlled: true, //permite que a caixa ocupe mais
      //espaço da tela
      builder: (context) {
        return Padding(
          padding: MediaQuery.of(context).viewInsets, //adapta para
          //o tamanho do teclado
          child: ListView(
            shrinkWrap: true, //direciona o scroll
            children: [
              //listar os comentários existentes
              ...comments.map(
                (comment) => ListTile(
                  leading: Icon(Icons.comment),
                  title: Text(comment),
                ),
              ),
              //criar o campo para novos comentários
              Padding(
                padding: const EdgeInsets.all(8.0),
                child: TextField(
                  controller: _commentController, //controla o campo
                  decoration: InputDecoration(
                    hintText: 'Digite seu comentário...', //texto dica
                    suffixIcon: IconButton(
                      icon: Icon(Icons.send), //botão de enviar
                      onPressed: () {
                        if (_commentController.text.isNotEmpty) {
                          setState(() {
                            comments.add(
                              _commentController.text,
                            ); //adicionei o novo comentario
                          });
                          _commentController.clear(); //limpo o campo
                          Navigator.pop(context); //fecho o button sheet
                          _openCommentsBottomSheet(); //abrir para atualizar
                        }
                      },
                    ),
                  ),
                ),
              ),
            ],
          ),
        );
      },
    );
  }

  //Abre a tela do user
  void _openUserProfile() {
    Navigator.push(
      context,
      MaterialPageRoute(
        builder:
            (context) =>
                UserProfileScreen(profileImageurl: widget.profileImageurl),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final isAssetImage = !widget.imagePath.startsWith("http");
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start, //alinha itens a esquerda
      children: [
        //cabeçalho com img do perfil e o nome do usr
        ListTile(
          leading: GestureDetector(
            //detectar toque do usr
            onTap: _openUserProfile, //vai para o perfil do usr
            child: CircleAvatar(
              backgroundImage: NetworkImage(widget.profileImageurl),
            ),
          ),
          title: Text("Usuario Generico"),
        ),
        //exibe a img do post
        isAssetImage
            ? Image.asset(
              widget.imagePath,
              fit: BoxFit.cover,
              width: double.infinity,
            )
            : Image.network(
              widget.imagePath,
              fit: BoxFit.cover,
              width: double.infinity,
            ),
        //Linha de icones com botoes de curtir e comentar
        Row(
          children: [
            IconButton(
              //icone de curtir
              icon: Icon(
                isLiked
                    ? Icons.favorite
                    : Icons.favorite_border, //muda o icone se o usuario curtir
                color: isLiked ? Colors.red : Colors.grey, //muda a cor
              ),
              onPressed: () {
                setState(() {
                  isLiked = !isLiked; //alterna entre curtido e não curtido
                  likeCount += isLiked ? 1 : -1; // atualiza a contagem
                });
              },
            ),
            Text("$likeCount"), //mostra a qntde de curtidas
            IconButton(
              icon: Icon(Icons.comment),
              onPressed: _openCommentsBottomSheet, //abre os comentarios
            ),
            Text("${comments.length}"), //numero de comentarios
          ],
        ),
        //texto da descrição
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: 16.0),
          child: Text(widget.description),
        ),
        SizedBox(height: 20), //espaço abaixo do post
      ],
    );
  }
}

//tela que exibe o perfil do usr

class UserProfileScreen extends StatelessWidget {
  final String profileImageurl;
  const UserProfileScreen({required this.profileImageurl});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Perfil do Usuário")),
      body: Center(
        child: Column(
          mainAxisAlignment:
              MainAxisAlignment.center, //centralizamos verticalmente
          children: [
            CircleAvatar(
              radius: 50.0,
              backgroundImage: NetworkImage(profileImageurl), //img do perfil
            ),
            SizedBox(height: 20),
            Text(
              "Usuario genérico",
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            Text(
              "Descrição do usuário: TOMA MILKSHAKE DE MORANGOOO... NOOOO... É MUITO CREMOSO",
            ),
          ],
        ),
      ),
    );
  }
}
//https://dontpad.com/instrapirata