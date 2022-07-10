public class TextoCamelCase extends MensagemDecorator{

    Mensagem mensagem;

    public TextoCamelCase(Mensagem mensagem) {
        this.mensagem = mensagem;

        System.out.println("formatando em CamelCase");
    }

    @Override
    public String formatarTexto() {
        return mensagem.formatarTexto().toUpperCase();
    }
}
