package com.henrique.desafio_injecao_dependencias.services;

import com.henrique.desafio_injecao_dependencias.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if(order.getBasic() > 200){
            return 0;
        } else if (order.getBasic() < 100) {
            return 20;
        }
        return 12;
    }
}
