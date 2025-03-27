import 'dart:io';

void main() {
  print("Escolha um número e vou descobrir se é par ou ímpar");

  int numero = int.parse(stdin.readLineSync()!);

  if (numero % 2 == 0) {
    print("É par");
  } else {
    print("É ímpar");
  }
}
