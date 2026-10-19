fun main() {
    val ingredients = arrayOf("Лук", "Картошка", "Капуста", "Фасоль", "Мясо")
    print("Введите ингредиент: ")
    val ingredient = readln()
    for (item in ingredients) {
        if (item == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }

    }
    //dfdf
    println("Такого ингредиента в рецепте нет")
}