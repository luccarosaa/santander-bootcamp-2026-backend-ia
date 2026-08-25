package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {

    public static void main(String[] args) {

        // Singleton: Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.

        System.out.println("\n======================================");
        System.out.println("======= TESTES DESIGN PATTERNS =======");

        System.out.println("\n=== Singleton Lazy ===");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("\n=== Singleton Eager ===");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("\n=== Singleton Lazy Holder ===");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy: Simplificar a variação de algoritmos para a resolução de um mesmo problema.

        System.out.println("\n=== Strategy ===");
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade: Prover uma interface que reduza a complexidade nas integrações com subsistemas.

        System.out.println("\n=== Facade ===");
        Facade facade = new Facade();
        facade.migrarClientes("Vanilton", "01000-000");
        System.out.println("\n=================FIM=================");
        System.out.println("=====================================");
    }

}
