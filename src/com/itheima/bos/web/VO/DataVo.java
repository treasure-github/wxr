package com.itheima.bos.web.VO;

import com.itheima.bos.web.pojo.DsStore;

import java.util.List;

public class DataVo {

    /**
     * 销售额
     */
    private List saleMoneyList;
    /**
     * 利润
     */
    private List profitList;
    /**
     * 销售数量
     */
    private List shipmentNumList;

    private String message;
    private String status;
    private List collectionmoney;
    private List typeNameList;
    private List typeNumList;
    private List typeMoneyList;
    private List typeNoNameList;

    public DataVo() {
    }

    public List getUsernameList() {
        return usernameList;
    }

    public void setUsernameList(List usernameList) {
        this.usernameList = usernameList;
    }

    private List usernameList;

    /**
     * 存放店鋪对象
     * @return
     */
    private List<DsStore> storeList;

    public List<DsStore> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<DsStore> storeList) {
        this.storeList = storeList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List getProfitList() {
        return profitList;
    }

    public void setProfitList(List profitList) {
        this.profitList = profitList;
    }

    public List getShipmentNumList() {
        return shipmentNumList;
    }

    public void setShipmentNumList(List shipmentNumList) {
        this.shipmentNumList = shipmentNumList;
    }

    public List getSaleMoneyList() {

        return saleMoneyList;
    }

    public void setSaleMoneyList(List saleMoneyList) {
        this.saleMoneyList = saleMoneyList;
    }

    public List getCollectionmoney() {
        return collectionmoney;
    }

    public void setCollectionmoney(List collectionmoney) {
        this.collectionmoney = collectionmoney;
    }

    public List getTypeMoneyList() {
        return typeMoneyList;
    }

    public void setTypeMoneyList(List typeMoneyList) {
        this.typeMoneyList = typeMoneyList;
    }

    public List getTypeNumList() {
        return typeNumList;
    }

    public void setTypeNumList(List typeNumList) {
        this.typeNumList = typeNumList;
    }

    public List getTypeNameList() {
        return typeNameList;
    }

    public void setTypeNameList(List typeNameList) {
        this.typeNameList = typeNameList;
    }

    public List getTypeNoNameList() {
        return typeNoNameList;
    }

    public void setTypeNoNameList(List typeNoNameList) {
        this.typeNoNameList = typeNoNameList;
    }
}

