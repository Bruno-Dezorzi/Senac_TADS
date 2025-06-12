import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
      ),
      home: Scaffold(
        backgroundColor: Colors.black,
        body: Padding(
          padding: const EdgeInsets.only(
            left: 0,
            top: 50,
            right: 0,
            bottom: 50,
          ),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Container(
                    color: const Color.fromARGB(255, 114, 7, 255),
                    width: 100,
                    height: 100,
                  ),
                  Container(
                    color: const Color.fromARGB(255, 238, 54, 244),
                    width: 100,
                    height: 100,
                  ),
                  Container(
                    color: const Color.fromARGB(255, 76, 152, 175),
                    width: 100,
                    height: 100,
                  ),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Container(color: Colors.amber, width: 100, height: 100),
                  Container(color: Colors.red, width: 100, height: 100),
                  Container(color: Colors.green, width: 100, height: 100),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Container(
                    color: const Color.fromARGB(255, 7, 85, 255),
                    width: 100,
                    height: 100,
                  ),
                  Container(
                    color: const Color.fromARGB(255, 201, 110, 25),
                    width: 100,
                    height: 100,
                  ),
                  Container(color: Colors.green, width: 100, height: 100),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
