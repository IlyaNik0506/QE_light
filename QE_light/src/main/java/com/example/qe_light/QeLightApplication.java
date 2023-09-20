package com.example.qe_light;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class QeLightApplication {
    public static void main(String[] args){
        SpringApplication.run(QeLightApplication.class, args);
    }
    @PostMapping("/convert")
    public MyResponse handleRequest(@RequestBody MyRequest request) {
        MyResponse response = new MyResponse();
        response.setUSD(request.getRub() / 100);
        response.setRub(request.getRub());
        return response;
    }
}
