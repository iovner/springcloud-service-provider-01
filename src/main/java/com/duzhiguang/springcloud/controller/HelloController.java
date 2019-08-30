package com.duzhiguang.springcloud.controller;

import com.duzhiguang.springcloud.model.User;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;


/**
 * ClassName：HelloController
 * Package:com.duzhiguang.springcloud.controller
 * Description:
 *
 * @Date:2019/8/7 15:45
 * @Author：duzhiguang@bjpowernode.com
 */
@RestController //等价于@Controller + @ResponseBody
public class HelloController {

    //如果不指定请求方式，默认支持GET，POST请求
    //@RequestMapping("/service/hello")

    //指定接口只支持GET请求
    @GetMapping("/service/hello")
    public String hello(){


        System.out.println("负载均衡到：服务提供者------>1");

        //模拟服务提供者发生异常，会不会在调用端直接进入回调方法进行服务降级
        //int a = 10/0;

        return "Hello,SpringCloud,Provider 1";

    }

    @RequestMapping("/service/user")
    public User user(){

        System.out.println("负载均衡到：服务提供者------>1");

        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setPhone("13453124942");
        return user; //这里返回的User对象，会转换成json对象返回

    }

    @RequestMapping("/service/getUser")
    public User getUser(@RequestParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("phone") String phone){

        System.out.println("负载均衡到：服务提供者------>1");

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);
        return user; //这里返回的User对象，会转换成json对象返回

    }

    //@RequestMapping(value="/service/addUser",method = RequestMethod.POST);
    @PostMapping("/service/addUser")
    public User addUser(@RequestParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("phone") String phone){

        System.out.println("post方法添加用户，服务提供者1");

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);
        return user; //这里返回的User对象，会转换成json对象返回

    }

    //@RequestMapping(value="/service/updateUser",method = RequestMethod.PUT);
    @PutMapping("/service/updateUser")
    public User updateUser(@RequestParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("phone") String phone){

        System.out.println("put方法修改用户，服务提供者1");
        System.out.println(id);
        System.out.println(name);
        System.out.println(phone);

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);
        return user; //这里返回的User对象，会转换成json对象返回

    }

    //@RequestMapping(value="/service/deleteUser",method = RequestMethod.DELETE);
    @DeleteMapping("/service/deleteUser")
    public User deleteUser(@RequestParam("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("phone") String phone){

        System.out.println("delete方法删除用户，服务提供者1");
        System.out.println(id);
        System.out.println(name);
        System.out.println(phone);

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);
        return user; //这里返回的User对象，会转换成json对象返回

    }

    public static void main(String[] args) {

        String str = "abcdefg";
        String[] ss = str.split("");
        int index = ss.length-1;
        for (;index >= 0; index--) {
            System.out.println(ss[index]);
        }

        int num = 123;
        int aaa = 222;

    }


}
