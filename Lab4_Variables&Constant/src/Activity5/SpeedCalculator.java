/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;
/**
 *
 * @author AFIQ HANIF
 */
import javax.swing.JOptionPane;

public class SpeedCalculator {

    public static void main(String[] args) {

        String distStr = JOptionPane.showInputDialog(
                "Enter distance in meters:");
        double distanceMeters = Double.parseDouble(distStr);

        String hoursStr = JOptionPane.showInputDialog(
                "Enter hours:");
        int hours = Integer.parseInt(hoursStr);

        String minutesStr = JOptionPane.showInputDialog(
                "Enter minutes:");
        int minutes = Integer.parseInt(minutesStr);

        String secondsStr = JOptionPane.showInputDialog(
                "Enter seconds:");
        int seconds = Integer.parseInt(secondsStr);

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        double speedMps = distanceMeters / totalSeconds;
        double speedKmph = (distanceMeters / 1000.0) / (totalSeconds / 3600.0);
        double speedMph = (distanceMeters / 1609.0) / (totalSeconds / 3600.0);

        String message =
                "Speed in meters per second = " + speedMps + "\n" +
                "Speed in kilometers per hour = " + speedKmph + "\n" +
                "Speed in miles per hour = " + speedMph;

        JOptionPane.showMessageDialog(null, message);
    }
}

