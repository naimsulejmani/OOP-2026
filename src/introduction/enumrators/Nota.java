package introduction.enumrators;

public enum Nota {

    //specifikohen instancat/objektet e klases(enumt) Nota
    //nese deshirojme me shtu dicka i shtojme si variable apo metode vendosim (;)

    DOBET(1, "Dobet"),//new Nota(1)
    MJAFTUESHEM(2, "Mjaftueshem"),
    MIRE(3, "Mire"),
    SHUME_MIRE(4, "Shume mire"),
    SHKELQYESHEM(5, "Shkelqyeshem");

    private final int value;
    private final String name;

    private Nota(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%d (%s)", value, name);
    }
}
