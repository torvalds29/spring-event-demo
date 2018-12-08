package spring.event.demo.event.event;

import org.springframework.context.ApplicationEvent;

public class OrderStatusEvent extends ApplicationEvent {
    public OrderStatusEvent(Object source) {
        super(source);
    }
}
