package org.lauzon

fun main(args: Array<String>){
    
    for (i: Int in 0..args.size){
    var height: Int = args[i].toInt()

        var star: String = "*"
        for (j: Int in 1..height){
            println(star)
            star +="*"
        }
    }
}