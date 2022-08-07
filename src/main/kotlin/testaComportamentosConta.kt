fun testaComportamentosConta(){
    val contaJuliana = Conta()
    contaJuliana.titular = "Juliana"
    contaJuliana.numero = 9000
    contaJuliana.saldo = -200.0

    val contaPedro = Conta()
    contaPedro.titular = "Pedro"
    contaPedro.numero = 8000
    contaPedro.saldo = 200.0

    println(contaJuliana.titular)
    println(contaJuliana.numero)
    println(contaJuliana.saldo)

    println(contaPedro.titular)
    println(contaPedro.numero)
    println(contaPedro.saldo)

//    println("depósito realizado conta do Pedro")
//    contaPedro.deposita(valor = 90.0)
//    println(contaPedro.saldo)
//
//    println("depósito realizado conta do Juliana")
//    println(contaJuliana.saldo)
//    contaJuliana.deposita(valor = 99.0)
//
//    println("sacando na conta do Pedro")
//    contaPedro.saca(valor = 250.0)
//    println(contaPedro.saldo)
//
//    println("saque em excesso na conta do Pedro")
//    contaPedro.saca(valor = 250.0)
//    println(contaPedro.saldo)
//
//    println("sacando na conta da Juliana")
//    contaJuliana.saca(valor = 50.0)
//    println(contaJuliana.saldo)
//
//    println("saque em excesso na conta da Juliana")
//    contaJuliana.saca(valor = 500.0)
//    println(contaJuliana.saldo)
//
//    println("transferência da conta da Juliana para conta do Pedro")

    if (contaJuliana.transfere(100.0, contaPedro)) {
        println("transferência sucedida")
    } else {
        println("falha na tranferência")

    }

    println(contaPedro.saldo)
    println(contaJuliana.saldo)


}