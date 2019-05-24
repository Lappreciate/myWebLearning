package com.daojia.cache;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class RedisJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("39.97.77.194",6379);
        System.out.println("Connection to server sucessfully");
        //查看服务是否运行
        System.out.println("Server is running: " + jedis.ping());

        /*
         * String
         * */
        jedis.set("String","1");
        System.out.println(jedis.get("String"));


        /*
        * 哈希
        * */
//        jedis.hset("hash","name","lsy");
//        Map map = new HashMap();
//        map.put("age","26");
//        map.put("sex","man");
//        map.put("company","58DaoJia");
//        jedis.hmset("hash",map);
//        System.out.println(jedis.hgetAll("hash"));


        /*
         * 集合set
         * */
//        jedis.sadd("mykey","redis1");
//        jedis.sadd("mykey","redis2");
//        jedis.sadd("mykey","redis3");
//        jedis.sadd("mykey","redis4");
//        jedis.sadd("mykey","redis1");
//
//        jedis.sadd("otherkey","redis8");
//        jedis.sadd("otherkey","redis2");
//        jedis.sadd("otherkey","redis3");
//        jedis.sadd("otherkey","redis10");
//        jedis.sadd("otherkey","redis9");
//
//        System.out.println(jedis.scard("mykey"));
//        System.out.println(jedis.smembers("mykey"));
//        //两个集合的交集
//        String[] strs = {"mykey","otherkey"};
//        System.out.print(jedis.sinter(strs));

        /*
         *队列list
         * */

//        jedis.lpush("list","l1");
//        jedis.lpush("list","l2");
//        jedis.rpush("list","l3");
//        jedis.lpush("list","l4");
//        jedis.lpush("list","l5");
//        jedis.rpush("list","l6");
//        jedis.lpush("list","l7");
//        jedis.lpush("list","l8");
//        jedis.rpush("list","l9");
        //分页
        //System.out.println(jedis.lrange("list",0,10));
//        System.out.println(jedis.lpop("list"));
//        System.out.println(jedis.lpop("list"));
//        System.out.println(jedis.lpop("list"));

        /*
         *有序set
         * */
//        jedis.zadd("sortSet",10,"sjk");
//        jedis.zadd("sortSet",8,"tj");
//        jedis.zadd("sortSet",6,"zy");
//        jedis.zadd("sortSet",4,"jqm");
//        jedis.zadd("sortSet",1,"ld");
//        jedis.zadd("sortSet",7,"wl");
//        jedis.zadd("sortSet",9,"czs");
//
//        System.out.println(jedis.zrange("sortSet",0,10));
//        System.out.println(jedis.zscore("sortSet","jqm"));


    }
}
