package critiquedefilm;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class FilmTest{
    Film film;

    public FilmTest(){}

    @Before
    public void setUp(){
        film = new Film("Le parrain","Francis Ford Coppola");
    }

    @Test
    public void testNouveauFilm(){
        assertNotNull(film);
    }

    @Test
    public void testAjouterCritiqueFilm(){
        assertTrue(film.nouvelleCritique("Roger Ebert","description",4));
    }

    @Test
    public void testScoreDevraitEtreLaMoyennesDesScoresDesCritiques(){
        Critique critiqueMock = mock(Critique.class);
        when(critiqueMock.getScore()).thenReturn(4);
        //ajoute 3 score de 4
        film.critiques.add(critiqueMock);
        film.critiques.add(critiqueMock);
        film.critiques.add(critiqueMock);

        Critique critiqueMock2 = mock(Critique.class);
        when(critiqueMock2.getScore()).thenReturn(3);
        // ajoute 2 score de 3
        film.critiques.add(critiqueMock2);
        film.critiques.add(critiqueMock2);

        assertEquals(3.6,film.score(),0.1);
    }
}
