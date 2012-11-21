package critiquedefilm;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CritiqueTest{
    public CritiqueTest(){}

    @Test
    public void nouvelleCritique(){
        Critique critique = new Critique("Roger Ebert","description",4);
    }
    
}
