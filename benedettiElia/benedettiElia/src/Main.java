import java.io.*;
public class Main {
    public static void main(String[] args) {

        Square quad1 = new Square();
        Square quad2 = new Square();
        Square quad3 = new Square();
        Square quad4 = new Square();

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int x;
        int y;
        int lato;

        //inizializzazine primo quadrato
        System.out.println(" inserire cordinata x del quadrato1 ");
        try {
            x = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire cordinata y del quadrato1 ");
        try {
            y = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire lunghezza lato del quadrato1 ");
        try {
            lato = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        quad1=new Square(x,y,lato);


        //inizializzazine secondo quadrato
        System.out.println(" inserire cordinata x del quadrato2 ");
        try {
            x = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire cordinata y del quadrato2 ");
        try {
            y = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire lunghezza lato del quadrato2 ");
        try {
            lato = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        quad2=new Square(x,y,lato);


        //inizializzazine terzo quadrato
        System.out.println(" inserire cordinata x del quadrato3 ");
        try {
            x = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire cordinata y del quadrato3 ");
        try {
            y = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire lunghezza lato del quadrato3 ");
        try {
            lato = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        quad3=new Square(x,y,lato);


        //inizializzazine quarto quadrato
        System.out.println(" inserire cordinata x del quadrato4 ");
        try {
            x = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire cordinata y del quadrato4 ");
        try {
            y = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(" inserire lunghezza lato del quadrato4 ");
        try {
            lato = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        quad4=new Square(x,y,lato);


        //inizializzazione del punto sul piano
        Point punto1 = new Point();

        System.out.println(" inserisci le cordinate del punto: ");
        try {
            x = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            y = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        punto1 = new Point(x,y);


        //spostiamo il punto sul piano cartesiano
        System.out.println(" inserire i valori (x e y) che indicano di quanto si vuole spostare il punto: ");
        try {
            x = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            y = Integer.parseInt(keyboard.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //verifa del punto spostato
        boolean controllo=punto1.spostaX(x);
        if(!controllo){
            System.out.println("il punto è fuori dal piano cartesiano");
        }
        controllo= punto1.spostaY(y);
        if(!controllo){
            System.out.println("il punto è fuori dal piano cartesiano");
        }


        Boolean verifica;
        //verifica se il punto è dentro al primo quadrato
        verifica = quad1.verificaPuntDentroQuad(x,y);
        if(verifica){
            System.out.println(" il punto è dentro al primo quadrato ");
        }
        else{
            System.out.println(" il punto non è dentro al primo quadrato ");
        }//if

        //verifica se il punto è dentro al secondo quadrato
        verifica = quad2.verificaPuntDentroQuad(x,y);
        if(verifica){
            System.out.println(" il punto è dentro al secondo quadrato ");
        }
        else{
            System.out.println(" il punto non è dentro al secondo quadrato ");
        }//if

        //verifica se il punto è dentro al terzo quadrato
        verifica = quad3.verificaPuntDentroQuad(x,y);
        if(verifica){
            System.out.println(" il punto è dentro al terzo quadrato ");
        }
        else{
            System.out.println(" il punto non è dentro al terzo quadrato ");
        }//if

        //verifica se il punto è dentro al quarto quadrato
        verifica = quad4.verificaPuntDentroQuad(x,y);
        if(verifica){
            System.out.println(" il punto è dentro al quarto quadrato ");
        }
        else{
            System.out.println(" il punto non è dentro al quarto quadrato ");
        }//if

    }
}