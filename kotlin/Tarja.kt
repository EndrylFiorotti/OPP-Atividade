import java.util.Scanner;
class Tarja (
    escolhaTransacao: String,
    valorTransacao: Double
): Compra (
    escolhaTransacao = escolhaTransacao,
    valorTransacao = valorTransacao
) {
    var entrada = Scanner(System.`in`)
    override fun paisResidente(pais: String) {
        when {
            pais == "Argentina" -> {
                println("Insira seu CVV: ")
                val CVV: String = entrada.nextLine()
                println("Insira seu DNI: ")
                val DNI: String = entrada.nextLine()
                if (CVV.length == 0 || DNI.length == 0) {
                    println("Os campos precisam ser preenchidos.")
                } else {
                    println(exibir())
                }
            }
            pais != "Brasil" -> {
                println("País inválido, insira novamente.")
            }
            else -> println(exibir())
        }
    }
}