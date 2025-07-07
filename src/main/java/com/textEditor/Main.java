package com.textEditor;

import com.textEditor.editor.Editor;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.util.Scanner;

import static com.textEditor.io.FileManager.saveToFile;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Editor editor = new Editor();
        try
        {
            Terminal terminal = TerminalBuilder.builder().system(true).build();
            LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();
            while (true)
            {
                String line = reader.readLine(">");

                if ("exit".equalsIgnoreCase(line))
                {
                    break;
                }
            }
        }
        catch (IOException e)
        {
            System.err.println("Error creating Terminal: "e.getMessage());
        }
    }
}