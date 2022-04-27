package myungju.consul.demo.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class ConsulConfig {
    @Value("${feature.api.order.enabled}")
    @Getter
    private boolean featureApiOrderEnabled = false;

    @Value("${feature.api.readside.enabled}")
    @Getter
    private boolean featureApiReadsideEnabled = false;
}
