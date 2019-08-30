package com.duzhiguang.springcloud.model;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName：User
 * Package:com.duzhiguang.springcloud.model
 * Description:
 *
 * @Date:2019/8/9 15:20
 * @Author：duzhiguang@bjpowernode.com
 */
//@EnableScheduling
//@EnableAsync
//@Component
public class User {

    private Integer id;
    private String name;
    private String phone;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

//    @Scheduled(cron = "0/1 * * * * ?")
//	@Async
//    public void run1() throws InterruptedException {
//
//        System.out.println(Thread.currentThread().getName() + "---定时任务1---" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        Thread.sleep(3000);
//    }
//
//    @Scheduled(cron = "0/1 * * * * ?")
//	@Async
//    public void run2(){
//        System.out.println(Thread.currentThread().getName() + "---定时任务2---" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//    }

}
