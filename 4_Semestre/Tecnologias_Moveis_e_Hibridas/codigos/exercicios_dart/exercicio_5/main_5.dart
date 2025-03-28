import 'dart:io';

void main() {
  print("Digite um número e eu mostratei sua tabuada");
  int numero = int.parse(stdin.readLineSync()!);

  int i = 1;
  while (i <= 10) {
    print("${numero} * ${i} = ${numero * i}");

    i++;
  }
}
