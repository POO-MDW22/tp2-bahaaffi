import java.util.Scanner;
public class Exception {
        public static void main(String[] args) {
            int a, b, res;
            Scanner clavier = new Scanner(System.in);

            System.out.print("Entrer le nombre a: ");
            a = clavier.nextInt();
            System.out.print("Entrer le nombre b: ");
            b = clavier.nextInt();

            try {
                res = a / b;
                System.out.println("Le résultat de " + a + " divisé par " + b + " est " + res);
            } catch (ArithmeticException e) {
                System.out.println("Oops! Un problème dans la division.");
                System.out.println("Le message officiel est " + e.getMessage());
            } finally {
                System.out.println("Le bloc finally sera toujours exécuté.");
                System.out.println("C'est là que l'on fermera, par exemple, les fichiers.");
            }

            System.out.println("Fin du programme");
        }
    }

