/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_array;
/**
 *
 * @author S62993
 */

public class Activity5 {

    public static void main(String[] args) {

        // 2D array: [month][0 = high, 1 = low]
        double[][] temp = {
            {33, 25}, {34, 26}, {35, 27}, {36, 28},
            {35, 27}, {34, 26}, {33, 25}, {33, 25},
            {32, 24}, {31, 23}, {30, 22}, {29, 21}
        };

        double sumHigh = 0;
        double sumLow = 0;

        double highest = temp[0][0];
        double lowest = temp[0][1];

        // Process data
        for (int i = 0; i < temp.length; i++) {
            sumHigh += temp[i][0];
            sumLow += temp[i][1];

            if (temp[i][0] > highest) {
                highest = temp[i][0];
            }

            if (temp[i][1] < lowest) {
                lowest = temp[i][1];
            }
        }

        double avgHigh = sumHigh / temp.length;
        double avgLow = sumLow / temp.length;

        // Output
        System.out.println("Average High Temperature = " + avgHigh);
        System.out.println("Average Low Temperature  = " + avgLow);
        System.out.println("Highest Temperature of the Year = " + highest);
        System.out.println("Lowest Temperature of the Year  = " + lowest);
    }
}
