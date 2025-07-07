package com.textEditor.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager
{
    public  static void saveToFile(String fileName, StringBuffer buffer)
    {
        try (FileWriter writer = new FileWriter(fileName))
        {
            writer.write(buffer.toString());
            System.out.println("Saving...");
        }
        catch (IOException e)
        {
            System.out.println("Error saving File: " + e.getMessage());
        }
    }
}