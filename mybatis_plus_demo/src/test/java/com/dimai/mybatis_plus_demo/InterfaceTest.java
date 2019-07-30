package com.dimai.mybatis_plus_demo;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dimai.mybatis_plus_demo.entity.User;
import com.dimai.mybatis_plus_demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by pijiang on 2019/6/20.
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class InterfaceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectTest(){
        //无实体查询
        List<Map<String, Object>> maps = userMapper.selectMaps(new QueryWrapper<>());
        log.info("用户列表：{}", maps);
        //分页条件查询
        IPage<User> iPage = userMapper.selectPage(new Page<>(1, 3),
                new QueryWrapper<User>().between("age", 18,50));
        log.info("当前页{}|每页{}条|总记录数{}|共{}页", iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
        iPage.getRecords().forEach(user -> {
            log.info("用户：{}", JSON.toJSONString(user));
        });
    }

    @Test
    public void updateTest(){
        log.info("根据ID更新用户ID：{}", 1);
        userMapper.updateById(new User().setId(1L)
                                        .setName("GGG"));
        log.info("根据条件更新用户ID：{}", 1);
        userMapper.update(new User().setName("GGG"), new UpdateWrapper<User>().eq("id", 1));
    }

    @Test
    public void InsertTest(){
        log.info("新增用户ID：{}", "自增");
        userMapper.insert(new User().setName("PPP").setAge(40L).setEmail("123456@qq.com"));
        log.info("查询结果：");
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        users.forEach(u -> {
            log.info("用户：{}", JSON.toJSONString(u));
        });
    }

    @Test
    public void delTest(){
        User user = userMapper.queryLast();
        log.info("删除最后一个用户ID:{}", user.getId());
        userMapper.deleteById(user.getId());
        log.info("查询结果：");
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        users.forEach(u -> {
            log.info("用户：{}", JSON.toJSONString(u));
        });
    }

    @Test
    public void Testl(){
        User user =new User();
        user.setName("kaka");
        List<User> l = new ArrayList<>();
        l.add(user);
        System.out.println(">>>>>>>>>>>>>>>>>>> "+l);
        List<String> collect = l.stream().map(da -> da.getName()).collect(Collectors.toList());
        System.out.println("---<>>>>>>>>>>>> "+collect);


//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        for(Integer i : list){
//            System.out.println(i+" ");
//        }
//        list.forEach(x-> System.out.println(x));
//    list.forEach(System.out::println);
    }


    @Test
    public void TestSleep()throws Exception {
//        String s ="dasd";
//        String snList = null;
//        int retryTimes = 0;
//        while (s.length()>0) {
//            if (snList == null || snList.isEmpty()) {
//                System.out.println("-------》》》》》》》》》》》 bengin");
//                if (retryTimes++ < 3) {
//                    Thread.sleep(500);
//                    System.out.println("????????????????");
//                    continue;
//                }
//                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> end");
//            }
//        }

//        User u = new User();
//        u.setId(1L);
//        u.setId(2L);
//        u.setId(3L);
//        u.setName("zhen");
//        u.setName("zhe");
//        u.setName("zh");
//        u.setAge(11L);
//        u.setAge(12L);
//        u.setAge(13L);
//        u.setEmail("www");
//        u.setEmail("ww");
//        u.setEmail("w");
//        List<User> list = new ArrayList();
//        list.add(u);
//        Long id = list.get(list.size()-1).getId();
//        System.out.println(".......>>>>>>> "+id);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = dateFormat.parse(dateFormat.format(new Date()));
        System.out.println(" 》》》》》  "+new Date());


    }
}