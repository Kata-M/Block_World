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

public class Block {

        char c;
        int x_place;
        int y_place;
        boolean free;
        boolean occupied;


        public Block(char c, int x_place, int y_place, boolean free){
            this.c = c;
            this.x_place = x_place;
            this.y_place = y_place;
            this.free = free;
        }

        public void print_block(){

            System.out.print("["+this.c+"] ");


        }

        public void change_letter(char l){
            this.c = l;
        }

    public int get_x_place() {
        return x_place;
    };
    public int get_y_place() {
        return y_place;
    };





}
