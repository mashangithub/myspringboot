package com.ljm.cn.util;

/**
 * @author lijms
 * @date 2021/4/3/003 0:33
 */
public class SingleTonMode {

    private static SingleTonMode single = new SingleTonMode();

    private SingleTonMode() {
    }

    public static SingleTonMode getSingle(){
        return single;
    }
}
