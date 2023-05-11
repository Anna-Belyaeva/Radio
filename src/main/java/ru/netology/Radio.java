package ru.netology;

public class Radio {
    private int quantityRadioStation = 10;
    private int maxRadioStation = quantityRadioStation - 1;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;


    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
        this.maxRadioStation = quantityRadioStation - 1;
    }


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void next() {
        if (currentRadioStation == maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
            return;
        }
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);
    }

    public void prev() {
        if (currentRadioStation == minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
            return;
        }
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public void louder() {
        if (currentVolume == maxVolume) {
            return;
        }
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void quiet() {
        if (currentVolume == minVolume) {
            return;
        }
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }

}