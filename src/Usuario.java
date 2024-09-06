import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Video> videosAssistidos;
    private List<Canal> canaisInscritos;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.videosAssistidos = new ArrayList<>();
        this.canaisInscritos = new ArrayList<>();
    }

    public void inscreverEmCanal(Canal canal) {
        if (!canaisInscritos.contains(canal)) {
            canaisInscritos.add(canal);
        }
    }

    public void assistirVideo(Video video) {
        if (!videosAssistidos.contains(video)) {
            videosAssistidos.add(video);
        }
    }

    public void visualizarCanaisInscritos() {
        System.out.println("Canais Inscritos:");
        for (Canal canal : canaisInscritos) {
            System.out.println(canal.getNome());
        }
    }

    public List<Video> getVideosAssistidos() {
        return videosAssistidos;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
