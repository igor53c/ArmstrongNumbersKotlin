import kotlin.math.pow

fun isArmstrongNumber(numberToCheck: Int): Boolean {
    val numberStr = numberToCheck.toString()
    val numberOfDigits = numberStr.length
    var sum = 0
    var temp = numberToCheck

    while (temp != 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(numberOfDigits.toDouble()).toInt()
        temp /= 10
    }

    return sum == numberToCheck
}