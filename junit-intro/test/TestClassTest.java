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

    }

    @After
    public void tearDown() {

    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {


    }



}