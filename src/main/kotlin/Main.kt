package org.example


const val HERO_NAME="Madrigal"
fun main() {
    var hasSteed=false
    println("Удалось герою обзавестись боевым конем - $hasSteed")
    /*
    hasSteed=true
    println("Удалось герою обзавестись боевым конем - $hasSteed")*/
    val nameBar="Рог единорога"
    val nameBarmen="Стивен"
    var valueMoney=50
    var menu= listOf("Мёд","Вино","Пиво")
    println("Герой воспользовался волшебным зеркалом, теперь его имя: ${HERO_NAME.reversed()}")

}