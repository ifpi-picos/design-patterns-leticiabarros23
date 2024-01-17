import java.util.ArrayList;
import java.util.List;

interface Sujeito {
    void registrarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}

interface Observador {
    void update(float temperatura, float umidade, float pressao);
}

public class EstacaoMet implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura = 0.0f;
    private float umidade = 0.0f;
    private float pressao = 0.0f;

    @Override
    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.update(temperatura, umidade, pressao);
        }
    }

    public void setMedicoes(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notificarObservadores();
    }
}

