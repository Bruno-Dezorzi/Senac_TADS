import 'dart:io';

void main() {
  print("Digite dois números e vou descobrir qual é o maior e qual é o menor");
  int n1;
  int n2;

  stdout.write("Digite o primeiro número: ");

  n1 = int.parse(stdin.readLineSync()!);
  stdout.write("Digite o segundo número: ");
  n2 = int.parse(stdin.readLineSync()!);

  if (n1 > n2) {
    print("${n1} é maior que ${n2}");
  } else {
    print("${n2} é maior que ${n1}");
  }
}
