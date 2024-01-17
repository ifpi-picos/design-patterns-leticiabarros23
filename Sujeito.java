interface Sujeito {
    void registrarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores();
}
