package com.henrique.desafio_injecao_dependencias.services;

import com.henrique.desafio_injecao_dependencias.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public Double total(Order order){
        double decimalDiscount = 1 - (order.getDiscount() / 100);
        return (order.getBasic() * decimalDiscount) + shippingService.shipment(order);
    }
}
