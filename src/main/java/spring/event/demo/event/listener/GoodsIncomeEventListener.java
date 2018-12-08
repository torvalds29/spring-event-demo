package spring.event.demo.event.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import spring.event.demo.event.event.GoodsIncomeEvent;

@Component
public class GoodsIncomeEventListener implements ApplicationListener<GoodsIncomeEvent> {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(GoodsIncomeEvent goodsIncomeEvent) {
        logger.info("recive a goods income event {}", goodsIncomeEvent.getSource());

    }
}
