package com.chainsys.miniproject.commonutil;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
public class LogManager {
    public static void logException(Exception ex, String source, String exMessage) {
        Calendar vCalendar = Calendar.getInstance();
        String logDate = vCalendar.get(Calendar.DATE) + "" + (vCalendar.get(Calendar.MONTH) + 1) + ""
                + vCalendar.get(Calendar.YEAR);
        String logDateTime = logDate + "" + vCalendar.get(Calendar.HOUR) + "" + vCalendar.get(Calendar.MINUTE);
        if (source == null) {
            source = "source not provided";
        }
        if (exMessage == null) {
            exMessage = "Custom message not provided";
        }
        String message = "Exception: " + logDateTime + " Message: " + ex.getMessage();
        message += "\n Source: " + source + " Custom message: " + exMessage + "\n";
        String fileName = "ExceptionMessages" + logDate + ".log";
        writeToFile(fileName, message);
    }

    public static void logException(Exception ex, String source) {
        Calendar vCalendar = Calendar.getInstance();
        String logDate = vCalendar.get(Calendar.DATE) + "" + (vCalendar.get(Calendar.MONTH) + 1) + ""
                + vCalendar.get(Calendar.YEAR);
        String logDateTime = logDate + "" + vCalendar.get(Calendar.HOUR) + "" + vCalendar.get(Calendar.MINUTE);
        if (source == null) {
            source = "source not provided";
        }
        String message = "Exception: " + logDateTime + " Message: " + ex.getMessage();
        message += "\n Source: " + source + "\n";
        String fileName = "ExceptionMessages" + logDate + ".log";
        writeToFile(fileName, message);
    }
	private static void writeToFile(String fileName,String message) {
		fileName = "D://LogManager//" + fileName + ".txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, true);
            fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
	}


}
