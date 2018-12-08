package spring.event.demo.event.event;

import org.springframework.context.ApplicationEvent;

public class GoodsIncomeEvent extends ApplicationEvent {
    public GoodsIncomeEvent(Object source) {
        super(source);
    }
}
