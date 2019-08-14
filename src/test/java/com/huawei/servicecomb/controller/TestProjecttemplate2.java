package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecttemplate2 {

      Projecttemplate2Delegate projecttemplate2Delegate = new Projecttemplate2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecttemplate2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
