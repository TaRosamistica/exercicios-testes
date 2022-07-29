//Script
//Objetivo: quando o número for múltiplo de 3, imprimir Fizz
//quando o número for múltiplo de 5, imprimir Buzz
//quando o número for múltiplo de 3 e 5, imprimir FizzBuzz

class FizzBuzz {

    fun calcula(numero: Int): String {
        if(numero % 3 == 0 && numero % 5 != 0)
            return "Fizz"
        if(numero % 5 == 0 && numero % 3 != 0)
            return "Buzz"
        if(numero % 3 == 0 && numero % 5 == 0)
            return "FizzBuzz"
        return "Nem fiz nem Buzz"
    }
}
