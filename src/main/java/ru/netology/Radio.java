package ru.netology;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel;
    private int upVolume;
    private int downVolume;
    private int upChannel;
    private int downChannel;

    public int getUpVolume() {
        return upVolume;
    }

    public void setUpVolume(int upVolume) {
        upVolume = currentVolume + 1;
        this.upVolume = upVolume;
    }

    public int getDownVolume() {
        return downVolume;
    }

    public void setDownVolume(int downVolume) {
        downVolume = currentVolume - 1;
        this.downVolume = downVolume;
    }

    public int getUpChannel() {
        return upChannel;
    }

    public void setUpChannel(int upChannel) {
        upChannel = currentChannel + 1;
        this.upChannel = upChannel;
    }

    public int getDownChannel() {
        return downChannel;
    }

    public void setDownChannel(int downChannel) {
        downChannel = currentChannel - 1;
        this.downChannel = downChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            currentChannel = minChannel;
        }
        if (currentChannel < minChannel) {
            currentChannel = maxChannel;
        }
        this.currentChannel = currentChannel;
    }

    public void setDownVolume() {
    }

    public void setUpVolume() {
    }
}


