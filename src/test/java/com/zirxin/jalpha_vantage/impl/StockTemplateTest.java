package com.zirxin.jalpha_vantage.impl;

import com.zirxin.jalpha_vantage.domain.Stock;
import com.zirxin.jalpha_vantage.exception.*;
import com.zirxin.jalpha_vantage.service.IStockService;
import com.zirxin.jalpha_vantage.test.AbstractServiceTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class StockTemplateTest extends AbstractServiceTest {

    @Autowired
    IStockService stockOperation;


    @Test
    public void testIntraDay() {
        try {
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("interval", "1min");
            Map<LocalDateTime, Stock> stocks = stockOperation.intraDay("BP.L", params);
            //Closed on the Weekends, so it has no data (Test was ran on a weekend)
            assertEquals(100, stocks.size());
            for (LocalDateTime key : stocks.keySet()) {
                System.out.println(key + " => " + stocks.get(key));
            }
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
    public void testDaily() {
        try {
            HashMap<String, String> params = new HashMap<String, String>();
            Map<LocalDate, Stock> stocks = stockOperation.daily("vod.l", params);
            assertEquals(100, stocks.size());
            for (LocalDate key : stocks.keySet()) {
                System.out.println(key + " => " + stocks.get(key));
            }
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
    public void testDailyAdjustedClose() {
        try {
            HashMap<String, String> params = new HashMap<String, String>();
            Map<LocalDate, Stock> stocks = stockOperation.dailyAdjustedClose("vod.l", params);
            assertEquals(100, stocks.size());
            for (LocalDate key : stocks.keySet()) {
                System.out.println(key + " => " + stocks.get(key));
            }
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
            HashMap<String, String> params = new HashMap<String, String>();
            Map<LocalDate, Stock> stocks = stockOperation.weekly("vod.l", params);
            assertEquals(925, stocks.size());
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
    public void testWeeklyAdjusted() {
        try {
            HashMap<String, String> params = new HashMap<String, String>();
            Map<LocalDate, Stock> stocks = stockOperation.weeklyAdjusted("vod.l", params);
            assertEquals(931, stocks.size());
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
            HashMap<String, String> params = new HashMap<String, String>();
            Map<LocalDate, Stock> stocks = stockOperation.monthly("vod.l", params);
            assertEquals(212, stocks.size());
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
    public void testMonthlyAdjusted() {
        try {
            HashMap<String, String> params = new HashMap<String, String>();
            Map<LocalDate, Stock> stocks = stockOperation.monthlyAdjusted("vod.l", params);
            assertEquals(213, stocks.size());
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
