package com.textEditor;

import java.util.Scanner;

import static com.textEditor.io.FileManager.saveToFile;

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
                String temp;
                if (args.length == 0)
                {
                    temp  = "untitled";
                }
                else
                {
                    temp = args[0].trim();
                }
                String fileName = temp + ".txt";
                saveToFile(fileName, buffer);
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
