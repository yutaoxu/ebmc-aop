package com.ruijie.ebmc.logger;

import com.ruijie.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by idea.
 * author: yutaoxun1130
 * email: yutaoxun@gmail.com
 * twitter: yutaoxun
 * company: fanqielaile
 * date: 2017/11/7
 * time: 17:09
 */
@Controller
public class OrderTest {

    @Autowired
    private OrderService orderService;

    @GetMapping("/pay")
    public void pay() {
        orderService.pay("22", 22);
    }
}
