import 'package:flutter/material.dart';

void main() {
  runApp(Myapp());
}

class Myapp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Flutter Layouts",
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Meu Instagram'),
          backgroundColor: Colors.blue,
        ),
        body: SingleChildScrollView(
          child: Column(
            children: const [
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

class ImageCard extends StatefulWidget {
  final String imagePath;
  final String description;

  const ImageCard({required this.imagePath, required this.description});

  State<ImageCard> createState() => createState();
}
