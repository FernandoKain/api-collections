// As diversas maneiras de iterar um Array
package one.digitalinnovation.collections

fun main(){
    // Esse intArrayOf permite maior elasticidade em relação ao seu tamanho.
    // Já IntArray exige que sempre seja feita a modificação manualmente toda vez que houver a introdução de mais em elemento.
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println("-----------------------------------------")
    println("Sem ordenar os valores")
    values.forEach {
        println(it)
    }

    println("-----------------------------------------")
    println("Ordenando os valores")
    values.sort()
    values.forEach {
        println(it)
    }

}