package critiquedefilm;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CritiqueTest{
    Critique critique;
    public CritiqueTest(){}

    @Before
    public void setUp(){
        critique = new Critique("Roger Ebert","description",4);
    }

    @Test
    public void testNouvelleCritique(){
        assertNotNull(critique);
    }

    @Test
    public void testGetScore(){
        assertEquals(4,critique.getScore());
    }
    
}
