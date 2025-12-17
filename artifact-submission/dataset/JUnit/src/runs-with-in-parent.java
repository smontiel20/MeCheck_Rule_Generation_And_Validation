@RunWith(Suite.class)
@SuiteClasses(MySuiteClass.class)
public abstract class Parent {
}

@RunWith(Parameterized.class)
@Test
public class MyTest {
}

@RunWith(Parameterized.class)
@Test
public class MyOtherTest {
}

@Test
public class MyThirdTest {
}