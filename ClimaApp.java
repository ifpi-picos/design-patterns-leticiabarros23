import java.util.Random;

public class ClimaApp {
    public static void main(String[] args) throws InterruptedException {
        EstacaoMet estacaoMeteorologica = new EstacaoMet();

        Usuario usuario1 = new Usuario("Marilia");
        Usuario usuario2 = new Usuario("Joao");

        estacaoMeteorologica.registrarObservador(usuario1);
        estacaoMeteorologica.registrarObservador(usuario2);

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            float temperatura = 20 + random.nextFloat() * 10;
            float umidade = 40 + random.nextFloat() * 30;
            float pressao = 1000 + random.nextFloat() * 10;

            estacaoMeteorologica.setMedicoes(temperatura, umidade, pressao);

            Thread.sleep(2000);
        }
    }
}

