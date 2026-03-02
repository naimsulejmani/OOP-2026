package introduction.Date20260203;

public class Trainer {
    // Fushat (properties)
    private String emri;
    private String mbiemri;
    private int mosha;
    private String nacionaliteti;
    private String ekipiAktual;
    private int eksperiencaVite;
    private String taktikaPreferuar;
    private boolean aktiv;

    // Konstruktori pa parametra
    public Trainer() {
        this.aktiv = true;
    }

    // Konstruktori me parametra
    public Trainer(String emri, String mbiemri, int mosha, String nacionaliteti) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.nacionaliteti = nacionaliteti;
        this.aktiv = true;
    }

    // Getter dhe Setter methods
    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        if (mosha > 0) {
            this.mosha = mosha;
        } else {
            System.out.println("Mosha duhet te jete pozitive!");
        }
    }

    public String getNacionaliteti() {
        return nacionaliteti;
    }

    public void setNacionaliteti(String nacionaliteti) {
        this.nacionaliteti = nacionaliteti;
    }

    public String getEkipiAktual() {
        return ekipiAktual;
    }

    public void setEkipiAktual(String ekipiAktual) {
        this.ekipiAktual = ekipiAktual;
    }

    public int getEksperiencaVite() {
        return eksperiencaVite;
    }

    public void setEksperiencaVite(int eksperiencaVite) {
        if (eksperiencaVite >= 0) {
            this.eksperiencaVite = eksperiencaVite;
        }
    }

    public String getTaktikaPreferuar() {
        return taktikaPreferuar;
    }

    public void setTaktikaPreferuar(String taktikaPreferuar) {
        this.taktikaPreferuar = taktikaPreferuar;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    // Metoda per te shfaqur te dhenat e trajnerit
    public void shfaqTeDhenat() {
        System.out.println("Emri: " + emri + " " + mbiemri);
        System.out.println("Mosha: " + mosha);
        System.out.println("Nacionaliteti: " + nacionaliteti);
        System.out.println("Ekipi aktual: " + ekipiAktual);
        System.out.println("Eksperienca: " + eksperiencaVite + " vite");
        System.out.println("Taktika preferuar: " + taktikaPreferuar);
        System.out.println("Statusi: " + (aktiv ? "Aktiv" : "Jo aktiv"));
    }
}