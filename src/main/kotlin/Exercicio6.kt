/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/


fun main() {

    var num = 1
    var soma = 0.0
    var cont = 0.0
    do {
        print("Digite um número: ")
        num = readln().toInt()
        soma += num
        cont++
    }while (num != 0)

    var media = 0.0
    if (num%3 ==0){
        media = soma / (cont-1)
    }
    println("A média é: $media")
}
