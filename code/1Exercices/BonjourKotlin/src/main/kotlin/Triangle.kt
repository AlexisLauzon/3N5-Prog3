package org.lauzon

fun main(args: Array<String>){
    var height: Int = args[0].toInt()
    var star: String = "*"
    for (i: Int in 1..height){
            println(star)
            star +="*"
    }
}