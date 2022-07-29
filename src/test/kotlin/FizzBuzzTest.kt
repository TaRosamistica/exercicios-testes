import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class FizzBuzzTest {

    @Test
    fun `Quando FizzBuzz receber 3 retorna Fizz`(){

        val fizzbuzz = FizzBuzz()
        assertEquals("Fizz", fizzbuzz.calcula(3))

    }
}
