package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(maria, joao, pedro)

    // Itera e imprime cada item do array
    funcionarios.forEach { println(it) }

    println("----------------------------------------------")
    println("Método que buscará o funcionário chamado Maria dentro do array:")
    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------------------------------")
    println("Método que exibirá através de grupos. No caso:")
    funcionarios
        .sortedBy { it.tipoContracao }
        .forEach{(println(it))}


    println("----------------------------------------------")
    println("Método que ordenará a exibição dos funcionários pelo salário do menor para o maior")
    funcionarios
        .groupBy { it.salario }
        .forEach{(println(it))}


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContracao: String
) {
    // Função que sobrescreve a maneira de exibição. Método especial do Kotlin que deixa muito mais bonita a impressão.
    // Para visualizar o outro modo é só comentar o override.
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            Tipo de Contratação: $tipoContracao
        """.trimIndent()
    }


