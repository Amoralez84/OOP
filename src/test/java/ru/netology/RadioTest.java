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
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeUpMaxVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
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
        radio.setMinChannel(0);
        assertEquals(0, radio.getMinChannel());
        radio.channelDown();
        assertEquals(9, radio.getCurrentChannel());

    }

    @Test
    public void shouldChangeUpMaxChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(9);
        assertEquals(9, radio.getCurrentChannel());
        radio.channelUp();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldChangeMaxVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void shouldChangeMinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(6);
        assertEquals(6, radio.getCurrentVolume());
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldChangeMaxChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setMaxChannel(9);
        assertEquals(9, radio.getMaxChannel());
    }

    @Test
    public void shouldChangeMinChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(4);
        assertEquals(4, radio.getCurrentChannel());
        radio.setMinChannel(0);
        assertEquals(0, radio.getMinChannel());
    }

    @Test
    public void shouldChangeVolumeUp() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
        radio.volumeUp();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeDown() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannelUp() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(8);
        assertEquals(8, radio.getCurrentChannel());
        radio.channelUp();
        assertEquals(9, radio.getCurrentChannel());
        radio.setCurrentChannel(9);

    }

    @Test
    public void shouldChangeChannelDown() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(1);
        assertEquals(1, radio.getCurrentChannel());
        radio.channelDown();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldUpMaxChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(10);
        assertEquals(0, radio.getCurrentChannel());

    }

}