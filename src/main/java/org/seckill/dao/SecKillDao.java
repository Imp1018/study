package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SecKill;

import java.util.Date;
import java.util.List;

public interface  SecKillDao {
    // 减库存
    // 如果影响行数>1 表示更新的记录行数
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    //根据id查询秒杀对象
    SecKill queryById(long seckillId);

    // 根据偏移量查询秒杀商品列表
    List<SecKill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
