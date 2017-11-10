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


public class Environment {


        Block[][]	e;

        public void init_Environmet(){

            this.e = new Block[3][3];
        }

        public void create( Block a, Block b, Block c ){
                e[a.get_y_place()][a.get_x_place()] = a;
                e[b.get_y_place()][b.get_x_place()] = b;
                e[c.get_y_place()][c.get_x_place()] = c;
                for(int i = 0; i<3; i++){
                        for(int j = 0; j<3; j ++){
                                if(e[i][j] == null){

                                        e[i][j]=  new Block('.',i,j,false);

                                }
                        }
                }

        }

        public Block get_block(int i, int j){
               return  e[i][j];

        }
        public void change_block(Block block, int i, int j){
                this.e[i][j] = block;
        }


        public void move_block(Block current, int x, int y){
                e[x][y].change_letter(current.c);
                e[current.y_place][current.x_place].change_letter('.');
        }
        







}
