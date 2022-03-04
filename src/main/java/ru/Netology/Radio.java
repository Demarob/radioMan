package ru.Netology;

public class Radio {

    private int numberCurrentRadioStation;
    private int soundVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

//    public void setToMaxVolume(){
//        soundVolume=10;
//    }
//
//    public void setToMinVolume(){
//        soundVolume=0;
//    }

    public void nextStation() {
        if (numberCurrentRadioStation >= maxStation) {
            setNumberCurrentRadioStation(minStation);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (numberCurrentRadioStation <= minStation) {
            setNumberCurrentRadioStation(maxStation);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation - 1);
        }
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > maxStation) {
            newNumberCurrentRadioStation = 0;
        }
        if (newNumberCurrentRadioStation < minStation) {
            newNumberCurrentRadioStation = 9;
        }
        this.numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < minVolume) {
            return;
        }
        if (soundVolume > maxVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > minVolume) {
            soundVolume--;
        }
    }
}


