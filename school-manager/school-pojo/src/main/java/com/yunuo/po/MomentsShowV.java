package com.yunuo.po;

import java.util.Date;

public class MomentsShowV {
    private String typename2;

    private String uname;

    private Long id;

    private String content;

    private String pic;

    private Date createTime;

    private Long goods;

    private Long forward;

    private Long favourite;

    private Integer level;

    private String urbanname;

    private String schoolname;

    public String getTypename2() {
        return typename2;
    }

    public void setTypename2(String typename2) {
        this.typename2 = typename2 == null ? null : typename2.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getGoods() {
        return goods;
    }

    public void setGoods(Long goods) {
        this.goods = goods;
    }

    public Long getForward() {
        return forward;
    }

    public void setForward(Long forward) {
        this.forward = forward;
    }

    public Long getFavourite() {
        return favourite;
    }

    public void setFavourite(Long favourite) {
        this.favourite = favourite;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUrbanname() {
        return urbanname;
    }

    public void setUrbanname(String urbanname) {
        this.urbanname = urbanname == null ? null : urbanname.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }
}