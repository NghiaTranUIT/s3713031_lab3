package com.company;

public class SuperVIP extends Customer {

    static SuperVIP instance = null;

    public SuperVIP(String name, String address, String iD, String phone) {
        super(name, address, iD, phone);
    }

    public static SuperVIP getInstance() {
        if (instance == null) {
            instance = new SuperVIP("Super VIP User", "", "12345", "09091121131");
        }
        return instance;
    }
}
