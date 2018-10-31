package com.github.thatlopesguy;


import com.github.thatlopesguy.externals.Cartridge;
import com.github.thatlopesguy.internals.memory.MemoryBus;
import com.github.thatlopesguy.internals.cpu.LR35902;
import com.github.thatlopesguy.internals.display.LcdDisplay;

import javax.swing.*;

/**
 * Entry point to GBC emulator
 * <p>
 * Created by thatLopesGuy on 25/01/2018.
 */
public class GameBoyColour {
    private static LR35902 cpu;
    private static LcdDisplay display;
    private static MemoryBus memoryBus;
    private static Cartridge cartridge;
    private static JFrame gui;

    public static void main(String[] args) {
        init(args);
    }

    private static void init(String[] args) {
        //cartridge = new Cartridge(args[0]);
        memoryBus = new MemoryBus();
        cpu = new LR35902();
        display = new LcdDisplay();

        initGui();

        startEmu();
    }

    private static void initGui() {
        gui = new JFrame("GeeBeeCee");
        gui.pack();
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setVisible(true);

    }

    private static void startEmu(){
        while(true) {
            //get input
            //process
            //sound
            display.paintPanel(gui.getGraphics());
        }
    }

}
