package introduction.interfaces.extra;

public class FutballTeam implements Comparable<FutballTeam> {
    private int id;
    private String name;
    private int championsLeageTrophies;

    public FutballTeam(int id, String name, int championsLeageTrophies) {
        this.id = id;
        this.name = name;
        this.championsLeageTrophies = championsLeageTrophies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChampionsLeageTrophies() {
        return championsLeageTrophies;
    }

    public void setChampionsLeageTrophies(int championsLeageTrophies) {
        this.championsLeageTrophies = championsLeageTrophies;
    }

    @Override
    public int compareTo(FutballTeam o) {
        return this.championsLeageTrophies - o.championsLeageTrophies;
    }
}
