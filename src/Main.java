import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Canal> canais = new HashMap<>();
    private static Map<String, Video> videos = new HashMap<>();

    public static void main(String[] args) {
        Canal canalAulaEmVideo = new Canal("Aula em Vídeo", "Professor X");
        Canal canalNostalgia = new Canal("Nostalgia", "Joãozinho");
        Canal canalCoisaDeNerd = new Canal("Coisa de Nerd", "Carlos");
        Canal canalCasimiro = new Canal("Casimiro", "Casimiro");
        Canal canalPodPah = new Canal("PodPah", "Mítico");
        Canal canalMarinaDeLara = new Canal("Marina de Lara", "Marina de Lara");

        canalAulaEmVideo.adicionarVideo(new Video("Curso de Java - Aula 01", "20:00", canalAulaEmVideo));
        canalAulaEmVideo.adicionarVideo(new Video("Curso de Python - Aula 02", "15:00", canalAulaEmVideo));

        canalNostalgia.adicionarVideo(new Video("História do Super Nintendo", "12:30", canalNostalgia));
        canalNostalgia.adicionarVideo(new Video("O que aconteceu com o Orkut?", "18:00", canalNostalgia));

        canalCoisaDeNerd.adicionarVideo(new Video("Minecraft: Sobrevivência Épica", "22:30", canalCoisaDeNerd));
        canalCoisaDeNerd.adicionarVideo(new Video("Testando os Melhores Mods de Jogos", "16:45", canalCoisaDeNerd));

        canalCasimiro.adicionarVideo(new Video("React - Highlights da Copa do Mundo", "10:45", canalCasimiro));
        canalCasimiro.adicionarVideo(new Video("React - Entrevista com Neymar", "20:30", canalCasimiro));

        canalPodPah.adicionarVideo(new Video("Entrevista com Mítico Jovem", "40:00", canalPodPah));
        canalPodPah.adicionarVideo(new Video("Podcast com Luva de Pedreiro", "50:00", canalPodPah));

        canalMarinaDeLara.adicionarVideo(new Video("Conhecendo o Java", "12:00", canalMarinaDeLara));
        canalMarinaDeLara.adicionarVideo(new Video("Orientação a Objetos e Classes", "100:00", canalMarinaDeLara));

        canais.put(canalAulaEmVideo.getNome(), canalAulaEmVideo);
        canais.put(canalNostalgia.getNome(), canalNostalgia);
        canais.put(canalCoisaDeNerd.getNome(), canalCoisaDeNerd);
        canais.put(canalCasimiro.getNome(), canalCasimiro);
        canais.put(canalPodPah.getNome(), canalPodPah);
        canais.put(canalMarinaDeLara.getNome(), canalMarinaDeLara);

        videos.put("Curso de Java - Aula 01", canalAulaEmVideo.getVideos().get(0));
        videos.put("Curso de Python - Aula 02", canalAulaEmVideo.getVideos().get(1));
        videos.put("História do Super Nintendo", canalNostalgia.getVideos().get(0));
        videos.put("O que aconteceu com o Orkut?", canalNostalgia.getVideos().get(1));
        videos.put("Minecraft: Sobrevivência Épica", canalCoisaDeNerd.getVideos().get(0));
        videos.put("Testando os Melhores Mods de Jogos", canalCoisaDeNerd.getVideos().get(1));
        videos.put("React - Highlights da Copa do Mundo", canalCasimiro.getVideos().get(0));
        videos.put("React - Entrevista com Neymar", canalCasimiro.getVideos().get(1));
        videos.put("Entrevista com Mítico Jovem", canalPodPah.getVideos().get(0));
        videos.put("Podcast com Luva de Pedreiro", canalPodPah.getVideos().get(1));
        videos.put("Conhecendo o Java", canalMarinaDeLara.getVideos().get(0));
        videos.put("Orientação a Objetos e Classes", canalMarinaDeLara.getVideos().get(1));

        Menu menu = new Menu();
        menu.exibirMenu();
    }

    public static Map<String, Canal> getCanais() {
        return canais;
    }

    public static Map<String, Video> getVideos() {
        return videos;
    }
}
