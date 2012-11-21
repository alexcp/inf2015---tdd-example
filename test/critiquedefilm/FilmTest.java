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
}
