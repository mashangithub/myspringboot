package com.ljm.cn.demo;

/**
 * @author lijms
 * @date 2021/2/28/028 10:17
 */
public class NormalBean {
    public interface IService{} //@1
    public static class ServiceA implements IService{} //@2
    public static class ServiceB implements IService{} //@3
}
