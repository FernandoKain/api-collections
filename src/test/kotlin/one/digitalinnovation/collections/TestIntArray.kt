package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    println("--------------------------------------------------------")
    println("Iterando com 'for'")
    // Iterando com "for"
    for (valor in values){
        println(valor)
    }
    println("--------------------------------------------------------")
    println("Iterando com 'forEach'")
    // Iterando com forEach
    values.forEach {
        println(it)
    }
    println("--------------------------------------------------------")
    println("Iterando colocando variável no 'forEach'")
    // Iterando colocando a variável no forEach
    values.forEach { valor ->
        println(valor)
    }
    println("--------------------------------------------------------")
    println("Iterando pelos índices do array")
    // Iterando pelos os índices do array
    for (index in values.indices){
        println(values[index])
    }
    println("--------------------------------------------------------")
    println("Iterando com 'sort'. 'Sort' coloca os valores em ordem crescente")
    values.sort()
    for (valor in values){
        println(valor)
    }
}