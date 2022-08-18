import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco implements LeituraRetorno{

    @Override
    public List<Boleto> lerArquivo(String arquivoNome) {
        System.out.println("Lendo arquivo "+arquivoNome);
        try(var reader = Files.newBufferedReader(Paths.get(arquivoNome))) {
            String linha = null;
            var listaBoleto = new ArrayList<Boleto>();
            while ( (linha = reader.readLine()) != null) {
                var vetor = linha.split(";");
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setAgencia(vetor[2]);
                boleto.setContaBancaria(vetor[3]);


                boleto.setDataVencimento(LocalDate.parse(vetor[4], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                boleto.setDataPagamento(LocalDate.parse(vetor[5], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                boleto.setCpfCliente(vetor[6]);
                boleto.setValor(Double.parseDouble(vetor[7]));
                boleto.setMulta(Double.parseDouble(vetor[8]));
                boleto.setJuros(Double.parseDouble(vetor[9]));
                listaBoleto.add(boleto);
            }
            return listaBoleto;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }//catch
    }
}
