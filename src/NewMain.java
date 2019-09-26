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
        double[][] a = {    {1,2,3,4},
                            {2,1,2,3},
                            {3,2,1,2},
                            {4,3,2,1}  
                        };
        metodoEliminacaoGauss(a);
        //imprimi(a);
    }
    
    
    public static int[] metodoEliminacaoGauss(double[][] a) {
        double pivo;
        for(int etapa = 0; etapa < a.length; etapa++) {
            for(int i = 1; i < a.length; i++) {
                for(int j = 0; j < a[i].length; j++) {
                    pivo = a[etapa][i];
                    if(pivo != 0) {
                       pivo = pivo/a[i-1][j-j];
                       a[i][j] = a[i][j] - pivo * a[i-1][j];
                       System.out.print(a[i][j] + "   ");
                    }
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
