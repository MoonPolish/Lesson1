package org.example.lesson_1

fun main() {
    val seconds = 6480
    val minutes = seconds / 60
    val hours = minutes / 60
    val remainderOfTheHour = minutes % 60

    println("[0$hours:$remainderOfTheHour:00]")
}