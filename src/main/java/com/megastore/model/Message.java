package com.megastore.model;

public class Message {
//    private final Order orderMessage;
    private final String stringMessage;

//    public Message(Order orderMessage) {
//        this.orderMessage = orderMessage;
//    }
    public Message(String stringMessage) {
        this.stringMessage = stringMessage;
    }

//    public void setMessage(Order stringMessage) {
//
//    }
//    public Order getMessage() {
//        System.out.println(this.orderMessage.toString());
//        return this.orderMessage;
//    }
    public String getMessage() {
//        System.out.println(stringMessage);
        return this.stringMessage;
    }
}
