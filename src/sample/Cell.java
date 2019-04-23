package sample;

public class Cell {

    private int livingNeighbours = 0;
    private boolean alive = false;

    public Cell() {
    }

    public void update(){

        if(!alive && livingNeighbours == 3){
            alive = true;
        } else alive = alive && livingNeighbours == 2 || livingNeighbours == 3;


    }

    public int getLivingNeighbours() {
        return livingNeighbours;
    }

    public void setLivingNeighbours(int livingNeighbours) {
        this.livingNeighbours = livingNeighbours;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
