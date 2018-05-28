package com.fly.caipiao.comment.configuration.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author baidu
 * @date 2018/5/21 下午10:12
 * @description redis
 **/

@Configuration
public class RedisConfiguration {
    private static Logger logger = LoggerFactory.getLogger(RedisConfiguration.class);

    @Autowired
    private RedisProperties redisProperties;

    @Bean("connectionFactory")
    public JedisConnectionFactory connectionFactory(){
        RedisClusterConfiguration clusterConfig = new RedisClusterConfiguration(
                redisProperties.getCluster().getNodes());
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        return new JedisConnectionFactory(clusterConfig,poolConfig);
    }


    @Bean("cacheStringRedisTemplate")
    public StringRedisTemplate redisStringTemplate(@Qualifier("connectionFactory") RedisConnectionFactory connectionFactory) {
//    public StringRedisTemplate redisTemplate() {
//        RedisConnectionFactory redisConnectionFactory=redisConnectionFactory();
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(connectionFactory);
        return template;
    }

    @Bean("cacheRedisTemplate")
    public RedisTemplate redisTemplate(@Qualifier("connectionFactory") RedisConnectionFactory connectionFactory) {
//    public StringRedisTemplate redisTemplate() {
//        RedisConnectionFactory redisConnectionFactory=redisConnectionFactory();
        RedisTemplate template = new RedisTemplate();
        template.setConnectionFactory(connectionFactory);
        return template;
    }
}
