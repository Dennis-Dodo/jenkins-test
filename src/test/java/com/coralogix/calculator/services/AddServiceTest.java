package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {

    @Test
    public void addIntegers1() {
        // given
        AddService service = new AddService();

        // when
        Result result = service.add(2, 3);

        // then
        assertEquals(result.getResult(), 5);
    }
     @Test
    public void addIntegers2() {
        // given
        AddService service = new AddService();

        // when
        Result result = service.add(8, 12);

        // then
        assertEquals(result.getResult(), 20);
    }

}
