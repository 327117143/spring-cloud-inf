package com.kolema.infcache.service.impl;

import com.kolema.infcache.service.IRedisService;
import redis.clients.jedis.BinaryClient;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisClusterImpl implements IRedisService {

    @Resource
    private JedisCluster jedisCluster;

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public Set<String> getByPre(String pre) {
        return null;
    }

    @Override
    public String set(String key, String value) {
        return jedisCluster.set(key, value);
    }

    @Override
    public String set(String key, String value, int expire) {
        return null;
    }

    @Override
    public Long delPre(String key) {
        return null;
    }

    @Override
    public Long del(String... keys) {
        return null;
    }

    @Override
    public Long append(String key, String str) {
        return null;
    }

    @Override
    public Boolean exists(String key) {
        return null;
    }

    @Override
    public Long setnx(String key, String value) {
        return null;
    }

    @Override
    public String setex(String key, String value, int seconds) {
        return null;
    }

    @Override
    public Long setrange(String key, String str, int offset) {
        return null;
    }

    @Override
    public List<String> mget(String... keys) {
        return null;
    }

    @Override
    public String mset(String... keysvalues) {
        return null;
    }

    @Override
    public Long msetnx(String... keysvalues) {
        return null;
    }

    @Override
    public String getset(String key, String value) {
        return null;
    }

    @Override
    public String getrange(String key, int startOffset, int endOffset) {
        return null;
    }

    @Override
    public Long incr(String key) {
        return null;
    }

    @Override
    public Long incrBy(String key, Long integer) {
        return null;
    }

    @Override
    public Long decr(String key) {
        return null;
    }

    @Override
    public Long decrBy(String key, Long integer) {
        return null;
    }

    @Override
    public Long serlen(String key) {
        return null;
    }

    @Override
    public Long hset(String key, String field, String value) {
        return null;
    }

    @Override
    public Long hsetnx(String key, String field, String value) {
        return null;
    }

    @Override
    public String hmset(String key, Map<String, String> hash) {
        return null;
    }

    @Override
    public String hget(String key, String field) {
        return null;
    }

    @Override
    public List<String> hmget(String key, String... fields) {
        return null;
    }

    @Override
    public Long hincrby(String key, String field, Long value) {
        return null;
    }

    @Override
    public Boolean hexists(String key, String field) {
        return null;
    }

    @Override
    public Long hlen(String key) {
        return null;
    }

    @Override
    public Long hdel(String key, String... fields) {
        return null;
    }

    @Override
    public Set<String> hkeys(String key) {
        return null;
    }

    @Override
    public List<String> hvals(String key) {
        return null;
    }

    @Override
    public Map<String, String> hgetall(String key) {
        return null;
    }

    @Override
    public Long lpush(String key, String... strs) {
        return null;
    }

    @Override
    public Long rpush(String key, String... strs) {
        return null;
    }

    @Override
    public Long linsert(String key, BinaryClient.LIST_POSITION where, String pivot, String value) {
        return null;
    }

    @Override
    public String lset(String key, Long index, String value) {
        return null;
    }

    @Override
    public Long lrem(String key, long count, String value) {
        return null;
    }

    @Override
    public String ltrim(String key, long start, long end) {
        return null;
    }

    @Override
    public String lpop(String key) {
        return null;
    }

    @Override
    public String rpop(String key) {
        return null;
    }

    @Override
    public String rpoplpush(String srckey, String dstkey) {
        return null;
    }

    @Override
    public String lindex(String key, long index) {
        return null;
    }

    @Override
    public Long llen(String key) {
        return null;
    }

    @Override
    public List<String> lrange(String key, long start, long end) {
        return null;
    }

    @Override
    public Long sadd(String key, String... members) {
        return null;
    }

    @Override
    public Long srem(String key, String... members) {
        return null;
    }

    @Override
    public String spop(String key) {
        return null;
    }

    @Override
    public Set<String> sdiff(String... keys) {
        return null;
    }

    @Override
    public Long sdiffstore(String dstkey, String... keys) {
        return null;
    }

    @Override
    public Set<String> sinter(String... keys) {
        return null;
    }

    @Override
    public Long sinterstore(String dstkey, String... keys) {
        return null;
    }

    @Override
    public Set<String> sunion(String... keys) {
        return null;
    }

    @Override
    public Long sunionstore(String dstkey, String... keys) {
        return null;
    }

    @Override
    public Long smove(String srckey, String dstkey, String member) {
        return null;
    }

    @Override
    public Long scard(String key) {
        return null;
    }

    @Override
    public Boolean sismember(String key, String member) {
        return null;
    }

    @Override
    public String srandmember(String key) {
        return null;
    }

    @Override
    public Set<String> smembers(String key) {
        return null;
    }

    @Override
    public Long zadd(String key, double score, String member) {
        return null;
    }

    @Override
    public Long zrem(String key, String... members) {
        return null;
    }

    @Override
    public Double zincrby(String key, double score, String member) {
        return null;
    }

    @Override
    public Long zrank(String key, String member) {
        return null;
    }

    @Override
    public Long zrevrank(String key, String member) {
        return null;
    }

    @Override
    public Set<String> zrevrange(String key, long start, long end) {
        return null;
    }

    @Override
    public Set<String> zrangebyscore(String key, String max, String min) {
        return null;
    }

    @Override
    public Set<String> zrangeByScore(String key, double max, double min) {
        return null;
    }

    @Override
    public Long zcount(String key, String min, String max) {
        return null;
    }

    @Override
    public Long zcard(String key) {
        return null;
    }

    @Override
    public Double zscore(String key, String member) {
        return null;
    }

    @Override
    public Long zremrangeByRank(String key, long start, long end) {
        return null;
    }

    @Override
    public Long zremrangeByScore(String key, double start, double end) {
        return null;
    }

    @Override
    public Set<String> keys(String pattern) {
        return null;
    }

    @Override
    public String type(String key) {
        return null;
    }

    @Override
    public Date getExpireDate(String key) {
        return null;
    }
}
