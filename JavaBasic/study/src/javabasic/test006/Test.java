package learn001.test006;

import org.junit.*;

public class Test {
    /**
     * 1.必须是公开的、无参数、无返回值的方法
     * 2.测试方法必须使用@Test注解标记
     */

    @Before
    public void before(){
        System.out.println("==========");
    }

    @After
    public void after(){
        System.out.println("=================");
    }

    @BeforeClass
    public void beforeclass(){

    }

    @AfterClass
    public void afterclass(){

    }

    @org.junit.Test
    public void testloginName(){
        User user = new User();
        String rs = user.loginName("admin","123456");

        //进行预期结果的正确性测试：断言
        Assert.assertEquals("您的业务可能出问题","登录成功",rs);

    }

    @org.junit.Test
    public void testselect(){
        User user = new User();
        user.select();
    }

}
