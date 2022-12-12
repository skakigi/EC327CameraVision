import java.awt.Dimension;
import javax.swing.JFrame;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import jave.util.List;
import java.io.File;
import java.io.IOExceptions;
import javax.imageio.ImageIO;

public static int mat(String[] args) {
    // Read the file name from the command line
    String fileName = args[0];

    // Read the image file
    int width = 0;
    int height = 0;
    int[][] matrix = null;
    try {
        // Get the image dimensions
        File file = new File(fileName);
        width = ImageIO.read(file).getWidth();
       height = ImageIO.read(file).getHeight();

        // Create a matrix to hold the pixel values
        matrix = new int[height][width];

        // Loop through each pixel in the image and add its value to the matrix
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                matrix[y][x] = ImageIO.read(file).getRGB(x, y);
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
        return;
    }
    int nothing = 0;
    int apple = 1;
    int orange = 2;
    int banana = 3;
    int peach = 4;
    int pear = 5;
}

public double distance(int[][] img, int[][] ex){
    double dis = 0;
    for (int i = 0; i < matrix1.length; i++) {
        for (int j = 0; j < matrix1[0].length; j++) {
            distance += Math.pow(matrix1[i][j] - matrix2[i][j], 2);
        }
    }
    dis = Math.sqrt(dis);

    return dis;
} 

public String info(int dec){
    if (dec == 0){
        return "There is nothing in the screen!";
    } else if (dec == 1){

    }
}
    
