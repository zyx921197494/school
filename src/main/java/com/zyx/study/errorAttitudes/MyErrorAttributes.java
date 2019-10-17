package com.zyx.study.errorAttitudes;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;
import java.util.Date;
import java.util.Map;


@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    //方法返回的map就是浏览器页面和返回的json可以获取的所有字段
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        //添加自己的数据
        map.put("author", "zyx");
        map.put("time", new Date());
        Map<String, Object> extend = (Map<String, Object>) webRequest.getAttribute("extend", 0);
        map.put("extend", extend);
        return map;
    }
}
