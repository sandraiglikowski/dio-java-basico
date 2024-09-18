import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Canal " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);

        System.out.print("Escolha um canal: ");
        smartTv.canal = scanner.nextInt();
        System.out.println("Canal " + smartTv.canal);

        /*
         * smartTv.diminuirVolume();
         * smartTv.diminuirVolume();
         * smartTv.diminuirVolume();
         * smartTv.aumentarVolume();
         * 
         * System.out.println("Canal atual: " + smartTv.canal);
         * smartTv.mudarCanal(13);
         * System.out.println("Canal atual: " + smartTv.canal);
         * 
         * System.out.println("Volume atual : " + smartTv.volume);
         * 
         * System.out.println("TV ligada ? " + smartTv.ligada);
         * System.out.println("Canal atual ? " + smartTv.canal);
         * System.out.println("Volume atual ? " + smartTv.volume);
         * 
         * smartTv.ligar();
         * System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
         * 
         * smartTv.desligar();
         * System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
         * 
         */
    }
}
