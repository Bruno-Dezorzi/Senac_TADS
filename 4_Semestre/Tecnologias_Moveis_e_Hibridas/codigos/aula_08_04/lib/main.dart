import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

//widget principal

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Formulário TMh',
      home: const FormularioPage(),
      debugShowCheckedModeBanner: false,
    );
  }
}

//tela principal do formulário
class FormularioPage extends StatefulWidget {
  const FormularioPage({super.key});

  @override
  State<FormularioPage> createState() => _FormularioPageState();
}

class _FormularioPageState extends State<FormularioPage> {
  //controladores dos campos de trexto
  final TextEditingController _nomeController = TextEditingController();
  final TextEditingController _emailController = TextEditingController();
  // variavel para validar e controlar o endereço email
  bool _emailInvalido = false;

  //função para coletar as informaciones
  void _enviarFormulario() {
    String nome = _nomeController.text.trim();
    String email = _emailController.text.trim();

    // Validação Email
    if (!email.contains('@')) {
      setState(() {
        _emailInvalido = true;
      });
      return;
    }

    setState(() {
      _emailInvalido = false;
    });

    // exibir pop-up
    showDialog(
      context: context,
      builder:
          (context) => AlertDialog(
            title: const Text('Dados inseridos'),
            content: Text('Nome: $nome \nE-mail: $email'),
            actions: [
              TextButton(
                onPressed: () {
                  Navigator.of(context).pop(); // fechar o dialogo(pop-up)
                  // mostrar mensagem final
                  ScaffoldMessenger.of(context).showSnackBar(
                    const SnackBar(
                      content: Text('As informações foram gravadas, VALEU!'),
                    ),
                  );
                  _nomeController.clear();
                  _emailController.clear();
                },
                child: const Text('OK'),
              ),
            ],
          ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      //cor de fundo
      backgroundColor: Colors.lightGreen[100],
      body: SafeArea(
        child: Column(
          children: [
            // titulo
            Container(
              width: double.infinity,
              padding: const EdgeInsets.all(20),
              color: Colors.lightBlue[100],
              child: const Center(
                child: Text(
                  'Formulário de TMH',
                  style: TextStyle(
                    fontSize: 24,
                    fontWeight: FontWeight.bold,
                    color: Colors.orange,
                  ),
                ),
              ),
            ),
            const SizedBox(height: 30),
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 20),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  const Text(
                    'Insira seu nome: ',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.black,
                    ),
                  ),
                  TextField(
                    controller: _nomeController,
                    decoration: const InputDecoration(
                      border: OutlineInputBorder(),
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(height: 20),
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 20),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  const Text(
                    'Insira seu email: ',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.black,
                    ),
                  ),
                  TextField(
                    controller: _emailController,
                    decoration: InputDecoration(
                      border: OutlineInputBorder(),
                      errorText: _emailInvalido ? 'Email invalido' : null,
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(height: 30),
            //criar o botão enviar
            ElevatedButton(
              onPressed: _enviarFormulario,
              child: const Text('Enviar!'),
            ),
          ],
        ),
      ),
    );
  }
}
