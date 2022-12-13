# EC327CameraVision
Team Name: Vision Space System
Andrew Nguyen, Sora Kakigi, Hugo Silmberg

This is an android app that is able to identify fruits using the androids camera. This app is meant for children education as, with future iterations, it may be able to identify any object and help children with understanding the world around them. The app takes the image and compares it to other example images in order to correctly identify what object is shown in the image captured. It then says what the object is.

Buildingn this project took 3 main parts, Calculating the average vectors for the test images, classifying the photo taken based on these average vectors, and the front end aspect of the app. Using MATLAB we used a matrix reader to read in the JPG files for the test cases and then used a second function to find the average vector for each pixel of the images. To transfer data between MATLAB and Java we created csv files from MATLAB to be exported to Java. In Java we classified the photoes taken from the camera depending on the average vector files and which they were closer to. Using Androids sources we learned how to do the front and backend aspects of the app to take the data we found and the data we needed to compare to from the photoes taken.
