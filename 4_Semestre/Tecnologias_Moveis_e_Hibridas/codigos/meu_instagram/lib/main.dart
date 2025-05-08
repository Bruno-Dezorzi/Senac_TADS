//imports pacote material (importando os
//widgets básicos de interface)
import 'package:flutter/material.dart';

//criar função principal
void main() {
  runApp(MyApp()); //executa o aplicativo myapp
}

//criar o myapp
class MyApp extends StatelessWidget {
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
                imagePath: 'assets/lands_01.jpg',
                description: 'QUE SHOW DA XUXA É ESSE?',
              ),
              ImageCard(
                imagePath: 'assets/lands_02.jpg',
                description: 'COMO VOCÊ É BURRO',
              ),
              ImageCard(imagePath: 'assets/lands_03.jpg', description: 'NANI?'),
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
    required this.imagePath, //obrigando
    //o user a passa um caminho
    required this.description,
  });
  //criar o estado do widget
  State<ImageCard> createState() => _ImageCardState();
}

class _ImageCardState extends State<ImageCard> {
  bool isLiked = false; //indica se a imagem foi curtida
  int likeCount = 0; // quantidade de curtidas

  void toggleLike() {
    setState(() {
      isLiked = !isLiked;
      likeCount += isLiked ? 1 : -1;
    });

    @override
    Widget build(BuildContext context) {
      final screenWidth = MediaQuery.of(context).size.width;
      final screenHeight = MediaQuery.of(context).size.height;

      return Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Stack(
            children: [
              Image.asset(
                widget.imagePath,
                width: screenWidth,
                height: screenHeight,
                fit: BoxFit.cover,
              ),
              Positioned(
                bottom: 10,
                left: 10,
                child: Container(
                  padding: const EdgeInsets.all(8),
                  color: Colors.black54,
                  width: screenWidth * 0.9,
                  child: Text(
                    widget.description,
                    style: const TextStyle(color: Colors.white, fontSize: 18),
                  ),
                ),
              ),
            ],
          ),
        ],
      );
    }
  }
}
