package com.sliit.mtit.microservice.paymentservice.service;

import com.sliit.mtit.microservice.paymentservice.dto.InvoiceCreationRequest;
import com.sliit.mtit.microservice.paymentservice.dto.InvoiceCreationResponse;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentRequest;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class PaymentServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public PaymentResponse createPayment(PaymentRequest paymentRequest){

        var invoiceCreationRequest = new InvoiceCreationRequest();
        invoiceCreationRequest.setOrderID(paymentRequest.getOrderID());
        invoiceCreationRequest.setCustomerName(paymentRequest.getCustomerName());
        invoiceCreationRequest.setContact(paymentRequest.getContact());
        invoiceCreationRequest.setProdID(paymentRequest.getProdID());
        invoiceCreationRequest.setProdName(paymentRequest.getProdName());
        invoiceCreationRequest.setProdQty(paymentRequest.getProdQty());
        invoiceCreationRequest.setTotPrice(paymentRequest.getTotPrice());
        ResponseEntity<InvoiceCreationResponse> invoiceCreationResponse = restTemplate.postForEntity("http://localhost:9095/invoices", invoiceCreationRequest, InvoiceCreationResponse.class);

        var paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentID(UUID.randomUUID().toString());
        paymentResponse.setInvoiceID(invoiceCreationResponse.getBody().getInvoiceID());
        paymentResponse.setMessage("Successfully completed the payment");

        return paymentResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){return builder.build();}

}
