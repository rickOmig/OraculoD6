package main;

/**
 * Metodos
 */

import java.util.Random;
import java.util.Scanner;


public class Metodos {


    public static int d6 ( ){
        Random roll = new Random();
        int d = roll.nextInt(1,6);
        return d;
    }

    public static void oraculoSimplesI(int d){
        String[] OSI = new String[7];
        String msg = "";

        OSI[0] = "---------------------------------\n";
        OSI[0] += "      Oráculo Simples I\n";
        OSI[0] += "---------------------------------\n";
        OSI[1] = "NÃO\n";
        OSI[2] = "NÃO\n";
        OSI[3] = "NÃO\n";
        OSI[4] = "SIM\n";
        OSI[5] = "SIM\n";
        OSI[6] = "SIM\n";
        
        
 
        for(int x = 0; x<=6 ; x++){
            msg += OSI[x];
        }
        msg += "---------------------------------\n";
        msg += "Resultado: \n";
        msg += "Dado:" +d+"\n";
        msg += "R:" +OSI[d]+"\n";
        msg += "---------------------------------\n";

        System.out.print(msg);
    }


    public static void oraculoSimplesII(int d){
        String[] OSI = new String[7];
        String msg = "";

        OSI[0] = "---------------------------------\n";
        OSI[0] += "      Oráculo Simples II\n";
        OSI[0] += "---------------------------------\n";
        OSI[1] = "NÃO, e...\n";
        OSI[2] = "NÃO\n";
        OSI[3] = "NÃO, mas...\n";
        OSI[4] = "SIM, mas...\n";
        OSI[5] = "SIM\n";
        OSI[6] = "SIM, e....\n";
        
        
 
        for(int x = 0; x<=6 ; x++){
            msg += OSI[x];
        }
        msg += "---------------------------------\n";
        msg += "Resultado: \n";
        msg += "Dado:" +d+"\n";
        msg += "R:" +OSI[d]+"\n";
        msg += "---------------------------------\n";

        System.out.print(msg);
    }



    public static void BancoDados( ){
        int cordX = d6();
        int cordY = d6();
        String msg = "";

        String[][] coordenadas = new String[7][7];

        coordenadas[1][6] = " Goblin            ";            coordenadas[1][1] = " Esqueleto         ";
        coordenadas[2][6] = " Rato Gigante      ";            coordenadas[2][1] = " Morcego           ";
        coordenadas[3][6] = " Slime             ";            coordenadas[3][1] = " Aranha            ";
        coordenadas[4][6] = " Kobold            ";            coordenadas[4][1] = " Górgona           ";
        coordenadas[5][6] = " Duende            ";            coordenadas[5][1] = " Vampiro           ";
        coordenadas[6][6] = " Rato Infernal     ";            coordenadas[6][1] = " Lich              ";


        coordenadas[1][2] = " Zumbi             ";           coordenadas[1][3] = " Orc               ";
        coordenadas[2][2] = " Lobisomem         ";           coordenadas[2][3] = " Troll             "; 
        coordenadas[3][2] = " Fantasma          ";           coordenadas[3][3] = " Ciclope           "; 
        coordenadas[4][2] = " Múmia             ";           coordenadas[4][3] = " Gigante           "; 
        coordenadas[5][2] = " Medusa            ";           coordenadas[5][3] = " Dragão Negro      ";
        coordenadas[6][2] = " Espectro          ";           coordenadas[6][3] = " Balrog            "; 

          
        coordenadas[1][4] = " Minotauro         ";           coordenadas[1][5] = " Dragão            ";
        coordenadas[2][4] = " Quimera           ";           coordenadas[2][5] = " Kraken            ";
        coordenadas[3][4] = " Hidra             ";           coordenadas[3][5] = " Cthulhu           ";
        coordenadas[4][4] = " Golem             ";           coordenadas[4][5] = " Behemoth          ";
        coordenadas[5][4] = " Demônio           ";           coordenadas[5][5] = " Leviatã           ";
        coordenadas[6][4] = " Asura             ";           coordenadas[6][5] = " Deus dos Monstros ";

        coordenadas[0][1] = "  1  ";                          coordenadas[1][0] = "          1        ";
        coordenadas[0][2] = "  2  ";                          coordenadas[2][0] = "          2        ";
        coordenadas[0][3] = "  3  ";                          coordenadas[3][0] = "          3        ";
        coordenadas[0][4] = "  4  ";                          coordenadas[4][0] = "          4        ";
        coordenadas[0][5] = "  5  ";                          coordenadas[5][0] = "          5        ";
        coordenadas[0][6] = "  6  ";                          coordenadas[6][0] = "          6        ";

        coordenadas[0][0] = "d6.d6";



        msg += "--------------------------------------------------------------------------------------------------------------------------------\n";
        msg += "                                                  Banco de Monstros\n";
        msg += "--------------------------------------------------------------------------------------------------------------------------------\n";



       for(int y = 0; y <= 6; y++){
            for(int x =0; x<= 6; x++){
                msg += coordenadas[x][y] +"|";
            }
            msg += "\n";
       }

        msg += "--------------------------------------------------------------------------------------------------------------------------------\n";

        System.out.print(msg);
        System.out.print("Resultado: " +coordenadas[cordX][cordY]+ "\n");

        System.out.print("--------------------------------------------------------------------------------------------------------------------------------\n");
    }
}