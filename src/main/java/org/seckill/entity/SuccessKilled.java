package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    private long seckillId;
    private long userPhone;
    private short state;
    private Date createTime;

    private SecKill secKill;

    public SecKill getSecKill() {
        return secKill;
    }

    public SuccessKilled setSecKill(SecKill secKill) {
        this.secKill = secKill;
        return this;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public SuccessKilled setSeckillId(long seckillId) {
        this.seckillId = seckillId;
        return this;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public SuccessKilled setUserPhone(long userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    public short getState() {
        return state;
    }

    public SuccessKilled setState(short state) {
        this.state = state;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SuccessKilled setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
