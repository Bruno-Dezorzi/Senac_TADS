import "dart:io";

void main(){
  print("Bem Vindo a uma Progressão Aritimética");
  print("Digite a quantidade de números que você deseja somar da sua PA");
  int n = int.parse(stdin.readLineSync()!);
  print("Qual a razão da sua PA?");
  int razao = int.parse(stdin.readLineSync()!);

  var pa = [];

  int anterior = 0;

  for(int i = 0; i <= n; i++ ){
    pa.add(anterior + razao);
    anterior = razao;
  }

  var formula_soma_pa = ((pa[0] + pa[pa.length - 1]) * n)/2;

  print("A soma de sua PA é ${formula_soma_pa}");
  
}