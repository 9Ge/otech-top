package com.otechsolution.shipment.entity;

public class ShipmentHeaderCompany {
    private Long id;

    private Long clientId;

    private Long shipmentHeaderId;

    private String declareCompanyCodeScc;

    private String declareCompanyCode;

    private String declareCompanyCiqCode;

    private String declareCompanyName;

    private String useCompanyCodeScc;

    private String useCompanyCode;

    private String useCiqCode;

    private String useCompanyName;

    private String domesticConsignorCode;

    private String domesticConsignorNameCn;

    private String domesticConsignorCiqCode;

    private String domesticConsignorNameEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public String getDeclareCompanyCodeScc() {
        return declareCompanyCodeScc;
    }

    public void setDeclareCompanyCodeScc(String declareCompanyCodeScc) {
        this.declareCompanyCodeScc = declareCompanyCodeScc == null ? null : declareCompanyCodeScc.trim();
    }

    public String getDeclareCompanyCode() {
        return declareCompanyCode;
    }

    public void setDeclareCompanyCode(String declareCompanyCode) {
        this.declareCompanyCode = declareCompanyCode == null ? null : declareCompanyCode.trim();
    }

    public String getDeclareCompanyCiqCode() {
        return declareCompanyCiqCode;
    }

    public void setDeclareCompanyCiqCode(String declareCompanyCiqCode) {
        this.declareCompanyCiqCode = declareCompanyCiqCode == null ? null : declareCompanyCiqCode.trim();
    }

    public String getDeclareCompanyName() {
        return declareCompanyName;
    }

    public void setDeclareCompanyName(String declareCompanyName) {
        this.declareCompanyName = declareCompanyName == null ? null : declareCompanyName.trim();
    }

    public String getUseCompanyCodeScc() {
        return useCompanyCodeScc;
    }

    public void setUseCompanyCodeScc(String useCompanyCodeScc) {
        this.useCompanyCodeScc = useCompanyCodeScc == null ? null : useCompanyCodeScc.trim();
    }

    public String getUseCompanyCode() {
        return useCompanyCode;
    }

    public void setUseCompanyCode(String useCompanyCode) {
        this.useCompanyCode = useCompanyCode == null ? null : useCompanyCode.trim();
    }

    public String getUseCiqCode() {
        return useCiqCode;
    }

    public void setUseCiqCode(String useCiqCode) {
        this.useCiqCode = useCiqCode == null ? null : useCiqCode.trim();
    }

    public String getUseCompanyName() {
        return useCompanyName;
    }

    public void setUseCompanyName(String useCompanyName) {
        this.useCompanyName = useCompanyName == null ? null : useCompanyName.trim();
    }

    public String getDomesticConsignorCode() {
        return domesticConsignorCode;
    }

    public void setDomesticConsignorCode(String domesticConsignorCode) {
        this.domesticConsignorCode = domesticConsignorCode == null ? null : domesticConsignorCode.trim();
    }

    public String getDomesticConsignorNameCn() {
        return domesticConsignorNameCn;
    }

    public void setDomesticConsignorNameCn(String domesticConsignorNameCn) {
        this.domesticConsignorNameCn = domesticConsignorNameCn == null ? null : domesticConsignorNameCn.trim();
    }

    public String getDomesticConsignorCiqCode() {
        return domesticConsignorCiqCode;
    }

    public void setDomesticConsignorCiqCode(String domesticConsignorCiqCode) {
        this.domesticConsignorCiqCode = domesticConsignorCiqCode == null ? null : domesticConsignorCiqCode.trim();
    }

    public String getDomesticConsignorNameEn() {
        return domesticConsignorNameEn;
    }

    public void setDomesticConsignorNameEn(String domesticConsignorNameEn) {
        this.domesticConsignorNameEn = domesticConsignorNameEn == null ? null : domesticConsignorNameEn.trim();
    }
}