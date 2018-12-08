package spring.event.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;
import spring.event.demo.event.event.GoodsIncomeEvent;
import spring.event.demo.event.event.OrderStatusEvent;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringEventDemoApplicationTests {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Test
    public void contextLoads() {
        applicationEventPublisher.publishEvent(new GoodsIncomeEvent("this is a good"));
        applicationEventPublisher.publishEvent(new OrderStatusEvent("order status had changed"));
    }

}
