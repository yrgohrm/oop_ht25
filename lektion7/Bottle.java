public class Bottle {
    private int volumeInMillilitres;

    public Bottle() {
        this.volumeInMillilitres = 0;
    }

    public int getVolume() {
        return volumeInMillilitres;
    }

    public void setVolume(int volumeInMl) {
        if (volumeInMl <= 500) {
            this.volumeInMillilitres = volumeInMl;
        }
    }
}
