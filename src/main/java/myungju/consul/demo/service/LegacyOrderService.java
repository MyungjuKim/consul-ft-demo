package myungju.consul.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LegacyOrderService {

    public String order() {
        return "The order by the legacy system has been completed.";
    }

}
