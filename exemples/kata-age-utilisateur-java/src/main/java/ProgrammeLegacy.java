import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProgrammeLegacy {
    public static void main(String[] args) {
        System.out.println("Date de naissance (ex 15/01/1983) ?");
        String naissanceSaisie = récupèreDateNaissanceEnChaîne();
        LocalDate dateNaissance = dateNaissance(naissanceSaisie);
        long age = calculeAge(dateNaissance);
        System.out.println(String.format("Vous avez %s ans", age));
    }

    private static String récupèreDateNaissanceEnChaîne() {
        return new Scanner(System.in, "UTF-8").nextLine();
    }

    private static LocalDate dateNaissance(String naissanceSaisie) {
        return LocalDate.parse(naissanceSaisie, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private static long calculeAge(LocalDate dateNaissance) {
        return dateNaissance.until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
