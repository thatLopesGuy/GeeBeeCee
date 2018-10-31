package com.github.thatlopesguy.internals.cpu.registers;

/**
 * Created by thatLopesGuy on 28/01/2018.
 */
public class Accumulator {
    private short register = 0;
    private String registerName;

    public void incrementRegister(){
        setRegister((byte)(getRegister()+1));
    }

    public void decrementRegister(){
        setRegister((byte)(getRegister()-1));
    }


    public byte getRegister() {
        return (byte) (register & 0xff);
    }

    public byte getFlags() {
        return (byte) ((register >> 8) & 0xff);
    }

    public short getZeroFlag(){
        return (short)(getFlags() & 0x0008);
    }

    public boolean getZeroFlagAsBoolean(){
        return shortFlagToBoolean(getZeroFlag());
    }

    public short getSubtractFlag(){
        return (short)(getFlags() & 0x0004);
    }

    public boolean getSubtractFlagAsBoolean(){
        return shortFlagToBoolean(getSubtractFlag());
    }

    public short getHalfCarryFlag(){
        return (short)(getFlags() & 0x0002);
    }

    public boolean getHalfCarryFlagAsBoolean(){
        return shortFlagToBoolean(getHalfCarryFlag());
    }

    public short getCarryFlag(){
        return (short)(getFlags() & 0x0001);
    }

    public boolean getCarryFlagAsBoolean(){
        return shortFlagToBoolean(getCarryFlag());
    }

    public void setRegister(byte value) {
        short regVal = (short) value;
        regVal <<= 8;
        register = (short) (regVal | getFlags());
    }

    public void setZeroFlag(boolean set){
        if(set){
           register = (short) (register | 0x0008);
        }else{
            register = (short) (register & 0xFFF7);
        }
    }

    public void setSubtractionFlag(boolean set){
        if(set){
            register = (short) (register | 0x0004);
        }else{
            register = (short) (register & 0xFFFB);
        }
    }

    public void setHalfCarryFlag(boolean set){
        if(set){
            register = (short) (register | 0x0002);
        }else{
            register = (short) (register & 0xFFFD);
        }
    }

    public void setCarryFlag(boolean set){
        if(set){
            register = (short) (register | 0x0001);
        }else{
            register = (short) (register & 0xFFFE);
        }
    }

    public Accumulator(String registerName) {
        this.registerName = registerName;
    }

    private boolean shortFlagToBoolean(short flag){
        if (flag == 0){
            return false;
        }else {
            return true;
        }
    }
}
