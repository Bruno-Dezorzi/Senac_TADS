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
  State<FormularioPageState> createState() => _FormularioPageState();
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
}
