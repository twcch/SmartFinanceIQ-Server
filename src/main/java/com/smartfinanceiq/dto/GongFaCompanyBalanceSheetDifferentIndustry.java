package com.smartfinanceiq.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GongFaCompanyBalanceSheetDifferentIndustry {

    @JsonProperty("出表日期")
    private String issueDate;
    @JsonProperty("年度")
    private String year;
    @JsonProperty("季別")
    private String quarter;
    @JsonProperty("公司代號")
    private String companyCode;
    @JsonProperty("公司名稱")
    private String companyName;
    @JsonProperty("流動資產")
    private String currentAssets;
    @JsonProperty("非流動資產")
    private String nonCurrentAssets;
    @JsonProperty("資產總計")
    private String totalAssets;
    @JsonProperty("流動負債")
    private String currentLiabilities;
    @JsonProperty("非流動負債")
    private String nonCurrentLiabilities;
    @JsonProperty("負債總計")
    private String totalLiabilities;
    @JsonProperty("股本")
    private String capitalStock;
    @JsonProperty("權益－具證券性質之虛擬通貨")
    private String equitySecurityToken;
    @JsonProperty("資本公積")
    private String capitalReserve;
    @JsonProperty("保留盈餘")
    private String retainedEarnings;
    @JsonProperty("其他權益")
    private String otherEquity;
    @JsonProperty("庫藏股票")
    private String treasuryStock;
    @JsonProperty("歸屬於母公司業主之權益合計")
    private String totalEquityAttributableToOwnersOfParent;
    @JsonProperty("共同控制下前手權益")
    private String interestsUnderJointControl;
    @JsonProperty("非控制權益")
    private String nonControllingInterest;
    @JsonProperty("權益總額")
    private String totalEquity;
    @JsonProperty("待註銷股本股數（單位：股）")
    private String sharesToBeCancelled;
    @JsonProperty("預收股款（權益項下）之約當發行股數（單位：股）")
    private String advanceReceivedForSharesEquitySectionEquivalentIssuedShares;
    @JsonProperty("母公司暨子公司所持有之母公司庫藏股股數（單位：股）")
    private String treasurySharesHeldByParentAndSubsidiaries;
    @JsonProperty("每股參考淨值")
    private String referenceNetValuePerShare;

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(String currentAssets) {
        this.currentAssets = currentAssets;
    }

    public String getNonCurrentAssets() {
        return nonCurrentAssets;
    }

    public void setNonCurrentAssets(String nonCurrentAssets) {
        this.nonCurrentAssets = nonCurrentAssets;
    }

    public String getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets;
    }

    public String getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(String currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public String getNonCurrentLiabilities() {
        return nonCurrentLiabilities;
    }

    public void setNonCurrentLiabilities(String nonCurrentLiabilities) {
        this.nonCurrentLiabilities = nonCurrentLiabilities;
    }

    public String getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(String totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public String getCapitalStock() {
        return capitalStock;
    }

    public void setCapitalStock(String capitalStock) {
        this.capitalStock = capitalStock;
    }

    public String getEquitySecurityToken() {
        return equitySecurityToken;
    }

    public void setEquitySecurityToken(String equitySecurityToken) {
        this.equitySecurityToken = equitySecurityToken;
    }

    public String getCapitalReserve() {
        return capitalReserve;
    }

    public void setCapitalReserve(String capitalReserve) {
        this.capitalReserve = capitalReserve;
    }

    public String getRetainedEarnings() {
        return retainedEarnings;
    }

    public void setRetainedEarnings(String retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
    }

    public String getOtherEquity() {
        return otherEquity;
    }

    public void setOtherEquity(String otherEquity) {
        this.otherEquity = otherEquity;
    }

    public String getTreasuryStock() {
        return treasuryStock;
    }

    public void setTreasuryStock(String treasuryStock) {
        this.treasuryStock = treasuryStock;
    }

    public String getTotalEquityAttributableToOwnersOfParent() {
        return totalEquityAttributableToOwnersOfParent;
    }

    public void setTotalEquityAttributableToOwnersOfParent(String totalEquityAttributableToOwnersOfParent) {
        this.totalEquityAttributableToOwnersOfParent = totalEquityAttributableToOwnersOfParent;
    }

    public String getInterestsUnderJointControl() {
        return interestsUnderJointControl;
    }

    public void setInterestsUnderJointControl(String interestsUnderJointControl) {
        this.interestsUnderJointControl = interestsUnderJointControl;
    }

    public String getNonControllingInterest() {
        return nonControllingInterest;
    }

    public void setNonControllingInterest(String nonControllingInterest) {
        this.nonControllingInterest = nonControllingInterest;
    }

    public String getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(String totalEquity) {
        this.totalEquity = totalEquity;
    }

    public String getSharesToBeCancelled() {
        return sharesToBeCancelled;
    }

    public void setSharesToBeCancelled(String sharesToBeCancelled) {
        this.sharesToBeCancelled = sharesToBeCancelled;
    }

    public String getAdvanceReceivedForSharesEquitySectionEquivalentIssuedShares() {
        return advanceReceivedForSharesEquitySectionEquivalentIssuedShares;
    }

    public void setAdvanceReceivedForSharesEquitySectionEquivalentIssuedShares(String advanceReceivedForSharesEquitySectionEquivalentIssuedShares) {
        this.advanceReceivedForSharesEquitySectionEquivalentIssuedShares = advanceReceivedForSharesEquitySectionEquivalentIssuedShares;
    }

    public String getTreasurySharesHeldByParentAndSubsidiaries() {
        return treasurySharesHeldByParentAndSubsidiaries;
    }

    public void setTreasurySharesHeldByParentAndSubsidiaries(String treasurySharesHeldByParentAndSubsidiaries) {
        this.treasurySharesHeldByParentAndSubsidiaries = treasurySharesHeldByParentAndSubsidiaries;
    }

    public String getReferenceNetValuePerShare() {
        return referenceNetValuePerShare;
    }

    public void setReferenceNetValuePerShare(String referenceNetValuePerShare) {
        this.referenceNetValuePerShare = referenceNetValuePerShare;
    }

}
