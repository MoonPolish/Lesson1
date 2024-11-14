package org.example.lesson_1

fun main() {
    val babylonianNumeral = 60

    val seconds = 6480
    val minutes = seconds / babylonianNumeral
    val hours = minutes / babylonianNumeral
    val formattedHour = String.format("%02d", hours)
    val remainderOfTheHour = minutes % babylonianNumeral

    println("[$formattedHour:$remainderOfTheHour:00]")
}
