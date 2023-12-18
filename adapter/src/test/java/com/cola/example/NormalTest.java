package com.cola.example;

import com.cola.example.utils.DateUtils;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author maqidi
 * @date 2023/12/18 7:49 PM
 */
public class NormalTest {
    /**
     * 测试工具的依赖
     */
    @Test
    public void testToolsDependent() {

        Date date = DateUtils.plusDays(new Date(), 1);
        System.out.println(date);
    }
}
