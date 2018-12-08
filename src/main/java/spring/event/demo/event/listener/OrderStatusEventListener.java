package spring.event.demo.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import spring.event.demo.event.event.OrderStatusEvent;

@Component
public class OrderStatusEventListener {
    Logger logger = LoggerFactory.getLogger(getClass());

    @EventListener
    public void listener(OrderStatusEvent orderStatusEvent) {
        logger.info("recive a orderStatusEvent event {}", orderStatusEvent.getSource());

    }

}
