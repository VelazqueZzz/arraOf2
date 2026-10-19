fun main() {
    val ingredients = arrayOf("Лук", "Картошка", "Капуста", "Фасоль", "Мясо")
    print("Введите ингредиент: ")
    val ingredient = readln()
    if (ingredient in ingredients) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}