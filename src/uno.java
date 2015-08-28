public class uno {
    int SuperMatriz[][];
    int vect[];

    public uno(int dimension){
        SuperMatriz = new int[dimension][dimension];
        vect = new int[dimension];
    }
    public void datosM() {
        for (int f = 0; f < this.SuperMatriz.length; f++) {
            for (int c = 0; c < SuperMatriz[f].length; c++) {
                SuperMatriz[f][c]=(int)(Math.random()*7);
            }
        }
    }
    public void sumM(){
        int s = 0;
        for (int f=0; f<SuperMatriz.length; f++){
            for (int c=0; c<SuperMatriz.length; c++){
                s += SuperMatriz[f][c];
        }
            vect[f]=s;
            s=0;
    }
    }
    public void muestraSuperMatriz(){
        System.out.println("Super Matriz");
        for (int f=0; f<SuperMatriz.length; f++){
            for(int c=0; c<SuperMatriz[f].length; c++){
                System.out.printf(SuperMatriz[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("El Vector: ");
        for(int f=0; f<vect.length;f++){
            System.out.println(vect[f]+" ");
        }
    }
}