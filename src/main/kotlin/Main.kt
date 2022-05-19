/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

fun main() {

    for(number in 1000..1999){
        if(number%11 == 5){
            println(number)
        }
    }
}