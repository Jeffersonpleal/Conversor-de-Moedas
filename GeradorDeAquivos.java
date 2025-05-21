import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeradorDeAquivos {
        private static final String CAMINHO_ARQUIVO = "conversoes_registradas.txt";
        private static final DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        /**
         * Registra uma conversão em um arquivo.
         *
         * @param moedaOrigem       Moeda de origem
         * @param moedaDestino      Moeda de destino
         * @param valorConvertido   Valor convertido
         */
        public void registrar(String moedaOrigem, String moedaDestino, double valorConvertido) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
                // Cria o registro com data/hora da conversão e informações detalhadas
                String registro = String.format(
                        "[%s] Conversão realizada: %s -> %s | Valor: %.2f\n",
                        LocalDateTime.now().format(FORMATO_DATA_HORA),
                        moedaOrigem, moedaDestino, valorConvertido
                );

                // Escreve no arquivo
                writer.write(registro);
            } catch (IOException e) {
                System.out.println("Erro ao salvar o registro da conversão: " + e.getMessage());
            }
        }


}
