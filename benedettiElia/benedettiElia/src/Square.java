public class Square {
    //attributi
    private int x;
    private int y;
    private int lato;

    //metodi
    public Square(){
        x=0;
        y=0;
        lato=1;
    }//costruttore inizializzazione
    public Square(int x, int y ,int lato){
        if(x >= 0 && x <= 1000){
            this.x = x;
        }//ifX
        if(y >= 0 && y <= 1000) {
            this.y = y;
        }//ifY
        if(lato >= 0 && lato <= 1000){
            this.lato = lato;
        }//iflato
    }//costruttore

    public void spostaQuadratoX(int x1){
        x+=x1;
    }//metodo per spostare orizzontalmente (asse delle x) il quadrato
    public void spostaQuadratoY(int y1){
        y+=y1;
    }//metodo per spostare verticalmente (asse delle y) il quadrato

    public Boolean verificaPuntDentroQuad(int x1, int y1){
        if((x1 >= x) && (x1 <= x+lato) && (y1 >= y-lato) && (y1 <= y)){
            return true;
        }
        else return false;
    }

}
