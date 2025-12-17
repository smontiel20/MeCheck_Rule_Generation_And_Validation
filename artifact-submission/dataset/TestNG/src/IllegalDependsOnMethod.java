public class SampleTest {
    @Test(dependsOnMethods = "testSpellignError")
    public void testSample() {}
    @Test
    public void testSpellingError() {}
}