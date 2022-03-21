package ru.netology

fun main() {
    print("Сколько же там лайков? Напишите: ")
    val likes = readLine()?. toInt() ?: return
    val people = if (likes == 0)
        ("... а никому не понравилось")
    else if ((likes % 10) == 1)
        ("человеку")
    else ("людям")

    println("Понравилось $likes $people")
}