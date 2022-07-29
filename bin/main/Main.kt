fun main(){
    val saudacao: String = "Hello"
    println(saudacao)

    val resultado = soma(2, 2)
    println(resultado)

    val multiplicacao = multiplica(3, 2)
    println(multiplicacao)
}
fun soma(a: Int, b: Int): Int{
    return(a + b)

}

fun multiplica(a: Int, b: Int): Int{
    return(a * b)
}