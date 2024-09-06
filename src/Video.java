public class Video {
    private String titulo;
    private String duracao;
    private Canal canal;

    public Video(String titulo, String duracao, Canal canal) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.canal = canal;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public Canal getCanal() {
        return canal;
    }

    public void exibirInformacoes() {
        System.out.println(canal.getNome() + " - " + titulo + " - " + duracao);
    }
}
