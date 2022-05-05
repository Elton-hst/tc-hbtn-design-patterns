public class Impressao {

    private static final double A2_FRENTE_PB = 0.32;
    private static final double A2_FRENTE_CL = 0.22;
    private static final double A2_FRENTE_VERSO_PB = 0.28;
    private static final double A2_FRENTE_VERSO_CL = 0.18;
    private static final double A3_FRENTE_PB = 0.30;
    private static final double A3_FRENTE_CL = 0.20;

    private static final double A3_FRENTE_VERSO_PB = 0.25;
    private static final double A3_FRENTE_VERSO_CL = 0.15;

    private static final double A4_FRENTE_PB = 0.25;
    private static final double A4_FRENTE_CL = 0.15;

    private static final double A4_FRENTE_VERSO_PB = 0.20;
    private static final double A4_FRENTE_VERSO_CL = 0.10;

    private int paginasTotais;

    private int paginasColoridas;
    private boolean ehFrenteVerso;

    private double valorColoridasFrenteVerso;

    private double valorPretoBrancoFrenteVerso;

    private double valorColoridasFrenteApenas;

    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    public Impressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int ehColorida, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = totalPaginas;
        this.paginasColoridas = ehColorida;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public int getTotalPretoBranco() {

        return paginasTotais - paginasColoridas;
    }

    public double calcularTotal(){

        int pb = getTotalPretoBranco();
        int cl = paginasColoridas;
        double total = 0;

        switch (tamanhoImpressao){
            case A2:
                if (ehFrenteVerso){

                    valorColoridasFrenteVerso = A2_FRENTE_VERSO_CL;
                    valorPretoBrancoFrenteVerso = A2_FRENTE_VERSO_PB;

                    total += cl * A2_FRENTE_VERSO_CL;
                    total += pb * A2_FRENTE_VERSO_PB;


                }else {

                    valorColoridasFrenteApenas = A2_FRENTE_CL;
                    valorPretoBrancoFrenteApenas = A2_FRENTE_PB;

                    total += cl * A2_FRENTE_CL;
                    total += pb * A2_FRENTE_PB;

                }
                break;
            case A3:
                if (ehFrenteVerso){

                    valorColoridasFrenteVerso = A3_FRENTE_VERSO_CL;
                    valorPretoBrancoFrenteVerso = A3_FRENTE_VERSO_PB;

                    total += cl * A3_FRENTE_VERSO_CL;
                    total += pb * A3_FRENTE_VERSO_PB;

                }else {

                    valorColoridasFrenteApenas = A3_FRENTE_CL;
                    valorPretoBrancoFrenteApenas = A3_FRENTE_PB;

                    total += cl * A3_FRENTE_CL;
                    total += pb * A3_FRENTE_PB;
                }
                break;

            case A4:
                if (ehFrenteVerso){

                    valorColoridasFrenteVerso = A4_FRENTE_VERSO_CL;
                    valorPretoBrancoFrenteVerso = A4_FRENTE_VERSO_PB;

                    total += cl * A4_FRENTE_VERSO_CL;
                    total += pb * A4_FRENTE_VERSO_PB;

                }else {

                    valorColoridasFrenteApenas = A4_FRENTE_CL;
                    valorPretoBrancoFrenteApenas = A4_FRENTE_PB;

                    total += cl * A4_FRENTE_CL;
                    total += pb * A4_FRENTE_PB;
                }
                break;

        }

        return total;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas, getTotalPretoBranco(), ehFrenteVerso ? "frente e verso" : "frente apenas", calcularTotal());
    }
}