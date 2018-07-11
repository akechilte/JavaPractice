package com.puzzle;

/**
 * Created by mbiswas on 6/7/18.
 */

//Problem: https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/
public class TowerOfHanoi {


    public static void towerofhanoi(int n, char from_road, char to_rod , char help_rod){
        if(n == 1){
            System.out.println("Move Disc 1 from " +from_road +" to " +to_rod);
            return;
        }

        towerofhanoi(n-1 , from_road, help_rod , to_rod);
        System.out.println("Move Disc " +n +" from " +from_road +" to " +to_rod);
        towerofhanoi(n-1, help_rod, to_rod, from_road);
    }

    public static void main(String[] args) {

        towerofhanoi(3, 'A', 'C', 'B');

    }
}
