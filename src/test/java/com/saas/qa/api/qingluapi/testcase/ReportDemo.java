package com.saas.qa.api.qingluapi.testcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportDemo {

    @Test
    public void test() {
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, 1);

    }

    @Test
    public void test3() {
        Assert.assertEquals("aaa", "aaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己的日志");
        throw new RuntimeException("这个是我们自己抛出的异常");
    }

}
