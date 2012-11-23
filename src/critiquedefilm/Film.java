package critiquedefilm;

import java.util.ArrayList;

public class Film{
    String titre;
    String realisateur;
    ArrayList<Critique> critiques = new ArrayList<Critique>();

    public Film(String titre, String realisateur){
        this.titre = titre;
        this.realisateur = realisateur;
    }
    
    public boolean nouvelleCritique(String auteur,String description, int score){
        Critique nouvelleCritique = new Critique(auteur,description,score);
        return critiques.add(nouvelleCritique) && nouvelleCritique != null;
    }

    public double score(){
        double sum = 0;
        for(Critique critique : critiques){
            sum += (double)critique.getScore();
        }
        return sum / critiques.size();
    }
}
