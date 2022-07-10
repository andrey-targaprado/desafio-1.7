public class TextoSemAcentos extends MensagemDecorator{

    Mensagem mensagem;

    public TextoSemAcentos(Mensagem mensagem) {
        this.mensagem = mensagem;

        System.out.println("formatando sem Acentos");
    }

    @Override
    public String formatarTexto() {
        return mensagem.formatarTexto().toUpperCase();
    }
}
