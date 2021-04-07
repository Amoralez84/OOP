package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeUnderMinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeUpMaxVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(4);
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void shouldChangeUnderMinChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(-1);
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void shouldChangeUpMaxChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(10);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldChangeUpVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setUpVolume(1);
        assertEquals(1, radio.getUpVolume());
    }

    @Test
    public void shouldChangeDownVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
        radio.setDownVolume(4);
        assertEquals(4, radio.getDownVolume());
    }

    @Test
    public void shouldChangeUpChannel(){
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setUpChannel(1);
        assertEquals(1, radio.getUpChannel());
    }

    @Test
    public  void shouldChangeDownChannel(){
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(5);
        assertEquals(5, radio.getCurrentChannel());
        radio.setDownChannel(4);
        assertEquals(4, radio.getDownChannel());
    }
}