/*
1 - Escreva um código para enviar mensagens de marketing,
para isso você deve ter a possibilidade de enviar a mesma
mensagem para serviços diferentes, esses serviços devem ter
um métoodo para receber a mensagem como parâmetro, os serviços
que devem estar disponíveis são:
   - SMS;
   - E-mail;
   - Redes Sociais;
   - WhatsApp;
 */
import java.util.List;

public class Main {

    // Contrato: Nossa Interface Funcional (obrigatória para usar Lambdas)
    @FunctionalInterface
    public interface ServicoEnvio {
        void enviar(String mensagem);
    }

    // Métoodo auxiliar usado exclusivamente para a Sintaxe 4 (Method Reference)
    public static void enviarPeloWhatsApp(String msg) {
        System.out.println("[WhatsApp]: -> " + msg);
    }

    public static void main(String[] args) {

        // SINTAXE 1: Classe Anônima (O jeito clássico, antes do Java 8)
        ServicoEnvio sms = new ServicoEnvio() {
            @Override
            public void enviar(String msg) {
                System.out.println("[SMS]: -> " + msg);
            }
        };

        // SINTAXE 2: Lambda Completa (Com tipo declarado e chaves {})
        ServicoEnvio email = (String msg) -> {
            System.out.println("[E-mail]: -> " + msg);
        };

        // SINTAXE 3: Lambda Simplificada (Sem tipo e sem chaves)
        ServicoEnvio redesSociais = msg -> System.out.println("[Redes Sociais]: -> " + msg);

        // SINTAXE 4: Method Reference (Usando "::")
        ServicoEnvio whatsapp = Main::enviarPeloWhatsApp;


        String mensagemMarketing = "Aproveite o cupom JAVA10 para garantir o seu desconto!";
        List<ServicoEnvio> servicos = List.of(sms, email, redesSociais, whatsapp);


        System.out.println("\n==== DISPARANDO MENSAGENS COM 4 TIPOS DE SINTAXE ====\n");
        for (ServicoEnvio servico : servicos) {
            servico.enviar(mensagemMarketing);
        }
        System.out.println("\n=====================================================");
    }
}