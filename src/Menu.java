import java.util.Scanner;

public class Menu {
    private Usuario usuario;
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Conta");
            System.out.println("2. Inscrever-se em um Canal");
            System.out.println("3. Assistir a um Vídeo");
            System.out.println("4. Ver Canais Inscritos");
            System.out.println("5. Visualizar Vídeos Assistidos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    if (usuario == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        inscreverEmCanal();
                    }
                    break;
                case 3:
                    if (usuario == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        assistirVideo();
                    }
                    break;
                case 4:
                    if (usuario == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        visualizarCanaisInscritos();
                    }
                    break;
                case 5:
                    if (usuario == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        visualizarVideosAssistidos();
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void criarConta() {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();

        usuario = new Usuario(nome, email);
        System.out.println("Conta criada com sucesso! Nome: " + nome + ", E-mail: " + email);
    }

    private void inscreverEmCanal() {
        System.out.println("Lista de Canais Disponíveis:");
        int i = 1;
        for (Canal canal : Main.getCanais().values()) {
            System.out.println(i + ". " + canal.getNome());
            i++;
        }

        System.out.print("Escolha o número do canal para inscrever-se: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha >= 1 && escolha <= Main.getCanais().size()) {
            Canal canalEscolhido = (Canal) Main.getCanais().values().toArray()[escolha - 1];
            usuario.inscreverEmCanal(canalEscolhido);
            System.out.println("Inscrição realizada com sucesso no canal: " + canalEscolhido.getNome());
        } else {
            System.out.println("Número inválido. Tente novamente.");
        }
    }

    private void assistirVideo() {
        System.out.println("Lista de Vídeos Disponíveis:");
        int i = 1;
        for (Video video : Main.getVideos().values()) {
            System.out.println(i + ". " + video.getCanal().getNome() + " - " + video.getTitulo() + " - " + video.getDuracao());
            i++;
        }

        System.out.print("Escolha o número do vídeo para assistir: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha >= 1 && escolha <= Main.getVideos().size()) {
            Video videoEscolhido = (Video) Main.getVideos().values().toArray()[escolha - 1];
            usuario.assistirVideo(videoEscolhido);
            System.out.println("Você assistiu ao vídeo: " + videoEscolhido.getTitulo());
        } else {
            System.out.println("Número inválido. Tente novamente.");
        }
    }

    private void visualizarCanaisInscritos() {
        usuario.visualizarCanaisInscritos();
    }

    private void visualizarVideosAssistidos() {
        System.out.println("Vídeos Assistidos:");
        for (Video video : usuario.getVideosAssistidos()) {
            video.exibirInformacoes();
        }
    }
}
