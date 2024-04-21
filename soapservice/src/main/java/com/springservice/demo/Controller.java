package com.springservice.demo;

import com.springservice.demo.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@RestController
@RequestMapping("/temp")
public class Controller {

    @Autowired
    ClientClass clientClass;

    @GetMapping("/fahrenheit")
    public  String getFahrenheitvalue(@RequestParam String value) {
        CelsiusToFahrenheitResponse response = clientClass.getResponse(value);
        return response.getCelsiusToFahrenheitResult().toString();
    }

    @GetMapping("/fahtocelsius")
    public String getCelsius(@RequestParam String fahvalue) {
        FahrenheitToCelsiusResponse fahrenheitToCelsiusResponse = clientClass.getresponsefahrenheit(fahvalue);
        return fahrenheitToCelsiusResponse.getFahrenheitToCelsiusResult().toString();
    }
}
