package com.github.lukaszcmielewski.SauceShopBDD;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.*;

public class HelpTest {
    @Test
    public void str2decimal() throws ParseException {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        String sValue="17 19 821,581 zł";
        System.out.println(sValue);
        String nValue=sValue.replace("zł","").replaceAll("\\s+","");//.replace(",",".");
        System.out.println("string: "+nValue);
        String pattern = "#.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);
        BigDecimal parsedStringValue = (BigDecimal) decimalFormat.parse(nValue);
        System.out.println(parsedStringValue);

    }
}
