/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] a = {    {1,2,3,4,10},
                            {2,1,2,3,7},
                            {3,2,1,2,6},
                            {4,3,2,1,5}  
                        };
        
        long[][] b = {{1,2,5,3,2},
                        {1,3,7,3,4},
                        {0,5,2,2,1},
                        {1,3,0,1,2},
                        {0,6,7,4,7},
                        };
        metodoEliminacaoGauss(a);
    }
    
    
    public static double[][] metodoEliminacaoGauss(double[][] a) {
        double pivo;
        double m;
        double[][] b;
        
        for(int etapa = 0; etapa < a.length-1; etapa++) {
            b = a;
            for(int i = 1+etapa; i < a.length; i++) {
                pivo = a[etapa][etapa];
                m = b[i][etapa] / pivo;
                for(int j = 0+etapa; j < a[i].length; j++) {
                    if(a[i][j] != 0) {
                        a[i][j] = b[i][j] - m * a[i-i+etapa][j];
                    }
                    System.out.print(a[i][j] + "   ");
                }
                System.out.println();
            }
            System.out.println("---------------------------");
        }
        
        imprimi(a);
        return null;
    }
    
    public static void imprimi(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
