/* 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/


fun main(){


    var femiN= 0
    var mascAgr= 0
    var outrosCalm= 0
    var sexo= 0
    var idade= 0
    var dados = 0
    var pessoCam = 0
    var pessoNer= 0
    var pessoNM40 = 0
    var pessoCM18 = 0

    while (dados<=150){
        dados++
        //Recebendo a idade
        println("Qual a sua idede?")
        idade = readln().toInt()
        //Recebendo o sexo do usuario
        println("Qual o seu sexo?")
        println("1 - Feminino\n" +
                "2 - Masculino\n" +
                "3- Outros")
        sexo = readln().toInt()

        //Recebendo qual das opcoes
        println("Qua a sua categoria: ")
        println("1 - Calma\n" +
                "2 - Nervosa\n" +
                "3- Agressiva")
        var opcoes = readln().toInt()



    }






}
