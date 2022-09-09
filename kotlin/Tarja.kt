import java.util.Scanner;
class Tarja (
    escolhaTransacao: String,
    valorTransacao: Double
): Compra (
    escolhaTransacao = escolhaTransacao,
    valorTransacao = valorTransacao
), Pais {
    var entrada = Scanner(System.`in`)
    override fun paisResidente(pais: String) {
        when {
            pais == "Argentina" -> {
                println("Insira seu CVV: ")
                val CVV: String = entrada.nextLine()
                println("Insira seu DNI: ")
                val DNI: String = entrada.nextLine()
            }
        }
    }
}