public class App {

    public static void main(String[] args) {

        Mensagem mensagemMinuscula = new TextoEmMinusculas(new MensagemBasica("TEXTO"));
        Mensagem mensagemMaiuscula = new TextoEmMaiusculas(new MensagemBasica("texto"));



        System.out.println(mensagemMinuscula.formatarTexto());
        System.out.println(mensagemMaiuscula.formatarTexto());

    }

}
