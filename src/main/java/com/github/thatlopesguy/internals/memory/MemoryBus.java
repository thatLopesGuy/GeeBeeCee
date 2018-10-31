package com.github.thatlopesguy.internals.memory;

/**
 * Created by thatLopesGuy on 26/01/2018.
 */
public class MemoryBus {

    private static final int ADDRESS_SIZE = 0xFFFF;

    private int[] bus_rb0 = new int[0x4000];    //0000-3FFF
    private int[] bus_rb1 = new int[0x4000];    //4000-7FFF
    private int[] bus_vram = new int[0x2000];    //8000-9FFF
    private int[] bus_extRam = new int[0x2000];  //A000-BFFF
    private int[] bus_wrb0 = new int[0x1000];    //C000-CFFF
    private int[] bus_wrb1 = new int[0x1000];    //D000-DFFF
    private int[] bus_echo = new int[0x1E00]; //E000-FDFF
    private int[] bus_oam = new int[0xA0];  //FE00-FE9F
    private int[] bus_unused = new int[0x60];    //FEA0-FEFF
    private int[] bus_ioPorts = new int[0x80];   //FF00-FF7F
    private int[] bus_hram = new int[0x7F];   //FF80-FFFE
    private int[] bus_interuptEnableRegister = new int[0x1]; //FFFF


    public int readByte(int address){
        //todo
        return 0;
    }

    public void writeByte(int address, int value){
        //todo
    }
}
