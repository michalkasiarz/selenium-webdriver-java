package test;

import org.junit.*;

class TestClassTest {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Executed before class");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Executed after class");
    }

    @Before
    public void setUp() {
        System.out.println("Executed before");
    }

    @After
    public void tearDown() {
        System.out.println("Executed after");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }


}