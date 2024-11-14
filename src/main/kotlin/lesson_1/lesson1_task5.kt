package org.example.lesson_1

fun main() {
    val babylonianNumeral = 60

    val seconds = 6480
    val minutes = seconds / babylonianNumeral
    val remainderSecondsOfTheMinutes = seconds % babylonianNumeral
    val hours = minutes / babylonianNumeral
    val remainderMinutesOfTheHour = minutes % babylonianNumeral

    println(String.format("[%02d:%02d:%02d]", hours, remainderMinutesOfTheHour, remainderSecondsOfTheMinutes))
}
