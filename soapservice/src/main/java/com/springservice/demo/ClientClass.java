package com.springservice.demo;

import com.springservice.demo.wsdl.CelsiusToFahrenheit;
import com.springservice.demo.wsdl.CelsiusToFahrenheitResponse;
import com.springservice.demo.wsdl.FahrenheitToCelsius;
import com.springservice.demo.wsdl.FahrenheitToCelsiusResponse;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class ClientClass extends WebServiceGatewaySupport {

    public CelsiusToFahrenheitResponse getResponse(String value) {
//        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive("https://www.w3schools.com/xml/tempconvert.asmx", request);
//        return (CelsiusToFahrenheitResponse) res.getValue();
        CelsiusToFahrenheit request = new CelsiusToFahrenheit();
        request.setCelsius(value);
        CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://www.w3schools.com/xml/tempconvert.asmx", request,
                        new SoapActionCallback(
                                "https://www.w3schools.com/xml/CelsiusToFahrenheit")); //operation/soapaction
        return response;

    }

    public FahrenheitToCelsiusResponse getresponsefahrenheit(String fahvalue) {
        FahrenheitToCelsius req = new FahrenheitToCelsius();
        req.setFahrenheit(fahvalue);
        FahrenheitToCelsiusResponse fahres= (FahrenheitToCelsiusResponse) getWebServiceTemplate().marshalSendAndReceive("https://www.w3schools.com/xml/tempconvert.asmx",
                req, new SoapActionCallback("https://www.w3schools.com/xml/FahrenheitToCelsius"));
        return fahres;
    }


}

