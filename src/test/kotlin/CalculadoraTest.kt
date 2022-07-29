import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class CalculadoraTest {
    val testSample: Calculadora = Calculadora()

    @Test
    fun `Deve somar dois numeros positivos`(){
        val soma = testSample.somar(3, 2)
        assertEquals(5, soma)
        println(soma(3, 2))
    }

    @Test
    fun `Deve somar dois valores negativos`(){
        val resultado = - 10
        assertTrue(testSample.somar(-5, -5) == resultado)
    }

    @Test
    fun `Deve multiplicar dois numeros inteiros`(){
        val testeSample = Calculadora ()
        val resultado = testeSample.multiplicar(4,2)
        assertEquals(resultado, 8)
    }

    @Test
    fun `Deve realizar subtracao entre dois numeros inteiros`(){
        val testSample = Calculadora()
        val resultado = testSample.subtrair(10, 5)
        assertEquals(resultado, 5)
    }

}