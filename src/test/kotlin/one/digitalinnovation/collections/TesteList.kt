package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria", 4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    // Itera e imprime cada item do array
    funcionarios.forEach { println(it) }

    println("----------------------------------------------")
    println("Método que buscará o funcionário chamado Maria dentro do array:")
    println(funcionarios.find { it.nome == "Maria" })

}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    // Função que sobrescreve a maneira de exibição. Método especial do Kotlin que deixa muito mais bonita a impressão.
    // Para visualizar o outro modo é só comentar o override.
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
    }


