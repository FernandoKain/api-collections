package one.digitalinnovation.collections

fun main(){
    // O Array de Strings espera o Tipo, o tamanho e um item, no caso foi vazio mesmo, de inicialização
    // val nomes = Array<String>(3){""}
    // Quando é inicializado o primeiro item a IDE entende que é de Strings, e diz que não precisa dizer o tipo.
    // Portanto o tipo foi retirado

    val nomes = Array(3){""} // Repare que o tamanho foi 3, e isso impede a inserção de mais um elemento
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"



    println("------------------------------------------")
    println("Sem ordenar os nomes")
    for (nomes in nomes){
        println(nomes)
    }

    println("------------------------------------------")
    println("Ordenando os nomes - Note que o algoritmo não consegue ordenar corretamente o 'ã' e o 'é'.")
    println("Caso você não utilize esses caracteres especiais a IDE ordenará normalmente.")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("------------------------------------------")
    // E aqui temos uma maneira menos verbosa de fazer a instanciação de um Array
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")

    nomes2.sort()
    for (nomes2 in nomes2){
        println(nomes2)
    }

}