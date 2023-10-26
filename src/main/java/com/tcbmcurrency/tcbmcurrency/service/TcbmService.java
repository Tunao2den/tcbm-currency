package com.tcbmcurrency.tcbmcurrency.service;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser;
import com.tcbmcurrency.tcbmcurrency.model.ExchangeDates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class TcbmService {
    private final RestTemplate restTemplate;


    public TcbmService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public String getDataFromTcbm() throws JsonProcessingException {
        String url = "https://www.tcmb.gov.tr/kurlar/202309/01092023.xml";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String data = response.toString();
        data = data.substring(49);
        return data;
    }
}
//
//    String url = "https://www.tcmb.gov.tr/kurlar/202309/01092023.xml";
//
//    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//        return new XmlMapper()
//                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
//                .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
//                .readValue(response.getBody(), ExchangeDates.class);