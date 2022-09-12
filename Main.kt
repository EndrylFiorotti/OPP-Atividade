import java.util.Scanner

fun main() {
    var entrada = Scanner(System.`in`)
    var entradaString = Scanner(System.`in`)

    println("Qual seu país de origem?")
    var pais = entradaString.nextLine() 
    println("Qual o valor da transferência?")
    var valor = entrada.nextDouble()
    println("Qual forma de pagamento?" +
            "\n Para Débito insira 1" +
            "\n Para Crédito insira 2" +
            "\n Para Tarja insira 3")
    var escolha = entradaString.nextInt()

    //Factory

    validacaoTipoPagamento(escolha, valor, pais)
}

private fun validacaoValor(valor: Double) : Boolean {
    when {
        valor <= 0 -> {
            println("Valor invalido.")
            return false
        }
        else -> return true
    }
}

private fun validacaoTipoPagamento(escolha: Int, valor: Double, pais: String) {
    var tipo: String
    if (validacaoValor(valor)) {
        when {
            escolha == 1 -> {
                tipo = "Débito"
                var debito = Debito(escolhaTransacao = tipo, valorTransacao = valor)
                println(debito.paisResidente(pais))
            }

            escolha == 2 -> {
                tipo = "Crédito"
                var credito = Credito(escolhaTransacao = tipo, valorTransacao = valor)
                println(credito.paisResidente(pais))
            }

            escolha == 3 -> {
                tipo = "Tarja"
                var tarja = Tarja(escolhaTransacao = tipo, valorTransacao = valor)
                tarja.paisResidente(pais)
            }

            else -> {
                println("Forma de pagamento inválida.")
                main()
            }

        }
    }
}