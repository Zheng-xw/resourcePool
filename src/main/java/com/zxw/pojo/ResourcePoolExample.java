package com.zxw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourcePoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourcePoolExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCpuLimitIsNull() {
            addCriterion("cpu_limit is null");
            return (Criteria) this;
        }

        public Criteria andCpuLimitIsNotNull() {
            addCriterion("cpu_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCpuLimitEqualTo(Integer value) {
            addCriterion("cpu_limit =", value, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitNotEqualTo(Integer value) {
            addCriterion("cpu_limit <>", value, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitGreaterThan(Integer value) {
            addCriterion("cpu_limit >", value, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpu_limit >=", value, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitLessThan(Integer value) {
            addCriterion("cpu_limit <", value, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitLessThanOrEqualTo(Integer value) {
            addCriterion("cpu_limit <=", value, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitIn(List<Integer> values) {
            addCriterion("cpu_limit in", values, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitNotIn(List<Integer> values) {
            addCriterion("cpu_limit not in", values, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitBetween(Integer value1, Integer value2) {
            addCriterion("cpu_limit between", value1, value2, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("cpu_limit not between", value1, value2, "cpuLimit");
            return (Criteria) this;
        }

        public Criteria andCpuUsedIsNull() {
            addCriterion("cpu_used is null");
            return (Criteria) this;
        }

        public Criteria andCpuUsedIsNotNull() {
            addCriterion("cpu_used is not null");
            return (Criteria) this;
        }

        public Criteria andCpuUsedEqualTo(Integer value) {
            addCriterion("cpu_used =", value, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedNotEqualTo(Integer value) {
            addCriterion("cpu_used <>", value, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedGreaterThan(Integer value) {
            addCriterion("cpu_used >", value, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpu_used >=", value, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedLessThan(Integer value) {
            addCriterion("cpu_used <", value, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedLessThanOrEqualTo(Integer value) {
            addCriterion("cpu_used <=", value, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedIn(List<Integer> values) {
            addCriterion("cpu_used in", values, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedNotIn(List<Integer> values) {
            addCriterion("cpu_used not in", values, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedBetween(Integer value1, Integer value2) {
            addCriterion("cpu_used between", value1, value2, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andCpuUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("cpu_used not between", value1, value2, "cpuUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitIsNull() {
            addCriterion("memory_limit is null");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitIsNotNull() {
            addCriterion("memory_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitEqualTo(Integer value) {
            addCriterion("memory_limit =", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitNotEqualTo(Integer value) {
            addCriterion("memory_limit <>", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitGreaterThan(Integer value) {
            addCriterion("memory_limit >", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory_limit >=", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitLessThan(Integer value) {
            addCriterion("memory_limit <", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitLessThanOrEqualTo(Integer value) {
            addCriterion("memory_limit <=", value, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitIn(List<Integer> values) {
            addCriterion("memory_limit in", values, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitNotIn(List<Integer> values) {
            addCriterion("memory_limit not in", values, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitBetween(Integer value1, Integer value2) {
            addCriterion("memory_limit between", value1, value2, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("memory_limit not between", value1, value2, "memoryLimit");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNull() {
            addCriterion("memory_used is null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNotNull() {
            addCriterion("memory_used is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedEqualTo(Integer value) {
            addCriterion("memory_used =", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotEqualTo(Integer value) {
            addCriterion("memory_used <>", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThan(Integer value) {
            addCriterion("memory_used >", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory_used >=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThan(Integer value) {
            addCriterion("memory_used <", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThanOrEqualTo(Integer value) {
            addCriterion("memory_used <=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIn(List<Integer> values) {
            addCriterion("memory_used in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotIn(List<Integer> values) {
            addCriterion("memory_used not in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedBetween(Integer value1, Integer value2) {
            addCriterion("memory_used between", value1, value2, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("memory_used not between", value1, value2, "memoryUsed");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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