package com.xyzcorp;

import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TimeBombTest {

    @Test
    public void testMulticatchSQLAndIOException() {
        TimeBomb timeBomb = new TimeBomb();

        try {
            timeBomb.thisWillThrowASQLException();
            timeBomb.thisWillThrowAIOException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMulticatchMalformedURLAndIOException() {
        TimeBomb timeBomb = new TimeBomb();

        try {
            timeBomb.thisWIllThrowAMalformedURLException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            timeBomb.thisWillThrowAIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAssertJExceptionHandling() {
        TimeBomb timeBomb = new TimeBomb();

        assertThatThrownBy(() -> timeBomb.thisWillThrowAIOException());
    }
}