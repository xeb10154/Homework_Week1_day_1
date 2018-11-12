public class WaterBottle {

    private int maxVolume;
    private int volume;

    public WaterBottle(int maxVolume){
        this.maxVolume = maxVolume;
        this.volume = this.maxVolume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drinkWater(){
        this.volume -= 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void fillBottle(){
        this.volume = this.maxVolume;
    }
}
