package machine

import java.util.*
import kotlin.system.exitProcess

val scan=Scanner(System.`in`)

var machineWater = 400
var machineMilk = 540
var machineCoffeeBeans = 120
var machineCups = 9
var machineMoney = 550

fun main() {
    while (true)
        action()
}

fun action() {
    print("Write action (buy, fill, take, remaining, exit): > ")
    val action = scan.next()

    when(action)
    {
        "buy" ->{
            println()
            buy()
        }
        "fill" ->{
            println()
            fill()
        }
        "take" ->{
            println("I gave you $$machineMoney\n")
            machineMoney=0
        }
        "remaining" ->{
            println()
            printMachine()
        }
        "exit" ->{
            exitProcess(0)
        }
    }
}

fun buy() {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino,back - to main menu: : > ")
    val make = scan.next()

    when(make) {
        "1" ->{
            isEnoughResource(250,0,16,1,4)
        }
        "2" ->{
            isEnoughResource(350,75,20,1,7)
        }
        "3" ->{
            isEnoughResource(200,100,12,1,6)
        }
        "back" ->{

        }
    }
    println()
}

fun isEnoughResource(water:Int,milk:Int,coffeeBeans:Int,cup:Int,money:Int){
    if(machineWater >= water && machineMilk >= milk && machineCoffeeBeans >= coffeeBeans && machineCups >= cup) {
        print("I have enough resources, making you a coffee!\n\n")
        machineWater -= water
        machineCoffeeBeans -= coffeeBeans
        machineMoney += money
        machineCups--
        machineMilk -= milk
    }
    else
    {
        if (machineWater < water)
            print("Sorry, not enough water!")
        else if(machineMilk < milk)
            print("Sorry, not enough milk!")
        else if (machineCoffeeBeans < coffeeBeans)
            print("Sorry, not enough coffee beans!")
        else if (machineCups < cup)
            print("Sorry, not enough cup!")
    }
}

fun min(a:Int,b:Int,c:Int):Int {
    return if (a <= b && a <= c) {
        a
    } else if(b <= a && b <= c) {
        b
    } else
        c
}

fun fill() {
    print("Write how many ml of water do you want to add: > ")
    machineWater+=scan.nextInt()
    print("Write how many ml of milk do you want to add: > ")
    machineMilk+=scan.nextInt()
    print("Write how many grams of coffee beans do you want to add: > ")
    machineCoffeeBeans+=scan.nextInt()
    print("Write how many disposable cups of coffee do you want to add: > ")
    machineCups+=scan.nextInt()
}

fun printMachine() {
    print("The coffee machine has:\n" +
            "$machineWater of water\n" +
            "$machineMilk of milk\n" +
            "$machineCoffeeBeans of coffee beans\n" +
            "$machineCups of disposable cups\n" +
            "$machineMoney of money\n\n")
}
