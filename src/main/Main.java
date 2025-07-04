package main;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("T Editor:");
        System.out.println("\":w\"to save  \":x\"to exit");
        StringBuffer buffer = new StringBuffer();
        while(true)
        {
            String text = input.nextLine();
            if (text.equals(":w"))
            {
                try (FileWriter writer = new FileWriter("output.txt"))
                {
                    writer.write(buffer.toString());
                    System.out.println("Saving...");
                }
                catch (IOException e)
                {
                    System.out.println("Error saving File: " + e.getMessage());
                }
                return;
            }
            if (text.equals(":x"))
            {
                System.out.println("Exiting without saving...");
                return;
            }
            buffer.append(text).append(System.lineSeparator());
        }
    }
}
