package com.example.test;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

public class Test1 {
    @Test
    public void test01(){

        Integer a = 0;
        Integer b = new Integer(0);
        System.out.println(a == b);
    }

}
