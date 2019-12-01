package com.example.labmid;

public class ServiceInformation {
    private String personName;
    private int areaCode;
    private String areaName;
    private int serviceCode;
    private String urgentMessage;
    private String contactNumber;

    public ServiceInformation(String personName, int areaCode, String areaName, int serviceCode, String urgentMessage, String contactNumber) {
        this.personName = personName;
        this.areaCode = areaCode;
        this.areaName = areaName;
        this.serviceCode = serviceCode;
        this.urgentMessage = urgentMessage;
        this.contactNumber = contactNumber;
    }
    static ServiceInformation[] serviceInformation={
            new ServiceInformation("ABC",1,"Islamabad",1,"Please need urgent help in transporation","23456789"),
            new ServiceInformation("CDE",2,"Rawalpindi",1,"Please need urgent help in transporation","65487899"),
            new ServiceInformation("FGH",1,"Islamabad",2,"Please need urgent help in Home Maintenance","54548789"),
            new ServiceInformation("IJK",3,"Lahore",1,"Please need urgent help in transporation","86562165"),
            new ServiceInformation("LMO",1,"Islamabad",3,"Please need urgent help in purchasing and delivering","58448512"),
            new ServiceInformation("PQR",4,"Karachi",1,"Please need urgent help in transporation","39875125"),
            new ServiceInformation("STU",4,"karachi",2,"Please need urgent help in Home Maintenance","89451654"),
            new ServiceInformation("VWX",4,"Karachi",2,"Please need urgent help in Home Maintenance","21864525"),
            new ServiceInformation("XYZ",3,"Lahore",2,"Please need urgent help in Home Maintenance","87987987"),
            new ServiceInformation("YZA",3,"Lahore",3,"Please need urgent help in Purchasing and delivery","52235489"),
            new ServiceInformation("BCD",4,"Karachi",3,"Please need urgent help in purchasing and delivery","21354832"),
            new ServiceInformation("CDE",2,"Rawalpindi",3,"Please need urgent help in Purchasing and delivery","87215484")
    };
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getUrgentMessage() {
        return urgentMessage;
    }

    public void setUrgentMessage(String urgentMessage) {
        this.urgentMessage = urgentMessage;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String toString(){
        return personName;
    }
}
