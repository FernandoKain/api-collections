package one.digitalinnovation.collections

fun main() {
    // Criando mapa 1
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    // Interando e exibindo o par. Nesse caso, para a Chave João teremos o valor 1000.0
    map1.forEach { k, v -> println("Chave: $k - Valor: $v") }

    println("----------------Segunda maneira de criar o mapa----------------")
    // Criando o mapa 2
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    // Iterando e exibindo o mapa 2
    map2.forEach { k, v -> println("Chave: $k - Valor: $v") }
}