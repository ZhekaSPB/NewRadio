package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void testCurrentStation() {
        // Radio radio = new Radio();

        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testCurrentVolume() {
        // Radio radio = new Radio();

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testQuantityStation() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(30, radio.getQuantityStation());
    }

    @Test
    public void testNoQuantityStation() {

        Assertions.assertEquals(10, radio.getQuantityStation());
    }

    @Test
    public void testMaxStation() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(29, radio.getMaxStation());
    }

    @Test
    public void testMaxVolume() {
        // Radio radio = new Radio();
        radio.setCurrentVolume(101);

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testLittleVolume() {
        // Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testCurrentStationBig() {
        // Radio radio = new Radio();
        radio.setCurrentStation(15);

        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testCurrentStationLittle() {
        // Radio radio = new Radio();
        radio.setCurrentStation(-1);

        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void shuldCurrentStationStationMax() {
        //Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldZeroCurrentStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldCurrentStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldNoCurrentStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldNoBigCurrentStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.setNextCurrentStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setNextCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.setPrevCurrentStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentStationZero() {
        //Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setPrevCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldSetCurrentVolumeMax() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldSetCurrentVolumeZero() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldSetCurrentVolume() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldNoCurrentVolumeBig() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldNoCurrentVolumeMin() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolume() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setUpCurrentVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentVolumeMax() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.setUpCurrentVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolume() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.setDownCurrentVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentVolumeZero() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}