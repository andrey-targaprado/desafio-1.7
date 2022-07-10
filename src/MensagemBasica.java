public class MensagemBasica implements Mensagem {

    private String texto;

    public MensagemBasica(String texto) {
        this.texto = texto;
    }

    @Override
    public String formatarTexto() {
        return this.texto;
    }
}
