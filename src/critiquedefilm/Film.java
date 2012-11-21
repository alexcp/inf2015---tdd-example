package critiquedefilm;

public class Film{
    String titre;
    String realisateur;

    public Film(String titre, String realisateur){
        this.titre = titre;
        this.realisateur = realisateur;
    }
    
    public boolean nouvelleCritique(String auteur,String description, int score){
        return true;
    }
}
