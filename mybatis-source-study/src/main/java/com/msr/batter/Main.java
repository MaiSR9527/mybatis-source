package com.msr.batter;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-24 22:06:43
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // 1.读取配置文件，字节输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    }
}
