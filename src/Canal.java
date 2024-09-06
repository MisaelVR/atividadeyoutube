import java.util.ArrayList;
import java.util.List;

public class Canal {
    private String nome;
    private List<Video> videos;
    private String criador;

    public Canal(String nome, String criador) {
        this.nome = nome;
        this.criador = criador;
        this.videos = new ArrayList<>();
    }

    public void adicionarVideo(Video video) {
        videos.add(video);
    }

    public String getNome() {
        return nome;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public String getCriador() {
        return criador;
    }
}
