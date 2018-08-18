package com.lesson.model;

import java.util.List;

/**
 * Created by wangrui on 2018/8/10.
 */
public class ScriptResult {

    /**
     * scriptId : 18076
     * reportDetails : [{"subsubtaskid":"05183f63a9a64ea7af5b62bc0807747c"}]
     * scriptNo : 104494
     * orderNum : 1
     * scriptSign : 104494_1
     * scripts : [{"sequence":1,"scriptId":18076,"fileSize":783,"scriptUpdateDesc":"","scriptNo":104494,"scriptName":"d50b87f6-6276-4b85-a015-29624ea49ea0.zip","tagsDescr":"公共模块","scriptCreateDesc":"各脚本集之间卸载安装（运行勾选卸载安装，起到清除数据的作用）","fileUrl":"http://fileupload.pro.testin.cn/group1/M00/13/77/CipiUlsRB0SAJgdlAAADDwiF5eU474.zip?filename=d50b87f6-6276-4b85-a015-29624ea49ea0.zip","scriptTag":"104494","fileMd5":"ed2ece3596a3828de7e9b199cedd5440","testResult":1}]
     * steps : [{"stepdesc":"6 秒","steptype":"sleep","checkRule":"none","disable":0,"stepname":"等待 : 6 秒","stepid":0,"scriptSequence":1,"stepimage":"","checkPointName":"","describe":"","testResult":1}]
     * taskid : ttc5223b41cf7511cab8e163ce0de9ad
     * categorySummarys : [{"total":1,"resultcategory":1}]
     */

    private int scriptId;
    private int scriptNo;
    private int orderNum;
    private String scriptSign;
    private String taskid;
    private List<ReportDetailsBean> reportDetails;
    private List<ScriptsBean> scripts;
    private List<StepsBean> steps;
    private List<CategorySummarysBean> categorySummarys;

    public int getScriptId() {
        return scriptId;
    }

    public void setScriptId(int scriptId) {
        this.scriptId = scriptId;
    }

    public int getScriptNo() {
        return scriptNo;
    }

    public void setScriptNo(int scriptNo) {
        this.scriptNo = scriptNo;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getScriptSign() {
        return scriptSign;
    }

    public void setScriptSign(String scriptSign) {
        this.scriptSign = scriptSign;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public List<ReportDetailsBean> getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(List<ReportDetailsBean> reportDetails) {
        this.reportDetails = reportDetails;
    }

    public List<ScriptsBean> getScripts() {
        return scripts;
    }

    public void setScripts(List<ScriptsBean> scripts) {
        this.scripts = scripts;
    }

    public List<StepsBean> getSteps() {
        return steps;
    }

    public void setSteps(List<StepsBean> steps) {
        this.steps = steps;
    }

    public List<CategorySummarysBean> getCategorySummarys() {
        return categorySummarys;
    }

    public void setCategorySummarys(List<CategorySummarysBean> categorySummarys) {
        this.categorySummarys = categorySummarys;
    }

    public static class ReportDetailsBean {
        /**
         * subsubtaskid : 05183f63a9a64ea7af5b62bc0807747c
         */

        private String subsubtaskid;

        public String getSubsubtaskid() {
            return subsubtaskid;
        }

        public void setSubsubtaskid(String subsubtaskid) {
            this.subsubtaskid = subsubtaskid;
        }
    }

    public static class ScriptsBean {
        /**
         * sequence : 1
         * scriptId : 18076
         * fileSize : 783
         * scriptUpdateDesc :
         * scriptNo : 104494
         * scriptName : d50b87f6-6276-4b85-a015-29624ea49ea0.zip
         * tagsDescr : 公共模块
         * scriptCreateDesc : 各脚本集之间卸载安装（运行勾选卸载安装，起到清除数据的作用）
         * fileUrl : http://fileupload.pro.testin.cn/group1/M00/13/77/CipiUlsRB0SAJgdlAAADDwiF5eU474.zip?filename=d50b87f6-6276-4b85-a015-29624ea49ea0.zip
         * scriptTag : 104494
         * fileMd5 : ed2ece3596a3828de7e9b199cedd5440
         * testResult : 1
         */

        private int sequence;
        private int scriptId;
        private int fileSize;
        private String scriptUpdateDesc;
        private int scriptNo;
        private String scriptName;
        private String tagsDescr;
        private String scriptCreateDesc;
        private String fileUrl;
        private String scriptTag;
        private String fileMd5;
        private int testResult;

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public int getScriptId() {
            return scriptId;
        }

        public void setScriptId(int scriptId) {
            this.scriptId = scriptId;
        }

        public int getFileSize() {
            return fileSize;
        }

        public void setFileSize(int fileSize) {
            this.fileSize = fileSize;
        }

        public String getScriptUpdateDesc() {
            return scriptUpdateDesc;
        }

        public void setScriptUpdateDesc(String scriptUpdateDesc) {
            this.scriptUpdateDesc = scriptUpdateDesc;
        }

        public int getScriptNo() {
            return scriptNo;
        }

        public void setScriptNo(int scriptNo) {
            this.scriptNo = scriptNo;
        }

        public String getScriptName() {
            return scriptName;
        }

        public void setScriptName(String scriptName) {
            this.scriptName = scriptName;
        }

        public String getTagsDescr() {
            return tagsDescr;
        }

        public void setTagsDescr(String tagsDescr) {
            this.tagsDescr = tagsDescr;
        }

        public String getScriptCreateDesc() {
            return scriptCreateDesc;
        }

        public void setScriptCreateDesc(String scriptCreateDesc) {
            this.scriptCreateDesc = scriptCreateDesc;
        }

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }

        public String getScriptTag() {
            return scriptTag;
        }

        public void setScriptTag(String scriptTag) {
            this.scriptTag = scriptTag;
        }

        public String getFileMd5() {
            return fileMd5;
        }

        public void setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
        }

        public int getTestResult() {
            return testResult;
        }

        public void setTestResult(int testResult) {
            this.testResult = testResult;
        }
    }

    public static class StepsBean {
        /**
         * stepdesc : 6 秒
         * steptype : sleep
         * checkRule : none
         * disable : 0
         * stepname : 等待 : 6 秒
         * stepid : 0
         * scriptSequence : 1
         * stepimage :
         * checkPointName :
         * describe :
         * testResult : 1
         */

        private String stepdesc;
        private String steptype;
        private String checkRule;
        private int disable;
        private String stepname;
        private int stepid;
        private int scriptSequence;
        private String stepimage;
        private String checkPointName;
        private String describe;
        private int testResult;

        public String getStepdesc() {
            return stepdesc;
        }

        public void setStepdesc(String stepdesc) {
            this.stepdesc = stepdesc;
        }

        public String getSteptype() {
            return steptype;
        }

        public void setSteptype(String steptype) {
            this.steptype = steptype;
        }

        public String getCheckRule() {
            return checkRule;
        }

        public void setCheckRule(String checkRule) {
            this.checkRule = checkRule;
        }

        public int getDisable() {
            return disable;
        }

        public void setDisable(int disable) {
            this.disable = disable;
        }

        public String getStepname() {
            return stepname;
        }

        public void setStepname(String stepname) {
            this.stepname = stepname;
        }

        public int getStepid() {
            return stepid;
        }

        public void setStepid(int stepid) {
            this.stepid = stepid;
        }

        public int getScriptSequence() {
            return scriptSequence;
        }

        public void setScriptSequence(int scriptSequence) {
            this.scriptSequence = scriptSequence;
        }

        public String getStepimage() {
            return stepimage;
        }

        public void setStepimage(String stepimage) {
            this.stepimage = stepimage;
        }

        public String getCheckPointName() {
            return checkPointName;
        }

        public void setCheckPointName(String checkPointName) {
            this.checkPointName = checkPointName;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public int getTestResult() {
            return testResult;
        }

        public void setTestResult(int testResult) {
            this.testResult = testResult;
        }
    }

    public static class CategorySummarysBean {
        /**
         * total : 1
         * resultcategory : 1
         */

        private int total;
        private int resultcategory;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getResultcategory() {
            return resultcategory;
        }

        public void setResultcategory(int resultcategory) {
            this.resultcategory = resultcategory;
        }
    }
}

