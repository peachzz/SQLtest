package com.terry.model;

import java.math.BigDecimal;

/**
 * Created by Tao on 2017/9/13.
 */

public class ProductionModel {

    private String Barcode; //浜у搧鏉＄爜
    private String Type; //浜у搧绫诲瀷
    private String Name; //浜у搧鍚嶇О
    private String Brand; //鍝佺墝
    private String Model; //鍨嬪彿
    private String Specs; //鏁伴噺
    private String Quality; //鎴愯壊
    private String Unit; //鍗曚綅
    private String Cost; //鍗曚环
    private String Tax; //绋庣巼
    private String ChannelQuotation; //娓犻亾鍗曚环
    private String TerminalQuotation; //缁堢鍗曚环
    private String Supplier; //渚涘簲鍟�
    private String Remark; //澶囨敞
    private String UpdateRecord; //鏇存柊璁板綍
    private String AddDate; //娣诲姞鏃ユ湡
    private String AddStaff; //娣诲姞浜�
    private String ProductionImage; //浜у搧鍥剧墖
    private BigDecimal Stock; //搴撳瓨鏁伴噺
    private String TopLimit; //搴撳瓨涓婇檺
    private String LowerLimit; //搴撳瓨涓嬮檺
    private String TargetCustomer; //鐩爣瀹㈡埛
    private String Parameter; //浜у搧鍙傛暟
    private String TechnicsImage; //宸ヨ壓鍥剧墖
    private String StorageLocation; //搴撲綅
    private String Number; //浜у搧缂栧彿

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getSpecs() {
        return Specs;
    }

    public void setSpecs(String specs) {
        Specs = specs;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public String getTax() {
        return Tax;
    }

    public void setTax(String tax) {
        Tax = tax;
    }

    public String getChannelQuotation() {
        return ChannelQuotation;
    }

    public void setChannelQuotation(String channelQuotation) {
        ChannelQuotation = channelQuotation;
    }

    public String getTerminalQuotation() {
        return TerminalQuotation;
    }

    public void setTerminalQuotation(String terminalQuotation) {
        TerminalQuotation = terminalQuotation;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getUpdateRecord() {
        return UpdateRecord;
    }

    public void setUpdateRecord(String updateRecord) {
        UpdateRecord = updateRecord;
    }

    public String getAddDate() {
        return AddDate;
    }

    public void setAddDate(String addDate) {
        AddDate = addDate;
    }

    public String getAddStaff() {
        return AddStaff;
    }

    public void setAddStaff(String addStaff) {
        AddStaff = addStaff;
    }

    public String getProductionImage() {
        return ProductionImage;
    }

    public void setProductionImage(String productionImage) {
        ProductionImage = productionImage;
    }

    public BigDecimal getStock() {
        return Stock;
    }

    public void setStock(BigDecimal stock) {
        Stock = stock;
    }

    public String getTopLimit() {
        return TopLimit;
    }

    public void setTopLimit(String topLimit) {
        TopLimit = topLimit;
    }

    public String getLowerLimit() {
        return LowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        LowerLimit = lowerLimit;
    }

    public String getTargetCustomer() {
        return TargetCustomer;
    }

    public void setTargetCustomer(String targetCustomer) {
        TargetCustomer = targetCustomer;
    }

    public String getParameter() {
        return Parameter;
    }

    public void setParameter(String parameter) {
        Parameter = parameter;
    }

    public String getTechnicsImage() {
        return TechnicsImage;
    }

    public void setTechnicsImage(String technicsImage) {
        TechnicsImage = technicsImage;
    }

    public String getStorageLocation() {
        return StorageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        StorageLocation = storageLocation;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String toString() {
        return "ProductionModel{" +
                "Barcode='" + Barcode + '\'' +
                ", Type='" + Type + '\'' +
                ", Name='" + Name + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Specs='" + Specs + '\'' +
                ", Quality='" + Quality + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Cost='" + Cost + '\'' +
                ", Tax='" + Tax + '\'' +
                ", ChannelQuotation='" + ChannelQuotation + '\'' +
                ", TerminalQuotation='" + TerminalQuotation + '\'' +
                ", Supplier='" + Supplier + '\'' +
                ", Remark='" + Remark + '\'' +
                ", UpdateRecord='" + UpdateRecord + '\'' +
                ", AddDate='" + AddDate + '\'' +
                ", AddStaff='" + AddStaff + '\'' +
                ", ProductionImage='" + ProductionImage + '\'' +
                ", Stock=" + Stock +
                ", TopLimit='" + TopLimit + '\'' +
                ", LowerLimit='" + LowerLimit + '\'' +
                ", TargetCustomer='" + TargetCustomer + '\'' +
                ", Parameter='" + Parameter + '\'' +
                ", TechnicsImage='" + TechnicsImage + '\'' +
                ", StorageLocation='" + StorageLocation + '\'' +
                ", Number='" + Number + '\'' +
                '}';
    }
}
