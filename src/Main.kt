fun main() {
    print("Сколько ингредиентов планируете ввести: ")
    val count = readln().toInt()
    val ingredients = Array(count) { "" }
    for (i in 0 until count) {
        print("Ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }
    println("Ваши ингредиенты: ${ingredients.joinToString(", ")}")
}