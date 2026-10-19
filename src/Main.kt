fun main() {
    val ingredients = arrayOf("Лук", "Картошка", "Капуста", "Фасоль", "Мясо")
    println(ingredients.joinToString (", "))
println()
    print("Какой ингредиент заменить: ")
    val old = readln()
    val foundIndex = ingredients.indexOf(old)
    if (foundIndex == -1) {
        println("Ингредиента \"$old\" нет в списке.")
        return
    }
    print("На какой заменить: ")
    val new = readln()
    ingredients.set(foundIndex, new)
    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString (", ")}")
}