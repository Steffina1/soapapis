package com.springservice.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfigClass {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.springservice.demo.wsdl");
        return jaxb2Marshaller;
    }

    @Bean
    public ClientClass soapConnector(Jaxb2Marshaller jaxb2Marshaller) {
        ClientClass client = new ClientClass();
        client.setDefaultUri("http://www.w3schools.com/xml/tempconvert.asmx");
        client.setMarshaller(jaxb2Marshaller);
        client.setUnmarshaller(jaxb2Marshaller);
        return client;
    }
}
