package com.zirxin.jalpha_vantage.impl;

import com.zirxin.jalpha_vantage.domain.Currency;
import com.zirxin.jalpha_vantage.domain.DigitalCurrency;
import com.zirxin.jalpha_vantage.enums.DigitalCurrencyType;
import com.zirxin.jalpha_vantage.enums.MarketList;
import com.zirxin.jalpha_vantage.exception.*;
import com.zirxin.jalpha_vantage.service.ICryptoCurrencyService;
import com.zirxin.jalpha_vantage.test.AbstractServiceTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class CrypoCurrencyTypeTemplateTest extends AbstractServiceTest {
    @Autowired
    ICryptoCurrencyService cryptoCurrencyOperation;

    @Test
    public void testExchangeRateTest() {
        try {
            Currency currency = cryptoCurrencyOperation.exchangeRate(DigitalCurrencyType._1ST, DigitalCurrencyType._2GIVE);
            assertNotNull(currency.getExchangeRate());
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            fail("Unsupported Encoding Exception");
        } catch (InvalidApiKeyException ex1) {
            ex1.printStackTrace();
            fail("Invalid Api Key Exception");
        } catch (InvalidFunctionOptionException ex2) {
            ex2.printStackTrace();
            fail("Required Function Properties Missing or is Invalid in Exception");
        } catch (MalFormattedFunctionException ex3) {
            ex3.printStackTrace();
            fail("Invalid Function Exception");
        } catch (MissingApiKeyException ex4) {
            ex4.printStackTrace();
            fail("Missing Api Key Exception");
        } catch (UltraHighFrequencyRequestException ex5) {
            ex5.printStackTrace();
            fail("Ultra High Frequency Request Exception");
        }
    }

    @Test
    public void testIntraDay() {
        try {
            LinkedHashMap<LocalDateTime, DigitalCurrency> values = cryptoCurrencyOperation.intraday(DigitalCurrencyType.BTC, MarketList.CNY);
            assertEquals(922, values.size());
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            fail("Unsupported Encoding Exception");
        } catch (InvalidApiKeyException ex1) {
            ex1.printStackTrace();
            fail("Invalid Api Key Exception");
        } catch (InvalidFunctionOptionException ex2) {
            ex2.printStackTrace();
            fail("Required Function Properties Missing or is Invalid in Exception");
        } catch (MalFormattedFunctionException ex3) {
            ex3.printStackTrace();
            fail("Invalid Function Exception");
        } catch (MissingApiKeyException ex4) {
            ex4.printStackTrace();
            fail("Missing Api Key Exception");
        } catch (UltraHighFrequencyRequestException ex5) {
            ex5.printStackTrace();
            fail("Ultra High Frequency Request Exception");
        }
    }

    @Test
    public void tesDaily() {
        try {
            LinkedHashMap<LocalDate, DigitalCurrency> values = cryptoCurrencyOperation.daily(DigitalCurrencyType.BTC, MarketList.CNY);
            assertEquals(1292, values.size());
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            fail("Unsupported Encoding Exception");
        } catch (InvalidApiKeyException ex1) {
            ex1.printStackTrace();
            fail("Invalid Api Key Exception");
        } catch (InvalidFunctionOptionException ex2) {
            ex2.printStackTrace();
            fail("Required Function Properties Missing or is Invalid in Exception");
        } catch (MalFormattedFunctionException ex3) {
            ex3.printStackTrace();
            fail("Invalid Function Exception");
        } catch (MissingApiKeyException ex4) {
            ex4.printStackTrace();
            fail("Missing Api Key Exception");
        } catch (UltraHighFrequencyRequestException ex5) {
            ex5.printStackTrace();
            fail("Ultra High Frequency Request Exception");
        }
    }


    @Test
    public void testWeekly() {
        try {
            LinkedHashMap<LocalDate, DigitalCurrency> values = cryptoCurrencyOperation.weekly(DigitalCurrencyType.BTC, MarketList.CNY);
            assertEquals(184, values.size());
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            fail("Unsupported Encoding Exception");
        } catch (InvalidApiKeyException ex1) {
            ex1.printStackTrace();
            fail("Invalid Api Key Exception");
        } catch (InvalidFunctionOptionException ex2) {
            ex2.printStackTrace();
            fail("Required Function Properties Missing or is Invalid in Exception");
        } catch (MalFormattedFunctionException ex3) {
            ex3.printStackTrace();
            fail("Invalid Function Exception");
        } catch (MissingApiKeyException ex4) {
            ex4.printStackTrace();
            fail("Missing Api Key Exception");
        } catch (UltraHighFrequencyRequestException ex5) {
            ex5.printStackTrace();
            fail("Ultra High Frequency Request Exception");
        }
    }

    @Test
    public void testMonthly() {
        try {
            LinkedHashMap<LocalDate, DigitalCurrency> values = cryptoCurrencyOperation.monthly(DigitalCurrencyType.BTC, MarketList.CNY);
            assertEquals(42, values.size());
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            fail("Unsupported Encoding Exception");
        } catch (InvalidApiKeyException ex1) {
            ex1.printStackTrace();
            fail("Invalid Api Key Exception");
        } catch (InvalidFunctionOptionException ex2) {
            ex2.printStackTrace();
            fail("Required Function Properties Missing or is Invalid in Exception");
        } catch (MalFormattedFunctionException ex3) {
            ex3.printStackTrace();
            fail("Invalid Function Exception");
        } catch (MissingApiKeyException ex4) {
            ex4.printStackTrace();
            fail("Missing Api Key Exception");
        } catch (UltraHighFrequencyRequestException ex5) {
            ex5.printStackTrace();
            fail("Ultra High Frequency Request Exception");
        }
    }
}

