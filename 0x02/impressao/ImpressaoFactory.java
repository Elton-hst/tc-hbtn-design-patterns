public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadesColoridas, boolean ehfrenteVerso) {
        Impressao impressao = new Impressao(tamanhoImpressao, totalPaginas, quantidadesColoridas, ehfrenteVerso);
        return impressao;
    }
}