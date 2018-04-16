package challenges

import java.util.*

/**
 * @author Peter Sommerhoff
 *
 * Solution for the coding challenge on conditionals inside the Udemy course.
 * Generate a random number between 0 and 49 and checks in which range it is.
 */
fun main(args: Array<String>) {
    val random = Random().nextInt( 50) +1
    when(random){
        in 1..10 -> {
            println("The number is $random.")
            println("This random number is between 1 to 10.")
        }
        in 11..20 -> {
            println("The number is $random.")
            println("This random number is between 11 to 20.")
        }
        in 21..30 -> {
            println("The number is $random.")
            println("This random number is between 21 to 30.")
        }
        in 31..40 -> {
            println("The number is $random.")
            println("This random number is between 31 to 40.")
        }
        in 41..50 -> {
            println("The number is $random.")
            println("This random number is between 41 to 50")
        }
        else -> println("This random number is out of bounds.")
    }
    println()
    println("*******Done*******")
}
