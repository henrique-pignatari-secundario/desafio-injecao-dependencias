package com.henrique.desafio_injecao_dependencias.entities;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;

    public Order(int code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
