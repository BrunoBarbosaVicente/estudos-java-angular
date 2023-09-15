// Descrição do Desafio
// Chegou a hora de colocarmos em prática toda a concepção de análise de negócios, requisitos, conceitos da programação orientada a objetos e modelagem UML. Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência. A diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

// Lançamento iPhone 2017



// Interface ReprodutorMusical
public interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
    void avancarFaixa();
    void retrocederFaixa();
}

// Interface AparelhoTelefônico
public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void enviarMensagem(String destinatario, String mensagem);
    void receberMensagem(String remetente, String mensagem);
}

// Interface NavegadorInternet
public interface NavegadorInternet {
    void abrirNavegador();
    void fecharNavegador();
    void navegarNaWeb(String url);
}

// Classe iPhone que implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    public void tocarMusica() {
        // Implementação aqui
    }
    
    public void pausarMusica() {
        // Implementação aqui
    }
    
    public void avancarFaixa() {
        // Implementação aqui
    }
    
    public void retrocederFaixa() {
        // Implementação aqui
    }
    
    // Implementação dos métodos da interface AparelhoTelefônico
    public void fazerChamada(String numero) {
        // Implementação aqui
    }
    
    public void receberChamada(String numero) {
        // Implementação aqui
    }
    
    public void enviarMensagem(String destinatario, String mensagem) {
        // Implementação aqui
    }
    
    public void receberMensagem(String remetente, String mensagem) {
        // Implementação aqui
    }
    
    // Implementação dos métodos da interface NavegadorInternet
    public void abrirNavegador() {
        // Implementação aqui
    }
    
    public void fecharNavegador() {
        // Implementação aqui
    }
    
    public void navegarNaWeb(String url) {
        // Implementação aqui
    }
}