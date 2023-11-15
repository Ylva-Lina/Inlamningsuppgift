import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testrunner {

    @Test
    public void testGetWords(){
        //Arrange
        Logic logic = new Logic();
        int expected = 4;

        //Act
        logic.inputCount("live long and prosper");
        int actual = logic.getWords();

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testGetChars(){
        //Arrange
        Logic logic = new Logic();
        int expected = 18;

        //Act
        logic.inputCount("live long and prosper");
        int actual = logic.getChars();

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testGetLongestWord(){
        //Arrange
        Logic logic = new Logic();
        String expected = "prosper";

        //Act
        logic.inputCount("live long and prosper");
        logic.findLongestWord();
        String actual = logic.getLongestWord();

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testFindStop(){
        //Arrange
        Logic logic = new Logic();
        boolean expected = true;

        //Act
        boolean actual = logic.findStop("test stop test");

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testNoStop(){
        //Arrange
        Logic logic = new Logic();
        boolean expected = false;

        //Act
        boolean actual = logic.findStop("live long and prosper");

        //Assert
        assertEquals(expected,actual);
    }
}
