package com.lm.datainput.domain;

import java.util.Date;
import javax.persistence.*;

public class Ansrecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 题目id
     */
    private Integer examid;

    /**
     * 选择的答案
     */
    private String selectans;

    /**
     * 标识0-错误；1-正确
     */
    private Integer sign;

    /**
     * 答题时间
     */
    private Date anstime;

    /**
     * 答题人
     */
    private String anser;

    /**
     * 本次答题guid
     */
    private String ansid;

    /**
     * 本次答题笔记
     */
    private String remark;

    /**
     * 标识：0-章节顺序做题；1-随机出题
     */
    private Integer flag;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取题目id
     *
     * @return examid - 题目id
     */
    public Integer getExamid() {
        return examid;
    }

    /**
     * 设置题目id
     *
     * @param examid 题目id
     */
    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    /**
     * 获取选择的答案
     *
     * @return selectans - 选择的答案
     */
    public String getSelectans() {
        return selectans;
    }

    /**
     * 设置选择的答案
     *
     * @param selectans 选择的答案
     */
    public void setSelectans(String selectans) {
        this.selectans = selectans == null ? null : selectans.trim();
    }

    /**
     * 获取标识0-错误；1-正确
     *
     * @return sign - 标识0-错误；1-正确
     */
    public Integer getSign() {
        return sign;
    }

    /**
     * 设置标识0-错误；1-正确
     *
     * @param sign 标识0-错误；1-正确
     */
    public void setSign(Integer sign) {
        this.sign = sign;
    }

    /**
     * 获取答题时间
     *
     * @return anstime - 答题时间
     */
    public Date getAnstime() {
        return anstime;
    }

    /**
     * 设置答题时间
     *
     * @param anstime 答题时间
     */
    public void setAnstime(Date anstime) {
        this.anstime = anstime;
    }

    /**
     * 获取答题人
     *
     * @return anser - 答题人
     */
    public String getAnser() {
        return anser;
    }

    /**
     * 设置答题人
     *
     * @param anser 答题人
     */
    public void setAnser(String anser) {
        this.anser = anser == null ? null : anser.trim();
    }

    /**
     * 获取本次答题guid
     *
     * @return ansid - 本次答题guid
     */
    public String getAnsid() {
        return ansid;
    }

    /**
     * 设置本次答题guid
     *
     * @param ansid 本次答题guid
     */
    public void setAnsid(String ansid) {
        this.ansid = ansid == null ? null : ansid.trim();
    }

    /**
     * 获取本次答题笔记
     *
     * @return remark - 本次答题笔记
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置本次答题笔记
     *
     * @param remark 本次答题笔记
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取标识：0-章节顺序做题；1-随机出题
     *
     * @return flag - 标识：0-章节顺序做题；1-随机出题
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置标识：0-章节顺序做题；1-随机出题
     *
     * @param flag 标识：0-章节顺序做题；1-随机出题
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}