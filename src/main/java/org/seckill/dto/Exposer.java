package org.seckill.dto;

// 暴露秒杀地址DTO
public class Exposer {

    // 是否开启秒杀
    private boolean exposed;

    //加密暴露地址
    private String md5;

    // 秒杀ID
    private long seckillId;

    //系统当前时间
    private long now;

    // 开启时间
    private long start;


    private long end;

    public Exposer(boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed,long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.seckillId=seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }


    public Exposer(boolean exposed, long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    public boolean isExposed() {
        return exposed;
    }

    public Exposer setExposed(boolean exposed) {
        this.exposed = exposed;
        return this;
    }

    public String getMd5() {
        return md5;
    }

    public Exposer setMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public Exposer setSeckillId(long seckillId) {
        this.seckillId = seckillId;
        return this;
    }

    public long getNow() {
        return now;
    }

    public Exposer setNow(long now) {
        this.now = now;
        return this;
    }

    public long getStart() {
        return start;
    }

    public Exposer setStart(long start) {
        this.start = start;
        return this;
    }

    public long getEnd() {
        return end;
    }

    public Exposer setEnd(long end) {
        this.end = end;
        return this;
    }
}
