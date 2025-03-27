import 'dart:io';

void main() {
  print("Informe o primeiro número: ");
  double numero1 = double.parse(stdin.readLineSync()!);

  print("Informe a operação: ");
  String operacao = stdin.readLineSync()!;

  print("Informe o segundo número: ");
  double numero2 = double.parse(stdin.readLineSync()!);

  switch (operacao) {
    case "+":
      print("Soma: ${numero1 + numero2}");
      break;

    case "-":
      print("Diferença: ${numero1 - numero2}");
      break;

    case "*":
      print("Multiplicação: ${numero1 * numero2}");
      break;

    case "/":
      print("Divisão: ${numero1 / numero2}");
    default:
      print("Operação inválida");
  }
}
