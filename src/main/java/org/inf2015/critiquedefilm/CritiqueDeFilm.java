package critiquedefilm;

import java.util.ArrayList;

public class CritiqueDeFilm {

    public static void main(String[] args) {
        ArrayList<Film> catalogue = new ArrayList<Film>();

        System.out.println("Ajouter Le Parrain au Catalogue");
        Film leParrain = new Film("Le parrain","Francis Ford Coppola");
        catalogue.add(leParrain);
        leParrain.nouvelleCritique("Roger Ebert","Bla bla bla",4);

        System.out.println("Ajouter Fargo au Catalogue");
        Film fargo = new Film("Fargo","Coens");
        catalogue.add(fargo);
        fargo.nouvelleCritique("Alex cp","Bla bla bla",4);
        fargo.nouvelleCritique("Jonh Doe","Bla bla bla",3);
        fargo.nouvelleCritique("Jonh Doe","Bla bla bla",3);
        fargo.nouvelleCritique("Jonh Doe","Bla bla bla",5);

        //La moyenne des score de Fargo
        System.out.println(fargo.score());
    }
}
