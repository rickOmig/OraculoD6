package main;
import main.Metodos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos run = new Metodos();
        Scanner input = new Scanner(System.in);
        String msg = "";

        msg += "---------------------------------\n";
        msg += "            Menu\n";
        msg += "---------------------------------\n";
        msg += "[1] Oráculo Simples I\n";
        msg += "[2] Oráculo Simples II\n";
        msg += "[3] Banco de Dados\n";
        msg += "[0] Sair\n";
        msg += "---------------------------------\n";

        System.out.print(msg);
        System.out.print("cmd: "); int cmd = input.nextInt();
        System.out.print("---------------------------------\n");


        switch(cmd){
            case 1:
                run.oraculoSimplesI(run.d6());
            break;

            case 2:
                run.oraculoSimplesII(run.d6());
            break;

            case 3:
                run.BancoDados();
            break;

            case 0:
                System.exit(0);
            break;

        }


        
        
        
    }
}
