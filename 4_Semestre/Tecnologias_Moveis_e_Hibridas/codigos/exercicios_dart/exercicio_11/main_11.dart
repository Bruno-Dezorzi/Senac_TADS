import 'dart:io';

void main() {
  stdout.write('Digite um número: ');
  int n1 = int.parse(stdin.readLineSync()!);
  stdout.write('Digite um número: ');
  int n2 = int.parse(stdin.readLineSync()!);
  int resultado = n1 + n2;
  print('A soma dos dígitos é $resultado');
}
