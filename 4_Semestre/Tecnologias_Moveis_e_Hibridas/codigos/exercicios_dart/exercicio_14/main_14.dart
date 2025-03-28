import 'dart:io';

void main() {
  List<List<int>> matrizA = List.generate(5, (_) => List.filled(5, 0));
  List<List<int>> matrizB = List.generate(5, (_) => List.filled(5, 0));
  List<List<int>> matrizResultado = List.generate(5, (_) => List.filled(5, 0));

  print('Digite os valores para a Matriz A (5x5):');
  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      stdout.write('A[$i][$j]: ');
      matrizA[i][j] = int.parse(stdin.readLineSync()!);
    }
  }

  print('Digite os valores para a Matriz B (5x5):');
  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      stdout.write('B[$i][$j]: ');
      matrizB[i][j] = int.parse(stdin.readLineSync()!);
    }
  }

  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      matrizResultado[i][j] = matrizA[i][j] * matrizB[i][j];
    }
  }

  print('Matriz Resultado (multiplicação das coordenadas):');
  for (int i = 0; i < 5; i++) {
    print(matrizResultado[i].join(' '));
  }
}
