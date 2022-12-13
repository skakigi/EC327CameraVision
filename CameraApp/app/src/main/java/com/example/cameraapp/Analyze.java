package com.example.cameraapp;


import java.io.BufferedReader;

import java.io.FileReader;

import java.util.ArrayList;

import java.util.List;

import java.io.File;
import java.io.IOException;
import android.graphics.Bitmap;

import android.graphics.BitmapFactory;
public class Analyze {
    public static double distance(int[] img, int[] ex) {
        //creates temp var for distance
        double dis = 0;
        //loops through and calulates index by index

        for (int i = 0; i < img.length; i++) {


                dis += Math.pow(img[i] - ex[i], 2);



        }

        dis = Math.sqrt(dis);


        return dis;

    }


//displays a joke about whatever is shown

    public String info(int dec) {

        if (dec == 0) {

            return "There is nothing in the screen!";

        } else if (dec == 1) {

            return "Why couldn't Bob the Builder eat the apple?... Because it was Adam's apple";

        } else if (dec == 2) {

            return "why do oranges wear sunblock?... Because they peel";

        } else if (dec == 3) {

            return "I am going bananas!... That's what I say to my bananas before I leave the house";

        } else if (dec == 4) {

            return "What happens to a fruit when it passes away?... It rests in peach";

        } else {

            return "Where do fruits go on vacation?... Pear-is";

        }

    }


//reads in a matrix from external file

    public static int[][] readMat(String fileName) throws IOException {

        // Create a list to hold the rows of the matrix

        List<int[]> rows = new ArrayList<>();



        // Open the file for reading
        String path = System.getProperty("user.dir");
        System.out.println("hi");
        System.out.println(path);
        BufferedReader reader = new BufferedReader(new FileReader(fileName));



        // Read each line from the file

        String line;

        while ((line = reader.readLine()) != null) {

            // Split the line by the comma separator

            String[] values = line.split(",");



            // Convert the values to integers and add them to the list of rows

            int[] row = new int[values.length];

            for (int i = 0; i < values.length; i++) {

                row[i] = Integer.parseInt(values[i]);

            }

            rows.add(row);

        }



        // Close the file

        reader.close();



        // Convert the list of rows to a 2D array

        return rows.toArray(new int[0][]);

    }


}

