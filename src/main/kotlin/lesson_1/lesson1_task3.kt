package org.example.lesson_1

fun main() {

    val year = 1961

    var hour = "09"
    var minute = "07"

    println(
        """
        Год полёта – $year
        $hour часов
        $minute минут
        
        """.trimIndent())

    hour = "10"
    minute = "55"

    println("Время посадки – [$hour:$minute]")
}