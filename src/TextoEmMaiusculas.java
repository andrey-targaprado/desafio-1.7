public class TextoEmMaiusculas extends MensagemDecorator{

    Mensagem mensagem;

    public TextoEmMaiusculas(Mensagem mensagem) {
        this.mensagem = mensagem;

        System.out.println("formatando em maiusculas");
    }

    @Override
    public String formatarTexto() {
        return mensagem.formatarTexto().toUpperCase();
    }
}
