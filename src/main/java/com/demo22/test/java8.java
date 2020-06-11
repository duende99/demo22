package com.demo22.test;

import lombok.Data;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {


    public static void main(String[] args) {

        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(33);
        list01.add(4);
        list01.add(5);

        //过滤
        List<Integer> collect = list01.stream().filter(a -> !a.equals(2)).collect(Collectors.toList());
        //遍历
        collect.stream().forEach(a -> {
            System.out.println(a);
        });
        //排序
        List<Integer> zhengCollect = list01.stream().sorted().collect(Collectors.toList());
        List<Integer> daoCollect = list01.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("正序排列：" + zhengCollect);
        System.out.println("倒序排列：" + daoCollect);

        List<user> list02 = new ArrayList<>(4);
        user u1 = new user();
        u1.setName("du1");
        u1.setAge(11);
        u1.setSex(12);
        user u2 = new user();
        u2.setName("du2");
        u2.setAge(12);
        u2.setSex(12);
        user u3 = new user();
        u3.setName("du5");
        u3.setAge(15);
        u3.setSex(12);
        user u4 = new user();
        u4.setName("du1");
        u4.setAge(13);
        u4.setSex(13);

        list02.add(u1);
        list02.add(u2);
        list02.add(u3);
        list02.add(u4);

        //过滤
        List<user> du2 = list02.stream().filter(a -> a.getName().equals("du2")).collect(Collectors.toList());
        System.out.println("du2:" +du2);
        //分组，遍历
        Map<String, List<user>> collect1 = list02.stream().collect(Collectors.groupingBy(user::getName));
        Set<Map.Entry<String, List<user>>> entries = collect1.entrySet();
        for (Map.Entry<String, List<user>> map : entries) {
            System.out.println("key: " + map.getKey());
            System.out.println("value: " + map.getValue());
        }
        Map<String, Long> collect2 = list02.stream().collect(Collectors.groupingBy(user::getName, Collectors.counting()));
        Set<Map.Entry<String, Long>> entries1 = collect2.entrySet();
        for (Map.Entry<String,Long> map : entries1) {
            System.out.println("key3:" + map.getKey());
            System.out.println("value3:" + map.getValue());
        }
        Iterator<Map.Entry<String, Long>> iterator = collect2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> next = iterator.next();
            System.out.println("key2: " + next.getKey());
            System.out.println("value2: " + next.getValue());
        }
        //分组，并且计算求和
        Map<String, IntSummaryStatistics> collect3 = list02.stream().collect(Collectors.groupingBy(user::getName, Collectors.summarizingInt(user -> user.getAge())));
        //排序，单个排序
        List<user> collect4 = list02.stream().sorted(Comparator.comparing(user::getAge)).collect(Collectors.toList());
        collect4.stream().forEach(a -> {
            System.out.println("排序2：" + a.getName());
        });
        //排序，单个排序，反序
        List<user> collect5 = list02.stream().sorted(Comparator.comparing(user::getAge).reversed()).collect(Collectors.toList());
        collect5.stream().forEach(a -> {
            System.out.println("排序3：" + a.getName());
        });
        //排序，多个字段排序
        List<user> collect6 = list02.stream().sorted(Comparator.comparing(user::getAge).thenComparing(user -> user.getAge())).collect(Collectors.toList());
        collect6.stream().forEach(a -> {
            System.out.println("排序6：" + a.getName());
        });
        //map ,对数据处理
        List<String> du0 = list02.stream().map(a -> a.getName().equals("du0") ? "dddddd" : a.getName()).collect(Collectors.toList());
        du0.forEach(a -> {
            System.out.println("数据处理：" + a);
        });

        List<user> collect7 = list02.stream().limit(2).collect(Collectors.toList());
        System.out.println("限制取值数量：" + collect7);
        OptionalInt max = list02.stream().mapToInt(user::getAge).max();



    }


}


@Data
class user {
    private String name;
    private Integer age;
    private Integer sex;
}
