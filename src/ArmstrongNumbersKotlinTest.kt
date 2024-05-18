import org.junit.Assert.*
import org.junit.Test

class ArmstrongNumbersKotlinTest {

    @Test
    fun testSingleDigitNumbers() {
        assertTrue(isArmstrongNumber(0))
        assertTrue(isArmstrongNumber(1))
        assertTrue(isArmstrongNumber(2))
        assertTrue(isArmstrongNumber(3))
        assertTrue(isArmstrongNumber(4))
        assertTrue(isArmstrongNumber(5))
        assertTrue(isArmstrongNumber(6))
        assertTrue(isArmstrongNumber(7))
        assertTrue(isArmstrongNumber(8))
        assertTrue(isArmstrongNumber(9))
    }

    @Test
    fun testDoubleDigitNumbers() {
        assertFalse(isArmstrongNumber(10))
        assertFalse(isArmstrongNumber(11))
        assertFalse(isArmstrongNumber(99))
    }

    @Test
    fun testKnownArmstrongNumbers() {
        assertTrue(isArmstrongNumber(153))
        assertTrue(isArmstrongNumber(370))
        assertTrue(isArmstrongNumber(371))
        assertTrue(isArmstrongNumber(407))
        assertTrue(isArmstrongNumber(9474))
    }

    @Test
    fun testKnownNonArmstrongNumbers() {
        assertFalse(isArmstrongNumber(9475))
        assertFalse(isArmstrongNumber(100))
        assertFalse(isArmstrongNumber(123))
        assertFalse(isArmstrongNumber(400))
    }
}
