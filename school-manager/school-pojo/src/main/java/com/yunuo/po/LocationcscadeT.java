package com.yunuo.po;

public class LocationcscadeT {
    private Long id;

    private String pid;

    private String name;

    private String moreloc;

    private Integer type;

    private Integer state;

    private String placeid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMoreloc() {
        return moreloc;
    }

    public void setMoreloc(String moreloc) {
        this.moreloc = moreloc == null ? null : moreloc.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPlaceid() {
        return placeid;
    }

    public void setPlaceid(String placeid) {
        this.placeid = placeid == null ? null : placeid.trim();
    }

	@Override
	public String toString() {
		return "LocationcscadeT [id=" + id + ", pid=" + pid + ", name=" + name
				+ ", moreloc=" + moreloc + ", type=" + type + ", state="
				+ state + ", placeid=" + placeid + "]";
	}
    
    
}