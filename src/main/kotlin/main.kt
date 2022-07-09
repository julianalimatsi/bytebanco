fun main() {
    println("Bem Vindo ao ByteBanco")
    var conta = Conta()
    println()

}

class Conta {
    var titular = ""
    var numero = 8001
    var saldo = 9000
}

fun testaLassos() {
    val titular: String = "Pedro Lima"
    val numeroConta: Int = 8000
    var saldo = 8000

    println("titular $titular")
    println("numero da conta $numeroConta")
    println("saldo da conta $saldo")

}

fun testaSaldo(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")

    } else {
        if (saldo == 0.0) {
            println("conta é neutra")
        } else {
            println("conta é negativa")
        }
    }
}