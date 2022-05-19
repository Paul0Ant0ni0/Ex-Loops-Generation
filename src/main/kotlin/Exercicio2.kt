/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

fun main() {
    var somaP = 0
    var somaI = 0

    for (i in 1..10) {
        print("Digite os numeros: ")
        var num = readln().toInt()

        if (num % 2 == 0) {
            somaP ++
        } else {
            somaI ++
        }
    }
        println("No total $somaP são pares")
        println("No total $somaI são ímpares")

}
