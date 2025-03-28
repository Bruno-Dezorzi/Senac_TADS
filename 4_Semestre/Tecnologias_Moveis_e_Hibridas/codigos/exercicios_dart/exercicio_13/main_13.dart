import 'dart:io';

void main() {
  List<int> numeros = [];
  int contagemPares = 0;

  for (int i = 0; i < 10; i++) {
    stdout.write('Digite o ${i + 1}º número: ');
    int num = int.parse(stdin.readLineSync()!);
    numeros.add(num);

    if (num % 2 == 0) {
      contagemPares++;
    }
  }

  // Exibe a quantidade de números pares
  print('Números pares: $contagemPares');
}
