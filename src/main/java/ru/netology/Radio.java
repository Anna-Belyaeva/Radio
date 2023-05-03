package ru.netology;

public class Radio {
    ////////////////////радиостанция//////////////////////////////////////////
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation == 9) {
            setCurrentRadioStation(0);
            return;
        }
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);
    }

    public void prev() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(9);
            return;
        }
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);
    }


    ////////////////////////////громкость////////////////////////////////////////
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void louder(){
        if (currentVolume == 100){
            return;
        }
        int target = currentVolume +1;
        setCurrentVolume(target);
    }

    public void quiet(){
        if (currentVolume == 0){
            return;
        }
        int target = currentVolume -1;
        setCurrentVolume(target);
    }

}