import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Skapa ett program som läser in produkter i en matlista
        // tills att användaren skriver "done". Malistan får max innehålla 10 produkter.
        //Level up
        //
        //Ifall användaren skriver in fler än 10 produkter ska programmet
        // fråga vilken vara användaren vill ersätta den nya varan med.

        Scanner sc = new Scanner(System.in);
        ArrayList<String> matlista = new ArrayList<>();
        int MAX_SIZE = 3;
        String produkt = "";

        while (true) {
            System.out.println("Lägg till en vara: ");
            System.out.println("Om du är klar, skriv \"done\"");
            produkt = sc.nextLine();
            if (produkt.equals("done")) {
                break;
            }

            if (matlista.size() < MAX_SIZE) {
                matlista.add(produkt);
            } else {
                System.out.println("Listan kan innehålla max " + MAX_SIZE + " produkter.");
                System.out.println("Listan innehåller nu:");
                printList(matlista);
                }
                System.out.println();
                System.out.println("Vilken vara vill du ta bort och ersätta med " + produkt + "?");
                String ta_bort = sc.nextLine();
                searchAndReplace(matlista, produkt, ta_bort);

            }


        }
        //comment
        System.out.println("Här är hela listan:");
        printList();
        }


    }
    public static void searchAndReplace(ArrayList<String> lista, String nyVara, String gammalVara) {
        while (!lista.contains(gammalVara)) {
            System.out.println("Varan finns inte i listan. Välj igen.");
            gammalVara = sc.nextLine();
        }
        int ta_bort_index = lista.indexOf(gammalVara);
        lista.set(ta_bort_index, nyVara);



    }


    public static void printList(ArrayList<String> list) {
        for (String item : list)  {
            System.out.println(item);
        }
    }
}

