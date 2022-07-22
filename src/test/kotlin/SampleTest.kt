import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class SampleTest {
    val testSample: Sample = Sample()

    @Test
    fun testSum(){
        val result = 5
        assertEquals(result, testSample.sum(3, 2))
    }

    @Test
    fun `Teste com valores negativos`(){
        val result = - 10
        assertTrue(testSample.sum(-5, -5) == result)
    }
}