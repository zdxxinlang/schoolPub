package com.yunuo.po;

import java.util.Date;

public class MomentsT {
    private Long id;

    private String content;

    private String pic;

    private Date createTime;

    private Long goods;

    private Long forward;

    private Long favourite;

    private Integer type1;

    private Integer type2;

    private Integer level;

    private Long authorid;

    private Long schoolid;

    private Long countrylocid;

    private Long provincelocid;

    private Long urbanlocid;

    private Long citylocid;

    private Long classid;

    private Long specialtyid;

    private Long academyid;

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

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Long authorid) {
        this.authorid = authorid;
    }

    public Long getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Long schoolid) {
        this.schoolid = schoolid;
    }

    public Long getCountrylocid() {
        return countrylocid;
    }

    public void setCountrylocid(Long countrylocid) {
        this.countrylocid = countrylocid;
    }

    public Long getProvincelocid() {
        return provincelocid;
    }

    public void setProvincelocid(Long provincelocid) {
        this.provincelocid = provincelocid;
    }

    public Long getUrbanlocid() {
        return urbanlocid;
    }

    public void setUrbanlocid(Long urbanlocid) {
        this.urbanlocid = urbanlocid;
    }

    public Long getCitylocid() {
        return citylocid;
    }

    public void setCitylocid(Long citylocid) {
        this.citylocid = citylocid;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public Long getSpecialtyid() {
        return specialtyid;
    }

    public void setSpecialtyid(Long specialtyid) {
        this.specialtyid = specialtyid;
    }

    public Long getAcademyid() {
        return academyid;
    }

    public void setAcademyid(Long academyid) {
        this.academyid = academyid;
    }
}