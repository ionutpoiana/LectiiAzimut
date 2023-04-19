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
        assertEquals(5, rezultatSumaNumere.sumaNumere(2,3));
    }

    public void testMaxim() {
        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};
        TestareJUnit rezultatMaxim = new TestareJUnit();
        assertEquals(90, rezultatMaxim.maxim(exercitiulUnu));
    }
}