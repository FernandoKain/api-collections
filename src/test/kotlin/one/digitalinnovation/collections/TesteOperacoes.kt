package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("-------------------------------------------------")
    println("Itera e imprime todos os salários existentes no array")
    for (salario in salarios){
        println(salario)
    }

    println("-------------------------------------------------")
    println("Métodos para exibir o maior salário, o menor salário e a média salarial: ")
    // Métodos max e min não funcionam mais.
//    println("Maior salário: ${(salarios.max())}")
//    println("Menor salário: ${(salarios.min())}")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${(salarios.average())}")


    println("-------------------------------------------------")
    println("Filtra salários maiores que 2500 e imprime")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0} // Filtra salários maiores que 2500
    salariosMaiorQue2500.forEach { println(it) } // Imprime it (salarios maiores que 2500

    println("-------------------------------------------------")
    println("Conta quantos elementos existem entre 2000.0 e 5000.0")
    println(salarios.count { it in 2000.0..5000.0 })

    println("-------------------------------------------------")
    println("Encontra um elemento que no caso possua o valor 2250. Encontraria por exemplo um funcionário que tivesse" +
            " o salário de 2250.0")
    println(salarios.find { it == 2250.0 })

    println("-------------------------------------------------")
    println("Tenta encontrar um funcionário que tenha salário de 500.0, porém não conseguirá encontrar. Porém não consegue" +
            " e devolve 'null':")
    println(salarios.find { it == 500.0 })

    println("-------------------------------------------------")
    println("Existe qualquer elemento em que minha expressão é verdadeira? Devolverá um true ou false:")
    println(salarios.any { it == 4000.0 }) // true
    println(salarios.any { it == 250.0 }) // false


}