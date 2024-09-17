package com.tuna.tcmbcurrency.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class TcmbService {
    private final RestTemplate restTemplate;

    public TcmbService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public String getDataFromTcbm() throws JsonProcessingException {
        int daysToSubtract = 0;


        while (daysToSubtract < 10) {

            LocalDate currentDate = LocalDate.now();
            LocalDate requestedDate = currentDate.minusDays(daysToSubtract);

            String year = requestedDate.format(DateTimeFormatter.ofPattern("yyyy"));
            String month = requestedDate.format(DateTimeFormatter.ofPattern("MM"));
            String day = requestedDate.format(DateTimeFormatter.ofPattern("dd"));

            try{
                String url = "https://www.tcmb.gov.tr/kurlar/" + year + month + "/" + day + month + year + ".xml";

                ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
                String data = response.toString();
                data = data.substring(49);
                return data;

            } catch (HttpClientErrorException | HttpServerErrorException e) {
                HttpStatusCode statusCode = e.getStatusCode();
                System.out.println("Status code: " + statusCode);
                daysToSubtract++;
            }

        }
        //String url = "https://www.tcmb.gov.tr/kurlar/202309/01092023.xml";
        return null;

    }
}