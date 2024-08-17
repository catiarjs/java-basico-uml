import edu.equipamento.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone equipamentoIphone = new Iphone();
        equipamentoIphone.atender();
        equipamentoIphone.ligar("(44)4587-4457");
        equipamentoIphone.iniciarCorreioVoz();
        equipamentoIphone.exibirPagina("www.google.com");
        equipamentoIphone.adicionarNovaAba();
        equipamentoIphone.atualizarPagina();  
        equipamentoIphone.selecionarMusica("As Quatro Estações - Vivaldi");
        equipamentoIphone.tocar();
        equipamentoIphone.pausar();  
    }
}
