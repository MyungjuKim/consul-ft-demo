package myungju.consul.demo.service;

import lombok.AllArgsConstructor;
import myungju.consul.demo.config.ConsulConfig;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
    private final LegacyOrderService legacyOrderService;
    private final NewOrderService newOrderService;

    private final ConsulConfig consulConfig;

    public String order() {
        // feature toggles
        if (consulConfig.isFeatureApiOrderEnabled()) {
            return newOrderService.order();
        }
        return legacyOrderService.order();
    }
}
