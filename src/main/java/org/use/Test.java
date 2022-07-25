package org.use;

import org.spring.ApplicationContext;
import org.use.service.OrderService;
import org.use.service.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext(AppConfig.class);
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.test();
        orderService.test();
    }
}
