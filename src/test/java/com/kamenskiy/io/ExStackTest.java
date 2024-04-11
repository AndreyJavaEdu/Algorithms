package com.kamenskiy.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExStackTest {
    ExStack ex = new ExStack();
    String s = "[{}]";

    @Test
    public void stack(){
        boolean valid = ex.isValid(s);
        Assertions.assertEquals(valid, false);

    }

}