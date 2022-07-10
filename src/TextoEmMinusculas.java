public class TextoEmMinusculas extends MensagemDecorator{

    Mensagem mensagem;

    public TextoEmMinusculas(Mensagem mensagem) {
        this.mensagem = mensagem;

        System.out.println("formatando em minusculas");
    }

    @Override
    public String formatarTexto() {
        return mensagem.formatarTexto().toLowerCase();
    }
}
