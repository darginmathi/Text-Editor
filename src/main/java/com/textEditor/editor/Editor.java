package com.textEditor.editor;

import java.util.ArrayList;
import java.util.List;

public class Editor
{
    private List<StringBuilder> buffer;
    private int currentLine;
    private int currentColumn;

    public Editor()
    {
        this.buffer = new ArrayList<>();
        this.currentLine = 0;
        this.currentColumn = 0;
    }


}

