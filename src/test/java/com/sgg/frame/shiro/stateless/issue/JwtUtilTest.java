package com.sgg.frame.shiro.stateless.issue;

import org.junit.Test;

import static org.junit.Assert.*;

public class JwtUtilTest {
    @Test
    public void hmacDigest(){
        System.out.println(JwtUtil.hmacDigest("sssssssssssssdddddddddd"));
    }
}