package myungju.consul.demo.service;

import org.springframework.stereotype.Service;

@Service
public class NewOrderService {

    public String order() {
        return "The order by the new system has been completed.";
    }

}
