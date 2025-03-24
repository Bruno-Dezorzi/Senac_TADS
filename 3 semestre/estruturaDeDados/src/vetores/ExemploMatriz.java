/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

/**
 *
 * @author 10253
 */
public class ExemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat = new int[3][3];
        
        mat[0][0]=2;
        mat[0][1]=3;
        mat[0][2]=4;
        mat[1][0]=6;
        
        //fixando a linha e caminhando pela coluna
        for (int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(mat[i][j]);
            }
        }
        //fixando a coluna e caminhando pela linha
        for (int j =0;j<3;j++){
            for(int i=0;i<3;i++){
                System.out.println(mat[i][j]);
            }
        }
        
    }
    
}
