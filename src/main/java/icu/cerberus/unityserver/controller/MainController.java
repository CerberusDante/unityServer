package icu.cerberus.unityserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/admin")
    public String test() {
        String s = "Hello World";
        String s1 = JSON.toJSONString(s);
        System.out.println(s1);
        return JSON.toJSONString(s);
    }

    @GetMapping("/api/msg")
    public String testJson() {
        JSON json = new JSONObject();
        System.out.println("+++++++++++++++");
        System.out.println("+++++++++++++++");
        System.out.println("+++++++++++++++");

        return json.toJSONString();
    }
}
