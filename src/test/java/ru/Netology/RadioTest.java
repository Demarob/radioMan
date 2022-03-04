package ru.Netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldChangeStation (){
        assertEquals(0, radio.getNumberCurrentRadioStation());
        radio.setNumberCurrentRadioStation(5);
        assertEquals(5, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetStationUnderMinStation(){
        radio.setNumberCurrentRadioStation(-1);
        assertEquals(9,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldSetStationOverMaxStation(){
        radio.setNumberCurrentRadioStation(10);
        assertEquals(0,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldNextStation() {
        radio.setNumberCurrentRadioStation(5);
        radio.nextStation();
        assertEquals(6, radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldOverMaxStation(){
        radio.setNumberCurrentRadioStation(9);
        radio.nextStation();
        assertEquals(0,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldOverMaxStation2(){
        radio.setNumberCurrentRadioStation(10);
        radio.nextStation();
        assertEquals(1,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldPrevStation(){
        radio.setNumberCurrentRadioStation(4);
        radio.prevStation();
        assertEquals(3,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldPrevUnderMinStation(){
        radio.setNumberCurrentRadioStation(0);
        radio.prevStation();
        assertEquals(9,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldPrevUnderMinStation2(){
        radio.setNumberCurrentRadioStation(-1);
        radio.prevStation();
        assertEquals(8,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldChangeVolume(){
        assertEquals(0,radio.getNumberCurrentRadioStation());
        radio.setNumberCurrentRadioStation(5);
        assertEquals(5,radio.getNumberCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume(){
        radio.setSoundVolume(9);
        radio.increaseVolume();
        assertEquals(10,radio.getSoundVolume());
    }

    @Test
    public void shouldOverMaxVolume(){
        radio.setSoundVolume(10);
        radio.increaseVolume();
        assertEquals(10,radio.getSoundVolume());
    }

    @Test
    public void shouldOverMaxVolume2(){
        radio.setSoundVolume(11);
        radio.increaseVolume();
        assertEquals(1,radio.getSoundVolume());
    }

    @Test
    public void shouldDecreaseVolume(){
        radio.setSoundVolume(9);
        radio.decreaseVolume();
        assertEquals(8,radio.getSoundVolume());
    }

    @Test
    public void shouldUnderMinVolume(){
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        assertEquals(0,radio.getSoundVolume());
    }

    @Test
    public void shouldUnderMinVolume2(){
        radio.setSoundVolume(-1);
        radio.decreaseVolume();
        assertEquals(0,radio.getSoundVolume());
    }
}