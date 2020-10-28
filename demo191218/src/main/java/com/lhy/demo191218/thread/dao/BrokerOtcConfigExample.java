package com.lhy.demo191218.thread.dao;

import com.lhy.demo191218.common.AbstractExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author liuhaoyang
*/
public class BrokerOtcConfigExample extends AbstractExample {
    /**
     * broker_otc_config
     */
    protected String orderByClause;

    /**
     * broker_otc_config
     */
    protected boolean distinct;

    /**
     * broker_otc_config
     */
    protected List<Criteria> oredCriteria;

    public BrokerOtcConfigExample() {
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
        Criteria criteria = new Criteria(this);
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIsNull() {
            addCriterion("level_code is null");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIsNotNull() {
            addCriterion("level_code is not null");
            return (Criteria) this;
        }

        public Criteria andLevelCodeEqualTo(Integer value) {
            addCriterion("level_code =", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotEqualTo(Integer value) {
            addCriterion("level_code <>", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeGreaterThan(Integer value) {
            addCriterion("level_code >", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_code >=", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLessThan(Integer value) {
            addCriterion("level_code <", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLessThanOrEqualTo(Integer value) {
            addCriterion("level_code <=", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIn(List<Integer> values) {
            addCriterion("level_code in", values, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotIn(List<Integer> values) {
            addCriterion("level_code not in", values, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeBetween(Integer value1, Integer value2) {
            addCriterion("level_code between", value1, value2, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("level_code not between", value1, value2, "levelCode");
            return (Criteria) this;
        }

        public Criteria andSymbolIdIsNull() {
            addCriterion("symbol_id is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIdIsNotNull() {
            addCriterion("symbol_id is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolIdEqualTo(Integer value) {
            addCriterion("symbol_id =", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotEqualTo(Integer value) {
            addCriterion("symbol_id <>", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdGreaterThan(Integer value) {
            addCriterion("symbol_id >", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("symbol_id >=", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdLessThan(Integer value) {
            addCriterion("symbol_id <", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdLessThanOrEqualTo(Integer value) {
            addCriterion("symbol_id <=", value, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdIn(List<Integer> values) {
            addCriterion("symbol_id in", values, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotIn(List<Integer> values) {
            addCriterion("symbol_id not in", values, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdBetween(Integer value1, Integer value2) {
            addCriterion("symbol_id between", value1, value2, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("symbol_id not between", value1, value2, "symbolId");
            return (Criteria) this;
        }

        public Criteria andSymbolNameIsNull() {
            addCriterion("symbol_name is null");
            return (Criteria) this;
        }

        public Criteria andSymbolNameIsNotNull() {
            addCriterion("symbol_name is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolNameEqualTo(String value) {
            addCriterion("symbol_name =", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameNotEqualTo(String value) {
            addCriterion("symbol_name <>", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameGreaterThan(String value) {
            addCriterion("symbol_name >", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameGreaterThanOrEqualTo(String value) {
            addCriterion("symbol_name >=", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameLessThan(String value) {
            addCriterion("symbol_name <", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameLessThanOrEqualTo(String value) {
            addCriterion("symbol_name <=", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameLike(String value) {
            addCriterion("symbol_name like", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameNotLike(String value) {
            addCriterion("symbol_name not like", value, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameIn(List<String> values) {
            addCriterion("symbol_name in", values, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameNotIn(List<String> values) {
            addCriterion("symbol_name not in", values, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameBetween(String value1, String value2) {
            addCriterion("symbol_name between", value1, value2, "symbolName");
            return (Criteria) this;
        }

        public Criteria andSymbolNameNotBetween(String value1, String value2) {
            addCriterion("symbol_name not between", value1, value2, "symbolName");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(Double value) {
            addCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(Double value) {
            addCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(Double value) {
            addCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(Double value) {
            addCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(Double value) {
            addCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<Double> values) {
            addCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<Double> values) {
            addCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(Double value1, Double value2) {
            addCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(Double value1, Double value2) {
            addCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private BrokerOtcConfigExample example;

        protected Criteria(BrokerOtcConfigExample example) {
            super();
            this.example = example;
        }

        public BrokerOtcConfigExample example() {
            return this.example;
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