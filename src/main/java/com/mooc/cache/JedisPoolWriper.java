package com.mooc.cache;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolWriper {
    /*redis连接池对象*/
    private JedisPool jedisPool;

    public JedisPoolWriper(final JedisPoolConfig poolConfig, final String host,
                           final int port) {
        try {
            jedisPool = new JedisPool(poolConfig, host, port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*获取redis连接池对象*/
    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }
}
