public class Carro {

    private boolean energia = false;

    private int marcha = 0;

    private int velocidade = 0;

    private int direcao = 0;

    public boolean isEnergia() {
        return energia;
    }

    public void setEnergia(boolean energia) {
        this.energia = energia;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void verificarVelocidade(){
        System.out.println("A velociade do carro é de " + getVelocidade() + " km/h");
    }

    public void ligarCarro(){
        if (!energia) {
            energia = true;
        } else {
            System.out.println("O carro está ligado");
        }
    }

    public void desligarCarro(){
        if (energia) {
            if (marcha == 0) {
                if(velocidade == 0){
                    energia = false;
                }
                else {
                    System.out.println("A marcha precisa estar parado para poder desligar o carro");
                }
            }
            else {
                System.out.println("A marcha precisa estar em ponto morto para poder desligar o carro");
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void acelerar(){
        if (!energia) {
            System.out.println("O carro está desligado");
            return;
        }

        if (velocidade == 120){
            System.out.println("A velocidade já está no máximo");
            return;
        }

        if (marcha == 0){
            System.out.println("O carro está em ponto morto");
            return;
        }

        velocidade += 1;
        System.out.println("Aumentando a velocidade do carro");
    }

    public void desacelerar(){
        if (!energia) {
            System.out.println("O carro está desligado");
            return;
        }

        if (velocidade == 0){
            System.out.println("O carro já está parado");
            return;
        }

        velocidade -= 1;
        System.out.println("Diminuindo a velocidade do carro");
    }

    public void virarDireita(){
        if (!energia) {
            System.out.println("O carro está desligado");
            return;
        }
        if (direcao != 1){
            direcao = 1;
            System.out.println("Carro virando a direita");
            return;
        }
        if (velocidade > 40){
            
        }
        System.out.println("Carro já está virando a direita");
    }

    public void virarEsquerda(){
        if (!energia) {
            System.out.println("O carro está desligado");
            return;
        }

        if (direcao != -1){
            direcao = -1;
            System.out.println("Carro virando a esquerda");
            return;
        }

        System.out.println("Carro já está virando a esquerda");
    }

    public void trocarMarcha() {
        if (!energia) {
            System.out.println("O carro está desligado");
            return;
        }

        System.out.println("Escolha a marcha para trocar:");
        System.out.println("1 - Aumentar marcha");
        System.out.println("2 - Diminuir marcha");
        int novaMarcha = Main.scanner.nextInt();

        switch (novaMarcha) {
            case 1 -> {
                if (marcha == 6) {
                    System.out.println("A marcha já está no máximo");
                } else {
                    marcha++;
                    System.out.println("A marcha mudou para: " + marcha);
                }
            }
            case 2 -> {
                if (marcha == 0) {
                    System.out.println("O carro já está em ponto morto");
                } else {
                    marcha--;
                    System.out.println("A marcha mudou para: " + marcha);
                }
            }
            default -> System.out.println("Opção inválida");
        }
    }
}
