package com.vimemacs.demo.controller;

import com.vimemacs.demo.util.VimEmacsProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by HWD on 2019/8/25 11:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTests {
    @Autowired
    private VimEmacsProperties vimEmacsProperties;

    @Test
    public void getInfo() throws Exception {
        System.out.println(vimEmacsProperties.getTitle());
        Assert.assertEquals(vimEmacsProperties.getTitle(), "VimEmacs");
        Assert.assertEquals(vimEmacsProperties.getDescription(), "Just do IT");
    }
}
