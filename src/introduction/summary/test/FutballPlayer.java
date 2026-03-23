package introduction.summary.test;

public class FutballPlayer {

    private String name;

    private FutballPlayer() {

    }

    private FutballPlayer(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

//    public FutballPlayer getInstance() {
//        return new FutballPlayer();
//    }

}
