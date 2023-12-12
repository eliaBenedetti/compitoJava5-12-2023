public class Point {
    //attributi
    private int x;
    private int y;

    //meodi
    public Point(){
        x=0;
        y=0;
    }//costruttore inizializzazione

    public Point(int x, int y){
        if(x >= 0 && x<= 1000 ) {
            this.x = x;
        }//ifX
        if(y >= 0 && y <= 1000){
            this.y = y;
        }//ifY
    }//costruttore

    public boolean spostaX(int x1) {
        x += x1;
        if (x >= 0 && x <= 1000) {
            return true;
        } else {
            return false;

        }
    }//spostaX

    public boolean spostaY(int y1){
        y += y1;
        if (y >= 0 && y <= 1000) {
            return true;
        } else {
            return false;
        }
    }//spostaY

}


