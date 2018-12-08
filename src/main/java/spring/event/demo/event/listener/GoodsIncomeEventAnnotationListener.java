package spring.event.demo.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import spring.event.demo.event.event.GoodsIncomeEvent;

@Component
public class GoodsIncomeEventAnnotationListener {
    Logger logger = LoggerFactory.getLogger(getClass());

    @EventListener
    public void onApplicationEvent(GoodsIncomeEvent goodsIncomeEvent) {
        logger.info("recive a Annotation goods income event {}", goodsIncomeEvent.getSource());

    }
}
