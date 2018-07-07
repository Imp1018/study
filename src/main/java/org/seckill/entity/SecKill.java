package org.seckill.entity;

import java.util.Date;

public class SecKill {
    private long seckillId;
    private String name;
    private int number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

    @Override
    public String toString() {
        return "SecKill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public SecKill setSeckillId(long seckillId) {
        this.seckillId = seckillId;
        return this;
    }

    public String getName() {
        return name;
    }

    public SecKill setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public SecKill setNumber(int number) {
        this.number = number;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public SecKill setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public SecKill setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SecKill setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
