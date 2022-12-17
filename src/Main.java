/*Si scriva un programma che chieda all’utente di inserire le dimensioni di un triangolo
(un intero compreso tra 1 e 50).
Si visualizzi il triangolo mostrando righe di asterischi.
La prima riga avrà un asterisco solo, la seconda due e così via;
ciascuna riga avrà un asterisco in più della precedente
fino a raggiungere il numero di righe indicato dall’utente.
Per le righe successive, il numero di asterischi per riga
deve decrescere di uno per ogni nuova riga.*/
import java.util.Scanner;
public class TriangoloReloaded {
    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);
        System.out.print("Inserisca un numero fra 2 e 50 per disegnare il triangolo: ");
        int triangolo = tri.nextInt();
        System.out.print("I numero inserito è: " + triangolo);
        System.out.println("\n");
        if (triangolo>1 && triangolo<=50) {
            //Triangolo ascendente
            for (int t=0; t<triangolo; t++) {
                for (int ast= 0; ast<= t; ast++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //Triangolo discendente
            for (int t=triangolo-1; t>0; t--) {
                for (int ast= t; ast> 0; ast--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Errore. Il numero inserito non è tra i limiti segnati");
        }
    }
}
