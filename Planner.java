/**
 * Created by KataMar on 10/11/17.
 */




import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Planner {



        public static void main(String [] args){

            //create an initial state for the game
          Environment init_state = new Environment();
            init_state.init_Environmet();


            Block a = new Block('a', 0, 0, true);
            Block b = new Block('b', 0, 1,false);
            Block c = new Block('c', 0, 2,false);
            init_state.create(a,b,c);



    //print the init state
            System.out.println("Print the init state: ");
            for(int i = 0; i<3; i++){
                for(int j = 0; j < 3; j++){
                        init_state.get_block(i, j).print_block();
                }
                System.out.println();
            }

            System.out.println();

            //create a goal state
            Environment goal_state = new Environment();
            goal_state.init_Environmet();


            Block a2 = new Block('a', 2, 0, true);
            Block b2 = new Block('b', 2, 1,false);
            Block c2 = new Block('c', 2, 2,false);
            goal_state.create(a2,b2,c2);

            //print the goal state
            System.out.println("Print the goal state: ");
            for(int i = 0; i<3; i++){
                for(int j = 0; j < 3; j++){
                        goal_state.get_block(i, j).print_block();
                }
                System.out.println();
            }
            System.out.println();


            //make a current state world
            Environment current_state = new Environment();
            current_state.init_Environmet();
            for(int i = 0; i<3; i++){
                for(int j = 0; j < 3; j++){
                    current_state.change_block(init_state.get_block(i,j),i,j);

                }
            }
            //print the current state:
            System.out.println("Print the current state: ");
            for(int i = 0; i<3; i++){
                for(int j = 0; j < 3; j++){
                    current_state.get_block(i, j).print_block();

                }
                System.out.println();
            }


            //now start the actual game
            current_state.move_block(a, 1 ,1);

            //print the current state:
            System.out.println("Print the current state: ");
            for(int i = 0; i<3; i++){
                for(int j = 0; j < 3; j++){
                        current_state.get_block(i, j).print_block();

                }
                System.out.println();
            }










        }

}
