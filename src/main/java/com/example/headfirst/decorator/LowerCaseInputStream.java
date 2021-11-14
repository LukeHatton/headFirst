package com.example.headfirst.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Package: com.example.headfirst.decorator
 * <p>Description:测试类，使用装饰者模式增强FilterInputStream，将输入的字符串改写为小写
 * <p>User: lizhao 2021/11/13
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /* 处理字节数据 */
    @Override
    public int read() throws IOException {
        int read = super.read();        //读1字节数据
        return read == -1 ? read : Character.toLowerCase(read);     //将数据转换为小写
    }

    /* 处理字节数组数据 */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);     //读取到的字节数
        for (int i = off; i < off + read; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return read;
    }

}
