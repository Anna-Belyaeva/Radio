package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    /////////////////////////////////////RadioStation//////////////////////////////////////
    @Test  ///создание объекта радио с указанием количества станций
    public void shouldSetQuantity15() {
        Radio radio = new Radio(15);
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(14, radio.getMaxRadioStation());
        Assertions.assertEquals(15, radio.getQuantityRadioStation());
    }


    @Test  ///выставляет номер станции через прямое указание
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

        radio.setCurrentRadioStation(radio.getMinRadioStation());

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///пограничные значения
    public void shouldSetRadioStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);


        radio.setCurrentRadioStation(radio.getMinRadioStation() - 1);

        int expected = 4;
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

        radio.setCurrentRadioStation(radio.getMaxRadioStation());

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation29() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(radio.getMaxRadioStation());

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test  ///нет станции дальше 9
    public void shouldNotSetNumberRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.setCurrentRadioStation(radio.getMaxRadioStation() + 1);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationAboveMaxWithIndicatingQuantity() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(28);

        radio.setCurrentRadioStation(radio.getMaxRadioStation() + 1);

        int expected = 28;
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
        radio.setCurrentRadioStation(radio.getMinRadioStation());

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
        radio.setCurrentRadioStation(radio.getMaxRadioStation());

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
        radio.setCurrentRadioStation(radio.getMinRadioStation());

        radio.prev();

        int expected = radio.getMaxRadioStation();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchBackRadioStationWithIndicatingQuantity() {
        Radio radio = new Radio(58);
        radio.setCurrentRadioStation(radio.getMinRadioStation());

        radio.prev();

        int expected = radio.getMaxRadioStation();
        int actual = radio.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBackRadioStation9To8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    ////////////////////////////////////////Volume//////////////////////////////////////////////////

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

        radio.setCurrentVolume(radio.getMinVolume() - 1);

        int expected = 34;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());

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

        radio.setCurrentVolume(radio.getMaxVolume());

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.setCurrentVolume(radio.getMaxVolume() + 1);

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
        radio.setCurrentVolume(radio.getMaxVolume());

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
        radio.setCurrentVolume(radio.getMinVolume());

        radio.quiet();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
