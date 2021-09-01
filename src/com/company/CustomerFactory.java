package com.company;

public class CustomerFactory {

    public static Customer create(String type, String name, String address, String iD, String phone) {
        switch (type) {
            case "guest": {
                return new GuestCustomer(name, address, iD, phone);
            }
            case "vip": {
                return new VIPCustomer(name, address, iD, phone);
            }
            case "supervip": {
                return SuperVIP.getInstance();
            }
        }
        return null;
    }
}
