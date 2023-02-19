import Mensagens.MensagemTexto;
import Mensagens.Mensagen;
import Usuario.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario Marcelo = new Usuario("marcelo"  , "marchetto.marcelo@gmail.com", "22/12/2003");
        Usuario Arthur = new Usuario("Arthur"  , "arthurzaniniaguiar@gmail.com", "13/08/2003");

        Mensagen msg = new MensagemTexto(Marcelo, Arthur, "22/12/2003", "Olá, tudo bem?");

        System.out.println(msg);
    }
}
