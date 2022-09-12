import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

abstract class Compra (
    val escolhaTransacao: String,
    val valorTransacao: Double
) : Pais {
    val formatacao = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
    val dataHora = LocalDateTime.now()
    val dataHoraFormatada = formatacao.format(dataHora)

    override fun paisResidente(pais: String) {
        when {
            (pais.toUpperCase() != "BRASIL") && (pais.toUpperCase() != "ARGENTINA") -> {
                println("País inválido.")
            }
            else -> {
                println(exibir())
            }
        }
    }

    fun exibir (): String {
        return  "Titulo: Compra aprovada com sucesso."+
                "\nValor da transação: "+ valorTransacao +
                "\nData e Hora da transação: "+ dataHoraFormatada +
                "\nForma de pagamento: "+ escolhaTransacao
    }

}