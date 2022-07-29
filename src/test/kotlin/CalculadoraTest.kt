import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class CalculadoraTest {
    val testSample: Calculadora = Calculadora()

    @Test
    fun `Deveria somar dois numeros positivos`(){
        val soma = testSample.somar(3, 2)
        assertEquals(5, soma)
        println(soma(3, 2))
    }

    @Test
    fun `Teste com valores negativos`(){
        val resultado = - 10
        assertTrue(testSample.somar(-5, -5) == resultado)
    }
}