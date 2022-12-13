package com.example.cameraapp;

public class makeGray {
    //grayscales an image
    public static void Grayscale(int[] matrix) {

        // Loop through the rows of the matrix

        for (int i = 0; i < matrix.length; i++) {


                // Get the RGB values for the current pixel

                int red = ((int) matrix[i] >> 16) & 0xff;

                int green = ((int) matrix[i] >> 8) & 0xff;

                int blue = (int)matrix[i] & 0xff;


                // Calculate the average of the RGB values

                int average = (red + green + blue) / 3;


                // Set the pixel to the grayscale value

                matrix[i] = (average << 16) | (average << 8) | average;


        }

    }

}
