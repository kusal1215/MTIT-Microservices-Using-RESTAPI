package com.sliit.mtit.microservice.invoiceservice.controller;


import com.sliit.mtit.microservice.invoiceservice.dto.InvoiceRequest;
import com.sliit.mtit.microservice.invoiceservice.dto.InvoiceResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody InvoiceResponse createInvoice(@RequestBody InvoiceRequest invoiceRequest){

        System.out.println("Invoice Details: " + invoiceRequest);

        var invoiceResponse = new InvoiceResponse();
        invoiceResponse.setInvoiceID(UUID.randomUUID().toString());
        invoiceResponse.setMessage("Successfully Generate the Invoice for " + invoiceRequest.getOrderID());
        return invoiceResponse;
    }
    
}
