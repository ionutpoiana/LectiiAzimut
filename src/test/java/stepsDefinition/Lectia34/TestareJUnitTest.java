package stepsDefinition.Lectia34;

import junit.framework.TestCase;

public class TestareJUnitTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testSumaNumere() {
        TestareJUnit rezultatSumaNumere = new TestareJUnit();
        assertEquals(5, rezultatSumaNumere.sumaNumere(3,3));
    }
}