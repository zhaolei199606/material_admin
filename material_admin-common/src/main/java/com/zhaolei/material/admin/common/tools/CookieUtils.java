package com.zhaolei.material.admin.common.tools;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ZHAOLEI
 */
public class CookieUtils {

    public static String getValue(Cookie[] cookies,String key){
        if(cookies == null){
            return null;
        }
        String value = null;
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(key)){
                value = cookie.getValue();
                break;
            }
        }
        return value;
    }

    public static Cookie getCookie(Cookie[] cookies,String key){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(key)){
               return cookie;
            }
        }
        return null;
    }
    public static Cookie createCookie(String key,String value,int maxAge,String path){
        Cookie cookie = new Cookie(key,value);
        cookie.setPath(path);
        //时区问题，所以加上八小时
        cookie.setMaxAge(maxAge+TimeUtils.EIGHT_HOURS);
        return cookie;
    }

    public static void clearCookie(HttpServletResponse response,Cookie[] cookies, String ... keys){
        for(String key : keys){
            clear(response,cookies,key);
        }
    }

    public static void cleaAllCookie(HttpServletResponse response,Cookie[] cookies){
        for(Cookie cookie : cookies){
            cookie.setMaxAge(0);
            //当path、domain相同时才会删除对应的cookie
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }

    public static void clear(HttpServletResponse response,Cookie[] cookies,String key){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(key)){
                cookie.setMaxAge(0);
                //当path、domain相同时才会删除对应的cookie
                cookie.setPath("/");
                response.addCookie(cookie);
                break;
            }
        }
    }


}
