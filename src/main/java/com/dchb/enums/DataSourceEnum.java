package com.dchb.enums;

public enum DataSourceEnum {

    SQLSERVER("sqlserver"),ORACLE("oralce");

    private String value;

    DataSourceEnum(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}