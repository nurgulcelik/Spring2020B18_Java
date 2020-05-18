package tests;

public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on=false;
    String brand="undefined";
    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }
    public TV(String brand){
        System.out.println("Creating TV object  using 1 arg - constructor");
    }
    public int getVolumeLevel(){
        return volumeLevel;
    }public void setVolumeLevel(int volumeLevel){
        this.volumeLevel=volumeLevel;

    }public int getChannel(){

        return channel;
    }public void setChannel(int channel){
        this.channel=channel;


    }public String getBrand(){
        return brand;
    }public void setBrand(String brand){
        this.brand=brand;
    }
    public void channelUp(){
        volumeLevel +=1;
    }
    public void channelDown(){
        volumeLevel -=1;
    }
    public void turnOn(){
        if(on){
            System.out.println("TV is already ON");
        }
    }
    public void turnOff(){
        if(on){
            System.out.println("TV is already OFF");
        }
    }
    public void volumeUp(){
        volumeLevel +=1;
    }
    public void volumeDown(){
        volumeLevel -=1;
    }
    public void isOn(int channel,int volumeLevel) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        if (!((volumeLevel > 1) || !(volumeLevel < 7))) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }
}
