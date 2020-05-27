package com.company;

public class arraythree {public  static  void main(String[]args){
    int[][][] arr={
            {
                    {345,687,473},
                    {56,97,23},
                    {56,87,906}
            },
            {
                    {389,437,323},
                    {376,987,453},
                    {567,659,42}
            },
    };

    int i=0;
    while(i<=1){
        int j=0;
        while(j<=2){
            int k=0;
            while(k<=2){

                System.out.println(arr[i][j][k]);
                k++;
            }
            j++;
        }
        i++;
    }

}

}
