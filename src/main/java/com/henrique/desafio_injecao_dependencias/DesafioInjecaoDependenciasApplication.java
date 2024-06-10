package com.henrique.desafio_injecao_dependencias;

import com.henrique.desafio_injecao_dependencias.entities.Order;
import com.henrique.desafio_injecao_dependencias.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;

@SpringBootApplication
public class DesafioInjecaoDependenciasApplication implements CommandLineRunner {
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioInjecaoDependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034,150.00, 20.0);
		Order order2 = new Order(2282,800.00, 10.0);
		Order order3 = new Order(1309,95.90, 0.0);

		imprimirPedido(order1);
		imprimirPedido(order2);
		imprimirPedido(order3);
	}

	private void imprimirPedido(Order order){
		String orderTotal = new DecimalFormat("#.00").format(orderService.total(order));
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + orderTotal);
	}
}
