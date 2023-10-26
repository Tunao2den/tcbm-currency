//package com.tcbmcurrency.tcbmcurrency.model;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import java.io.File;
//
//public class test {
//    public static void main(String[] args) {
//        try {
//            File xmlFile = new File("test1.xml"); // Replace with the path to your XML file.
//
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document = builder.parse(xmlFile);
//
//            Element root = document.getDocumentElement();
//
//            String tarih = root.getAttribute("Tarih");
//            System.out.println("Tarih: " + tarih);
//
//            NodeList currencyList = root.getElementsByTagName("Currency");
//            for (int i = 0; i < currencyList.getLength(); i++) {
//                Element currency = (Element) currencyList.item(i);
//                String kod = currency.getAttribute("Kod");
//                String currencyName = currency.getElementsByTagName("CurrencyName").item(0).getTextContent();
//                String forexBuying = currency.getElementsByTagName("ForexBuying").item(0).getTextContent();
//                String forexSelling = currency.getElementsByTagName("ForexSelling").item(0).getTextContent();
//
//                System.out.println("Currency Code: " + kod);
//                System.out.println("Currency Name: " + currencyName);
//                System.out.println("Forex Buying: " + forexBuying);
//                System.out.println("Forex Selling: " + forexSelling);
//                System.out.println("----------------------");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}