package myungju.consul.demo.controller;

import lombok.RequiredArgsConstructor;
import myungju.consul.demo.config.ConsulConfig;
import myungju.consul.demo.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConsulDemoController {
    private final ConsulConfig consulConfig;
    private final OrderService orderService;

    @GetMapping(path = "/api/order")
    public ResponseEntity<String> order() {
        return ResponseEntity.ok(orderService.order());
    }

    @GetMapping(path = "/api/order/state")
    public ResponseEntity<Boolean> getApiOrderState() {
        return ResponseEntity.ok(consulConfig.isFeatureApiOrderEnabled());
    }
}
