import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp(super.key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Teste 1",
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.redAccent),
      ),
      home: const MyHomePage(title: "TESTE 2"),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<StatefulWidget> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: Text(widget.title),
      ),
      body: Center(

      ),
      SingleChildScrollView(
        child: Padding(
          const EdgeInsets.all(16.0),
          child: Column(
            children: List.generate(
              20,
              (index) => Container(
                margin: EdgeInsets.symmetric(vertical: 8),
                color: Colors.amber,
                height: 100,
                child: Center(child: Text('Item $index'),)
              ),
            ),
          ),
        ),
      ),
  }
}
