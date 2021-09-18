import java.util.Random;

public class FortuneCookie {

    static String[] quotes = {"Quand tu ne sais pas où tu vas, n'oublies jamais d'où tu viens.",
            "La notoriété, c'est lorsqu'on remarque votre présence, la célébrité c'est lorsqu'on note votre absence",
            "Avant notre venue, rien ne manquait au monde. Après notre départ, rien ne lui manquera",
            "La médecine a fait depuis un siècle des progrès sans répit, inventant par milliers des maladies nouvelles",
            "L'expérience est le nom qu'on donne a ses erreurs",
            "Le courage n'est pas une vertu mais une qualité commune aux scelérats et aux grands hommes",
            "Si tu veux qu'on t'entende, crie. Si tu veux qu'on t'écoute, chuchote."        
        };
    public static void main(String[] args) {
        Random n = new Random();
        int a = n.nextInt(quotes.length);
        System.out.println(quotes[a]);
    }
}
