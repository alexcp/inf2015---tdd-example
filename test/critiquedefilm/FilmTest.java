package critiquedefilm;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class FilmTest{

    public FilmTest(){}

    @Test
    public void testNouveauFilm(){
        Film leParrain = new Film("Le parrain","Francis Ford Coppola");
        assertNotNull(leParrain);
    }
}
