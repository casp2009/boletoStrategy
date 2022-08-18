public class Main {
    public static void main(String[] args){
        LeituraRetorno leituraRetornoBancoBrasil = new LeituraRetornoBancoBrasil();
        ProcessarBoletos processador = new ProcessarBoletos(leituraRetornoBancoBrasil);
        processador.processar("brasil.csv");

        LeituraRetorno leituraRetornoBradesco = new LeituraRetornoBradesco();
        ProcessarBoletos processadorBradesco = new ProcessarBoletos(leituraRetornoBradesco);
        processadorBradesco.processar("bradesco1.csv");
    }
}