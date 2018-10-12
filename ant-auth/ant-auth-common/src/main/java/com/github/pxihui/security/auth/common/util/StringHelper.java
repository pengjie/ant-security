package com.github.pxihui.security.auth.common.util;

/**
 * @program: ant-security
 * @description:
 * @author: Mr.Peng
 * @create: 2018-10-12 11:14
 **/
public class StringHelper {

  public static String getObjectValue(Object obj){
    return obj==null?"":obj.toString();
  }

}
