package org.example;


import org.example.workshop.Tool;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    public void start()   {
        Tool tool1 = new Tool("pila");
        tool1.useTool();

        Tool tool2 = new Tool("mlotek");

        List<Tool> tools = new ArrayList<>();
        tools.add(tool1);
        tools.add(tool2);

        for (Tool tool : tools) {
            System.out.println("Narzedzie: " + tool.toolType);

        }
    }
}

