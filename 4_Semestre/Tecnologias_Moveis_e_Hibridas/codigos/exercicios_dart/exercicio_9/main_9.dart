import 'dart:io';

void main() {
  print(
    "Digite uma temperatura em Celcius que eu irei transformar em Fahrenheit",
  );

  stdout.write("Digite a temperatura: ");
  double c = double.parse(stdin.readLineSync()!);
  double f = (c * 1.8 + 32);

  print("Sua temperatura em Fahrenheit é de ${f}°");
}
