package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {

    @Test
    public void addIntegers1() {
        
        AddService service = new AddService();

       
        Result result = service.add(2, 3);

        
        assertEquals(result.getResult(), 5);
    }
     @Test
    public void addIntegers2() {
        
        AddService service = new AddService();

        
        Result result = service.add(8, 12);

        
        assertEquals(result.getResult(), 20);
    }

}
