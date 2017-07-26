package com.yunuo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MomentsTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MomentsTExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(Long value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(Long value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(Long value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(Long value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(Long value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(Long value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<Long> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<Long> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(Long value1, Long value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(Long value1, Long value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andForwardIsNull() {
            addCriterion("forward is null");
            return (Criteria) this;
        }

        public Criteria andForwardIsNotNull() {
            addCriterion("forward is not null");
            return (Criteria) this;
        }

        public Criteria andForwardEqualTo(Long value) {
            addCriterion("forward =", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotEqualTo(Long value) {
            addCriterion("forward <>", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThan(Long value) {
            addCriterion("forward >", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThanOrEqualTo(Long value) {
            addCriterion("forward >=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThan(Long value) {
            addCriterion("forward <", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThanOrEqualTo(Long value) {
            addCriterion("forward <=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardIn(List<Long> values) {
            addCriterion("forward in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotIn(List<Long> values) {
            addCriterion("forward not in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardBetween(Long value1, Long value2) {
            addCriterion("forward between", value1, value2, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotBetween(Long value1, Long value2) {
            addCriterion("forward not between", value1, value2, "forward");
            return (Criteria) this;
        }

        public Criteria andFavouriteIsNull() {
            addCriterion("favourite is null");
            return (Criteria) this;
        }

        public Criteria andFavouriteIsNotNull() {
            addCriterion("favourite is not null");
            return (Criteria) this;
        }

        public Criteria andFavouriteEqualTo(Long value) {
            addCriterion("favourite =", value, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteNotEqualTo(Long value) {
            addCriterion("favourite <>", value, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteGreaterThan(Long value) {
            addCriterion("favourite >", value, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteGreaterThanOrEqualTo(Long value) {
            addCriterion("favourite >=", value, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteLessThan(Long value) {
            addCriterion("favourite <", value, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteLessThanOrEqualTo(Long value) {
            addCriterion("favourite <=", value, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteIn(List<Long> values) {
            addCriterion("favourite in", values, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteNotIn(List<Long> values) {
            addCriterion("favourite not in", values, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteBetween(Long value1, Long value2) {
            addCriterion("favourite between", value1, value2, "favourite");
            return (Criteria) this;
        }

        public Criteria andFavouriteNotBetween(Long value1, Long value2) {
            addCriterion("favourite not between", value1, value2, "favourite");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(Integer value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(Integer value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(Integer value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(Integer value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(Integer value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(Integer value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<Integer> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<Integer> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(Integer value1, Integer value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(Integer value1, Integer value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(Integer value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(Integer value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(Integer value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(Integer value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(Integer value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(Integer value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<Integer> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<Integer> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(Integer value1, Integer value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(Integer value1, Integer value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNull() {
            addCriterion("AuthorID is null");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNotNull() {
            addCriterion("AuthorID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoridEqualTo(Long value) {
            addCriterion("AuthorID =", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotEqualTo(Long value) {
            addCriterion("AuthorID <>", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThan(Long value) {
            addCriterion("AuthorID >", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThanOrEqualTo(Long value) {
            addCriterion("AuthorID >=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThan(Long value) {
            addCriterion("AuthorID <", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThanOrEqualTo(Long value) {
            addCriterion("AuthorID <=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIn(List<Long> values) {
            addCriterion("AuthorID in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotIn(List<Long> values) {
            addCriterion("AuthorID not in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridBetween(Long value1, Long value2) {
            addCriterion("AuthorID between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotBetween(Long value1, Long value2) {
            addCriterion("AuthorID not between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNull() {
            addCriterion("schoolID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNotNull() {
            addCriterion("schoolID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolidEqualTo(Long value) {
            addCriterion("schoolID =", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotEqualTo(Long value) {
            addCriterion("schoolID <>", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThan(Long value) {
            addCriterion("schoolID >", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThanOrEqualTo(Long value) {
            addCriterion("schoolID >=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThan(Long value) {
            addCriterion("schoolID <", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThanOrEqualTo(Long value) {
            addCriterion("schoolID <=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIn(List<Long> values) {
            addCriterion("schoolID in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotIn(List<Long> values) {
            addCriterion("schoolID not in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidBetween(Long value1, Long value2) {
            addCriterion("schoolID between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotBetween(Long value1, Long value2) {
            addCriterion("schoolID not between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidIsNull() {
            addCriterion("countryLocID is null");
            return (Criteria) this;
        }

        public Criteria andCountrylocidIsNotNull() {
            addCriterion("countryLocID is not null");
            return (Criteria) this;
        }

        public Criteria andCountrylocidEqualTo(Long value) {
            addCriterion("countryLocID =", value, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidNotEqualTo(Long value) {
            addCriterion("countryLocID <>", value, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidGreaterThan(Long value) {
            addCriterion("countryLocID >", value, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidGreaterThanOrEqualTo(Long value) {
            addCriterion("countryLocID >=", value, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidLessThan(Long value) {
            addCriterion("countryLocID <", value, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidLessThanOrEqualTo(Long value) {
            addCriterion("countryLocID <=", value, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidIn(List<Long> values) {
            addCriterion("countryLocID in", values, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidNotIn(List<Long> values) {
            addCriterion("countryLocID not in", values, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidBetween(Long value1, Long value2) {
            addCriterion("countryLocID between", value1, value2, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andCountrylocidNotBetween(Long value1, Long value2) {
            addCriterion("countryLocID not between", value1, value2, "countrylocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidIsNull() {
            addCriterion("provinceLocID is null");
            return (Criteria) this;
        }

        public Criteria andProvincelocidIsNotNull() {
            addCriterion("provinceLocID is not null");
            return (Criteria) this;
        }

        public Criteria andProvincelocidEqualTo(Long value) {
            addCriterion("provinceLocID =", value, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidNotEqualTo(Long value) {
            addCriterion("provinceLocID <>", value, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidGreaterThan(Long value) {
            addCriterion("provinceLocID >", value, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidGreaterThanOrEqualTo(Long value) {
            addCriterion("provinceLocID >=", value, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidLessThan(Long value) {
            addCriterion("provinceLocID <", value, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidLessThanOrEqualTo(Long value) {
            addCriterion("provinceLocID <=", value, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidIn(List<Long> values) {
            addCriterion("provinceLocID in", values, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidNotIn(List<Long> values) {
            addCriterion("provinceLocID not in", values, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidBetween(Long value1, Long value2) {
            addCriterion("provinceLocID between", value1, value2, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andProvincelocidNotBetween(Long value1, Long value2) {
            addCriterion("provinceLocID not between", value1, value2, "provincelocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidIsNull() {
            addCriterion("urbanLocID is null");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidIsNotNull() {
            addCriterion("urbanLocID is not null");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidEqualTo(Long value) {
            addCriterion("urbanLocID =", value, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidNotEqualTo(Long value) {
            addCriterion("urbanLocID <>", value, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidGreaterThan(Long value) {
            addCriterion("urbanLocID >", value, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidGreaterThanOrEqualTo(Long value) {
            addCriterion("urbanLocID >=", value, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidLessThan(Long value) {
            addCriterion("urbanLocID <", value, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidLessThanOrEqualTo(Long value) {
            addCriterion("urbanLocID <=", value, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidIn(List<Long> values) {
            addCriterion("urbanLocID in", values, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidNotIn(List<Long> values) {
            addCriterion("urbanLocID not in", values, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidBetween(Long value1, Long value2) {
            addCriterion("urbanLocID between", value1, value2, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andUrbanlocidNotBetween(Long value1, Long value2) {
            addCriterion("urbanLocID not between", value1, value2, "urbanlocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidIsNull() {
            addCriterion("cityLocID is null");
            return (Criteria) this;
        }

        public Criteria andCitylocidIsNotNull() {
            addCriterion("cityLocID is not null");
            return (Criteria) this;
        }

        public Criteria andCitylocidEqualTo(Long value) {
            addCriterion("cityLocID =", value, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidNotEqualTo(Long value) {
            addCriterion("cityLocID <>", value, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidGreaterThan(Long value) {
            addCriterion("cityLocID >", value, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidGreaterThanOrEqualTo(Long value) {
            addCriterion("cityLocID >=", value, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidLessThan(Long value) {
            addCriterion("cityLocID <", value, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidLessThanOrEqualTo(Long value) {
            addCriterion("cityLocID <=", value, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidIn(List<Long> values) {
            addCriterion("cityLocID in", values, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidNotIn(List<Long> values) {
            addCriterion("cityLocID not in", values, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidBetween(Long value1, Long value2) {
            addCriterion("cityLocID between", value1, value2, "citylocid");
            return (Criteria) this;
        }

        public Criteria andCitylocidNotBetween(Long value1, Long value2) {
            addCriterion("cityLocID not between", value1, value2, "citylocid");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Long value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Long value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Long value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Long value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Long value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Long value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Long> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Long> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Long value1, Long value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Long value1, Long value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNull() {
            addCriterion("specialtyID is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIsNotNull() {
            addCriterion("specialtyID is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidEqualTo(Long value) {
            addCriterion("specialtyID =", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotEqualTo(Long value) {
            addCriterion("specialtyID <>", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThan(Long value) {
            addCriterion("specialtyID >", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidGreaterThanOrEqualTo(Long value) {
            addCriterion("specialtyID >=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThan(Long value) {
            addCriterion("specialtyID <", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidLessThanOrEqualTo(Long value) {
            addCriterion("specialtyID <=", value, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidIn(List<Long> values) {
            addCriterion("specialtyID in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotIn(List<Long> values) {
            addCriterion("specialtyID not in", values, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidBetween(Long value1, Long value2) {
            addCriterion("specialtyID between", value1, value2, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andSpecialtyidNotBetween(Long value1, Long value2) {
            addCriterion("specialtyID not between", value1, value2, "specialtyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidIsNull() {
            addCriterion("academyID is null");
            return (Criteria) this;
        }

        public Criteria andAcademyidIsNotNull() {
            addCriterion("academyID is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyidEqualTo(Long value) {
            addCriterion("academyID =", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidNotEqualTo(Long value) {
            addCriterion("academyID <>", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidGreaterThan(Long value) {
            addCriterion("academyID >", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidGreaterThanOrEqualTo(Long value) {
            addCriterion("academyID >=", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidLessThan(Long value) {
            addCriterion("academyID <", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidLessThanOrEqualTo(Long value) {
            addCriterion("academyID <=", value, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidIn(List<Long> values) {
            addCriterion("academyID in", values, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidNotIn(List<Long> values) {
            addCriterion("academyID not in", values, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidBetween(Long value1, Long value2) {
            addCriterion("academyID between", value1, value2, "academyid");
            return (Criteria) this;
        }

        public Criteria andAcademyidNotBetween(Long value1, Long value2) {
            addCriterion("academyID not between", value1, value2, "academyid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}