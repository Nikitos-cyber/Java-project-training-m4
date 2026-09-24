package StreetFighter;

import java.util.*;
public class Main {


   public static String[][] fighters = new String[][]{
            new String[] {       "",    "Ryu",  "E.Honda",  "Blanka",   "Guile", ""      },
            new String[] { "Balrog",    "Ken",  "Chun Li", "Zangief", "Dhalsim", "Sagat" },
            new String[] {   "Vega", "T.Hawk", "Fei Long",  "Deejay",   "Cammy", "M.Bison"      },
    };



    public static void main(String[] args) {
        String[] moves = new String[] { };
        int[] position = new int[] {0,1};


        System.out.println(superStreetFighterize(fighters,position,moves).length);
    }

    public static String[] superStreetFighterize(String[][] fighters, int[] position, String[] moves) {
        if(moves.length == 0)
        return new String[]{};

     StringBuilder resultCommand = new StringBuilder();
     int[] newPosition = Arrays.copyOf(position,position.length);

     for(int i = 0; i < moves.length; ++i){

          changePosition(newPosition,i,fighters,moves);
         resultCommand.append(fighters[newPosition[0]][newPosition[1]]);
         resultCommand.append(",");
     }

        return resultCommand.toString().split(",");
    }


    private static int checkNotEmpty(int x, int[] position, String [][] fighters){

        do {

            if(position[1] + x >= fighters[position[0]].length)
                position[1] = -1;
            else if(position[1] + x < 0)
                position[1] = fighters[position[0]].length;
            position[1] += x;
        }while(fighters[position[0] ][position[1]].isEmpty() && x != 0);

        return position[1];
    }

    private static  void changePosition(int[] newPosition,int index, String[][] fighters, String[] moves){
        switch ( moves[index]){
            case "right":
                    newPosition[1] = checkNotEmpty(1,newPosition,fighters);
                break;
            case "left":
                    newPosition[1] = checkNotEmpty(-1,newPosition,fighters);
                break;
            case "up":
                if((0 <= (newPosition[0] - 1))  && !fighters[newPosition[0] - 1][newPosition[1]].isEmpty())
                    newPosition[0] -= 1;
                break;
            case "down":
                if(( fighters.length > (newPosition[0] + 1))  && !fighters[newPosition[0] + 1][newPosition[1]].isEmpty())
                    newPosition[0] += 1;
                break;
        }
    }





}