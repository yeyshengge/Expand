package com.zps.redisLock.service.impl;

import com.zps.redisLock.service.RedisLockService;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by zps on 2020/2/18 14:26
 */
public class RedisLockServiceImpl implements RedisLockService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    //扣减库存
    @Override
    public void decrCount() {
        //String id = UUID.randomUUID().toString();
        RLock lock = redissonClient.getLock("lock");
        try {
            //判断是否存在该key
            //Boolean result = stringRedisTemplate.opsForValue().setIfAbsent("lockKey", id,30,TimeUnit.SECONDS);
            //设置key 30s
            //stringRedisTemplate.expire("lockKey",30,TimeUnit.SECONDS);
            //if (!result) { //已存在，直接结束
            //    return;
            //}
            //获取库存数

            //加锁
            lock.lock();

            int stock = Integer.parseInt(stringRedisTemplate.opsForValue().get("stock"));
            if (stock > 0) {
                stock = stock - 1;
                //减一再保存到redis
                stringRedisTemplate.opsForValue().set("stock", stock + "");
                System.out.println("扣减成功，剩余 ：" + stock);
            } else {
                System.out.println("扣减失败");
            }
        } finally {
            lock.unlock();//释放锁
            //if (id.equals(stringRedisTemplate.opsForValue().get("lockKey")))
            // stringRedisTemplate.delete("lockKey");//删除该key
        }
    }
}
