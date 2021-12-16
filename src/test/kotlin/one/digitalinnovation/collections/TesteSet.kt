package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    println("---------------------------------------------------")
    println("Unindo dois conjuntos antes de exibir:")
    // Unindo dois conjuntos antes de exibir
    val resultUnion = funcionarios1.union(funcionarios2)
    // Exibindo o novo conjunto formado pela união dos dois anteriores:
    resultUnion.forEach { println(it) }

    println("---------------------------------------------------")
    println("Criando novo grupo (funcionários3) e comparando com o grupo funcionarios2 (que só tinha 'Maria) e retira o elemento " +
            " em comum:")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("---------------------------------------------------")
    println("Agora o retorno será justamente o que tem de comum nos dois conjuntos:")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }


}