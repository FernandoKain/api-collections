package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    println("-----------------------------------------------------")
    println("1 - Fazendo a iteração dos salários sem a indexação.")
    salarios.forEach {
        println(it)
    }

    println("-----------------------------------------------------")
    println("2 - Fazendo a iteração dos salários mas agora com a indexação.")
    println("3 - Fornecendo 10% de aumento para todos os índices salariais.")
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1 // Dando 10% de aumento para todos
    }

    println("-----------------------------------------------------")
    println("4 - Imprimindo novamente os salários após o cálculo.")
    salarios.forEach { println(it) }

    println("-----------------------------------------------------")
    println("5 - Maneira menos verbosa de construir um array.")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)

    println("-----------------------------------------------------")
    println("6 - Imprimindo de na ordem crescente o array menos verboso.")
    salarios2.sort()
    for (valores in salarios2){
        println(valores)
    }

}