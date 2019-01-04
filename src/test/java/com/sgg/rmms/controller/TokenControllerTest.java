package com.sgg.rmms.controller;

import base.test.BaseMockMvcTest;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TokenControllerTest extends BaseMockMvcTest {
    @Test
    public void testGetToken()throws Exception{
        /**
         *  = "clientKey"
         *  = "timeStamp"
         * digest";
         * password";
         */
        String clientKey="admin";
        String passsword="123456";
        String digest=null;
        String timeStamp=((Long)System.currentTimeMillis()).toString();
        digest=clientKey+passsword+timeStamp;
        digest=mockMvc.perform(post("http://localhost:9080/digest").param("data",digest)).andReturn().getResponse().getContentAsString();
        String responseString = mockMvc.perform(
                post("http://localhost:9080/apply-token")    //请求的url,请求的方法是get
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格
                 .param("clientKey","admin")         //添加参数
                        .param("clientKey","admin")
                        .param("clientKey","admin")
                        .param("clientKey","admin")
        ).andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("--------返回的json = " + responseString);
    }
}