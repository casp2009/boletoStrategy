import java.time.LocalDate;
import java.util.Date;

public class Boleto {
    private int id;
    private String codBanco;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private String cpfCliente;
    private double valor;
    private double multa;
    private double juros;
    private String agencia;
    private String contaBancaria;

    public Boleto(int id, String codBanco, LocalDate dataVencimento, LocalDate dataPagamento, String cpfCliente, double valor,
                  double multa, double juros, String agencia, String contaBancaria) {
        this.id = id;
        this.codBanco = codBanco;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.cpfCliente = cpfCliente;
        this.valor = valor;
        this.multa = multa;
        this.juros = juros;
        this.agencia = agencia;
        this.contaBancaria = contaBancaria;
    }

    public Boleto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String   toString() {
        return "Boleto{" +
                "id=" + id +
                ", codBanco='" + codBanco + '\'' +
                ", dataVencimento=" + dataVencimento +
                ", dataPagamento=" + dataPagamento +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", valor=" + valor +
                ", multa=" + multa +
                ", juros=" + juros +
                ", agencia='" + agencia + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                '}';
    }
}
