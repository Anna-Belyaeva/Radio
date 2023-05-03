package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    /////////////////////////////////////RadioStation//////////////////////////////////////
    @Test  ///выставляет номер через прямое указание
    public void shouldSetNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///пограничные значения
    public void shouldSetRadioStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation8() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///нет станции дальше 9
    public void shouldNotSetNumberRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.setCurrentRadioStation(10);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///переключает на 1 станцию вперёд
    public void shouldSwitchForwardRadioStation5To6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///пограничные значения
    public void shouldSwitchForwardRadioStation0To1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchForwardRadioStation8To9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchForwardRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///переключает на 1 станцию назад
    public void shouldSwitchBackRadioStation7To6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///пограничные значения
    public void shouldSwitchBackRadioStation1o0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBackRadioStation0To9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBackRadioStation9To8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    ////////////////////////////////////////volume//////////////////////////////////////////////////

    @Test  ///устанавливает громкость звука
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(56);

        int expected = 56;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///пораничные значения
    public void shouldSetVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(34);

        radio.setCurrentVolume(-1);

        int expected = 34;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.setCurrentVolume(101);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///повышает громкость на 1
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(72);

        radio.louder();

        int expected = 73;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///пограничные значения
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.louder();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///понижает громкость на 1
    public void shouldReduceVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);

        radio.quiet();

        int expected = 55;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///пограничные значения

    public void shouldNotReduceVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.quiet();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
