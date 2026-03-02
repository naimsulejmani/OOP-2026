package introduction.Date20260203;

public class TrainerDemo {
    public static void main(String[] args) {
        // Krijimi i objektit per Zinedine Zidane
        Trainer zidane = new Trainer();
        zidane.setEmri("Zinedine");
        zidane.setMbiemri("Zidane");
        zidane.setMosha(52);
        zidane.setNacionaliteti("Francez");
        zidane.setEkipiAktual("Real Madrid");
        zidane.setEksperiencaVite(10);
        zidane.setTaktikaPreferuar("4-3-3");

        // Krijimi i objektit per Pep Guardiola
        Trainer guardiola = new Trainer("Pep", "Guardiola", 53, "Spanjoll");
        guardiola.setEkipiAktual("Manchester City");
        guardiola.setEksperiencaVite(15);
        guardiola.setTaktikaPreferuar("4-3-3");

        // Shfaqja e te dhenave
        System.out.println("=== Zinedine Zidane ===");
        zidane.shfaqTeDhenat();

        System.out.println("\n=== Pep Guardiola ===");
        guardiola.shfaqTeDhenat();
    }
}