import 'dart:io';

void main() {
  stdout.write("Digite um número: ");
  int n = int.parse(stdin.readLineSync()!);
  bool primo = (n >= 2);

  for (int i = 2; i * i <= n && primo; i++) {
    if (n % i == 0) primo = false;
  }

  print(primo ? "$n é primo!" : "$n não é primo.");
}
