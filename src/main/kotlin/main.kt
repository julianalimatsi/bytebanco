fun main() {
    println("Bem Vindo ao ByteBanco")
    val contaJuliana = Conta()
    contaJuliana.titular = "Juliana"
    contaJuliana.numero = 9000
    contaJuliana.saldo = 900.0

    val contaPedro = Conta()
    contaPedro.titular = "Pedro"
    contaPedro.numero = 8000
    contaPedro.saldo = 800.0

    println(contaJuliana.titular)
    println(contaJuliana.numero)
    println(contaJuliana.saldo)

    println(contaPedro.titular)
    println(contaPedro.numero)
    println(contaPedro.saldo)

    println("depósito realizado conta do Pedro")
    contaPedro.deposita(valor = 90.0)
    println(contaPedro.saldo)

    println("depósito realizado conta do Juliana")
    println(contaJuliana.saldo)
    contaJuliana.deposita(valor = 99.0)

    println("sacando na conta do Pedro")
    contaPedro.saca(valor = 250.0)
    println(contaPedro.saldo)

    println("saque em excesso na conta do Pedro")
    contaPedro.saca(valor = 250.0)
    println(contaPedro.saldo)

    println("sacando na conta da Juliana")
    contaJuliana.saca(valor = 50.0)
    println(contaJuliana.saldo)

    println("saque em excesso na conta da Juliana")
    contaJuliana.saca(valor = 500.0)
    println(contaJuliana.saldo)

    println("transferência da conta da Juliana para conta do Pedro")

}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

fun testaReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta João ${contaJoao.titular}")
    println("titular conta Maria ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
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