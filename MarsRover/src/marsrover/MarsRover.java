
package marsrover;

import java.util.*;
import java.util.Scanner;
public class MarsRover {

    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        int X = 0, Y = 0, tamX, tamY, test;
            String direção, instruções;
            
            tamX = read.nextInt();
            tamY = read.nextInt();

            while(true)
            {            
                test = 0;
                X = read.nextInt();
                Y = read.nextInt();
                direção = read.next().toUpperCase();
                instruções = read.next().toUpperCase();
                char[] vetInstr = new char[instruções.length()]; 

                for (int i = 0; i < instruções.length(); i++)
                {
                    vetInstr[i] = (instruções.charAt(i));

                    if("N".equals(direção))
                    {
                        if(vetInstr[i] == 'L')
                        {
                            direção = "W";
                        }
                        else
                        if(vetInstr[i] == 'R')
                        {
                            direção = "E";
                        }
                        else
                        if(vetInstr[i] == 'M')
                        {
                            Y++;
                        }
                    }
                    else
                    if ("W".equals(direção))
                    {
                        if (vetInstr[i] == 'L')
                        {
                            direção = "S";
                        }
                        else
                        if (vetInstr[i] == 'R')
                        {
                            direção = "N";
                        }
                        else
                        if (vetInstr[i] == 'M')
                        {
                            X--;
                        }
                    }
                    else
                    if ("E".equals(direção))
                    {
                        if (vetInstr[i] == 'L')
                        {
                            direção = "N";
                        }
                        else
                        if (vetInstr[i] == 'R')
                        {
                            direção = "S";
                        }
                        else
                        if (vetInstr[i] == 'M')
                        {
                            X++;
                        }
                    }
                    else
                    if ("S".equals(direção))
                    {
                        if (vetInstr[i] == 'L')
                        {
                            direção = "E";
                        }
                        else
                        if (vetInstr[i] == 'R')
                        {
                            direção = "W";
                        }
                        else
                        if (vetInstr[i] == 'M')
                        {
                            Y--;
                        }
                        if((X < 0) || (X > tamX) || (Y < 0) || (Y > tamY))
                        {
                            test = 1;
                        }
                    }
                }
                if((X < 0) || (X > tamX) || (Y < 0) || (Y > tamY) || test == 1)
                {
                    System.out.println("Valor ultrapassou ou está fora dos limites da Matriz");
                    System.out.println(X + " " + Y + " " + direção + "\n");
                }
                else
                {
                    System.out.println(X + " " + Y + " " + direção + "\n");
                }                
            }
    }
    
}