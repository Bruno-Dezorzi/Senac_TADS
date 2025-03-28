import 'dart:io';

void main() {
  List<int> numeros = [];

  for (int i = 0; i < 5; i++) {
    stdout.write('Digite o ${i + 1}º número: ');
    numeros.add(int.parse(stdin.readLineSync()!));
  }

  numeros.sort();
  print('Números em ordem crescente: ${numeros.join(', ')}');
}
