public class Usuario implements Observador {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update (float temperatura, float umidade, float pressao) {
        System.out.printf("Usuário %s: Atualização climática - Temperatura: %.2f°C, Umidade: %.2f%%, Pressão: %.2f hPa%n",
                nome, temperatura, umidade, pressao);
    }

}
