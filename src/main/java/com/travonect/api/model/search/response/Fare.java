package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Fare {

    @SerializedName("Currency")
    private String currency;
    @SerializedName("BaseFare")
    private float baseFare;
    @SerializedName("Tax")
    private float tax;
    @SerializedName("TaxBreakup")
    private List<Object> taxBreakup;
    @SerializedName("YQTax")
    private float yQTax;
    @SerializedName("AdditionalTxnFeeOfrd")
    private float additionalTxnFeeOfrd;
    @SerializedName("AdditionalTxnFeePub")
    private float additionalTxnFeePub;
    @SerializedName("PGCharge")
    private float pGCharge;
    @SerializedName("OtherCharges")
    private float otherCharges;
    @SerializedName("ChargeBU")
    private List<Object> chargeBU;
    @SerializedName("Discount")
    private float discount;
    @SerializedName("PublishedFare")
    private float publishedFare;
    @SerializedName("CommissionEarned")
    private float commissionEarned;
    @SerializedName("PLBEarned")
    private float pLBEarned;
    @SerializedName("IncentiveEarned")
    private float incentiveEarned;
    @SerializedName("OfferedFare")
    private float offeredFare;
    @SerializedName("TdsOnCommission")
    private float tdsOnCommission;
    @SerializedName("TdsOnPLB")
    private float tdsOnPLB;
    @SerializedName("TdsOnIncentive")
    private float tdsOnIncentive;
    @SerializedName("ServiceFee")
    private float serviceFee;
    @SerializedName("TotalBaggageCharges")
    private float totalBaggageCharges;
    @SerializedName("TotalMealCharges")
    private float totalMealCharges;
    @SerializedName("TotalSeatCharges")
    private float totalSeatCharges;
    @SerializedName("TotalSpecialServiceCharges")
    private float totalSpecialServiceCharges;

    public String getCurrency() {
        return currency;
    }

    public float getBaseFare() {
        return baseFare;
    }

    public float getTax() {
        return tax;
    }

    public float getYQTax() {
        return yQTax;
    }

    public float getAdditionalTxnFeeOfrd() {
        return additionalTxnFeeOfrd;
    }

    public float getAdditionalTxnFeePub() {
        return additionalTxnFeePub;
    }

    public float getPGCharge() {
        return pGCharge;
    }

    public float getOtherCharges() {
        return otherCharges;
    }

    public float getDiscount() {
        return discount;
    }

    public float getPublishedFare() {
        return publishedFare;
    }

    public float getCommissionEarned() {
        return commissionEarned;
    }

    public float getPLBEarned() {
        return pLBEarned;
    }

    public float getIncentiveEarned() {
        return incentiveEarned;
    }

    public float getOfferedFare() {
        return offeredFare;
    }

    public float getTdsOnCommission() {
        return tdsOnCommission;
    }

    public float getTdsOnPLB() {
        return tdsOnPLB;
    }

    public float getTdsOnIncentive() {
        return tdsOnIncentive;
    }

    public float getServiceFee() {
        return serviceFee;
    }

    public float getTotalBaggageCharges() {
        return totalBaggageCharges;
    }

    public float getTotalMealCharges() {
        return totalMealCharges;
    }

    public float getTotalSeatCharges() {
        return totalSeatCharges;
    }

    public float getTotalSpecialServiceCharges() {
        return totalSpecialServiceCharges;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBaseFare(float baseFare) {
        this.baseFare = baseFare;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public void setYQTax(float yQTax) {
        this.yQTax = yQTax;
    }

    public void setAdditionalTxnFeeOfrd(float additionalTxnFeeOfrd) {
        this.additionalTxnFeeOfrd = additionalTxnFeeOfrd;
    }

    public void setAdditionalTxnFeePub(float additionalTxnFeePub) {
        this.additionalTxnFeePub = additionalTxnFeePub;
    }

    public void setPGCharge(float pGCharge) {
        this.pGCharge = pGCharge;
    }

    public void setOtherCharges(float otherCharges) {
        this.otherCharges = otherCharges;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setPublishedFare(float publishedFare) {
        this.publishedFare = publishedFare;
    }

    public void setCommissionEarned(float commissionEarned) {
        this.commissionEarned = commissionEarned;
    }

    public void setPLBEarned(float pLBEarned) {
        this.pLBEarned = pLBEarned;
    }

    public void setIncentiveEarned(float incentiveEarned) {
        this.incentiveEarned = incentiveEarned;
    }

    public void setOfferedFare(float offeredFare) {
        this.offeredFare = offeredFare;
    }

    public void setTdsOnCommission(float tdsOnCommission) {
        this.tdsOnCommission = tdsOnCommission;
    }

    public void setTdsOnPLB(float tdsOnPLB) {
        this.tdsOnPLB = tdsOnPLB;
    }

    public void setTdsOnIncentive(float tdsOnIncentive) {
        this.tdsOnIncentive = tdsOnIncentive;
    }

    public void setServiceFee(float serviceFee) {
        this.serviceFee = serviceFee;
    }

    public void setTotalBaggageCharges(float totalBaggageCharges) {
        this.totalBaggageCharges = totalBaggageCharges;
    }

    public void setTotalMealCharges(float totalMealCharges) {
        this.totalMealCharges = totalMealCharges;
    }

    public void setTotalSeatCharges(float totalSeatCharges) {
        this.totalSeatCharges = totalSeatCharges;
    }

    public void setTotalSpecialServiceCharges(float totalSpecialServiceCharges) {
        this.totalSpecialServiceCharges = totalSpecialServiceCharges;
    }

    public List<Object> getTaxBreakup() {
        return taxBreakup;
    }

    public void setTaxBreakup(List<Object> taxBreakup) {
        this.taxBreakup = taxBreakup;
    }

    public List<Object> getChargeBU() {
        return chargeBU;
    }

    public void setChargeBU(List<Object> chargeBU) {
        this.chargeBU = chargeBU;
    }
}
