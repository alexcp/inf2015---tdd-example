package critiquedefilm;

public class Critique{
    String auteur;
    String description;
    private int score;

    public Critique(String auteur, String description, int score){
        this.auteur = auteur;
        this.description = description;
        this.score = score;
    }
    
    public int getScore(){
        return score;
    }
}
