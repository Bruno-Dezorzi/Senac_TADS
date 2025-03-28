import 'dart:io';

void main() {
  print("Bem vindo ao calculador de média");
  stdout.write("Quantos valores deseja inserir: ");
  int qtde = int.parse(stdin.readLineSync()!);
  List<double> numeros = [];

  for (int i = 1; i <= qtde; i++) {
    stdout.write("Digite seu ${i}° número: ");
    numeros.add(double.parse(stdin.readLineSync()!));
  }

  stdout.write("Seus números são: [");
  for (int i = 0; i < numeros.length; i++) {
    stdout.write(numeros[i]);
    if (i < numeros.length - 1) {
      stdout.write(", ");
    }
  }
  stdout.write("]\n");

  double soma = 0;

  for (int i = 0; i < numeros.length; i++) {
    soma = soma + numeros[i];
  }

  double media = soma / qtde;

  print("Sua média é de ${media}");

  if (media >= 7) {
    print("Aprovado");
  } else if (5 >= media || media < 7) {
    print("Recuperação");
  } else {
    print("REPROVADO!");
  }
}
