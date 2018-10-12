package com.github.pxihui.security.auth.common.util.jwt;

/**
 * @program: ant-security
 * @description:
 * @author: Mr.Peng
 * @create: 2018-10-12 11:14
 **/
public interface IJWTInfo {
    /**
     * 获取用户名
     * @return
     */
    String getUniqueName();

    /**
     * 获取用户ID
     * @return
     */
    String getId();

    /**
     * 获取名称
     * @return
     */
    String getName();
}
