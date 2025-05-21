//imports pacote material (importando os
//widgets básicos de interface)
import 'package:flutter/material.dart';

//criar função principal
void main() {
  runApp(MyApp()); //executa o aplicativo myapp
}

//criar o myapp
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      //envolve todo com uma estrutura
      title: 'Flutter Layouts', //titulo da app
      debugShowCheckedModeBanner: false, //remover a faixa de debug
      home: Scaffold(
        //Define a estrutura base do flutter
        appBar: AppBar(
          title: const Text('Meu Instagram'), //define titulo da barra
          backgroundColor: Colors.blue, //colocamos uma cor
        ),
        body: SingleChildScrollView(
          //permitir a rolagem da tela na vertical
          child: Column(
            //criar um coluna para empilhar os widgets verticalmente
            children: const [
              //criar uma lista de filhos
              ImageCard(
                imagePath: 'assets/desert.jpg',
                description: 'Um deserto muito louco',
              ),
              ImageCard(
                imagePath: 'assets/alps.jpg',
                description: 'Um morro bem legal',
              ),
              ImageCard(
                imagePath: 'assets/beach.jpg',
                description: 'Uma praia deserta',
              ),
            ],
          ),
        ),
      ),
    );
  }
}

//criar um widget personalizado para upar as imagens
class ImageCard extends StatefulWidget {
  final String imagePath; //recebe o caminho da img
  final String description; //recebe a descrição da img

  const ImageCard({
    super.key,
    required this.imagePath, //obrigando
    //o user a passa um caminho
    required this.description,
  });
  //criar o estado do widget
  @override
  State<ImageCard> createState() => _ImageCardState();
}

class _ImageCardState extends State<ImageCard> {
  bool isLiked = false; //indica se a image foi curtida
  int likeCount = 0; // quantidade de curtidas

  //criar a função para contabilizar os likes (estados de curtir)
  void toggleLike() {
    setState(() {
      isLiked = !isLiked; // inverte o valor
      likeCount +=
          isLiked ? 1 : -1; // incrementa ou decrementa o valor da curtida
    });
  }

  @override
  Widget build(BuildContext context) {
    final screenWidth =
        MediaQuery.of(context).size.width; //pega a largura da tela

    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Stack(
          //sobrepor wigets uns sobre os otros
          children: [
            Image.asset(
              widget.imagePath, //pega o caminho da imagem
              width: screenWidth, //pega a largura do celular
              height: 250,
              fit: BoxFit.cover, //preencher a imagem sem distorcer
            ),
            Positioned(
              //posiciona (criar um conteiner para a descrição da imagem encima da imagem)
              bottom: 10,
              left: 10,
              child: Container(
                padding: const EdgeInsets.all(8),
                color: Colors.black54, //efeito do fundo semitransparente
                width: screenWidth * 0.9,
                child: Text(
                  widget.description,
                  style: const TextStyle(color: Colors.white, fontSize: 18),
                ),
              ),
            ),
          ],
        ),
        Padding(
          //espaçamento dos botões
          padding: const EdgeInsets.symmetric(horizontal: 12.0, vertical: 8.0),
          child: Row(
            //cria uma linha de icones: curtida, comentario e compartilhar
            children: [
              GestureDetector(
                //detectar o toque no curtir
                onTap: toggleLike, //chamar a funções ao ser tocado
                child: Icon(
                  isLiked ? Icons.favorite : Icons.favorite_border,
                  color:
                      isLiked
                          ? Colors.red
                          : Colors.black, //cor conforme o estado
                ),
              ),
            ],
          ),
        ),
      ],
    );
  }
}
