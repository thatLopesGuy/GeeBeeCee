package com.github.thatlopesguy.internals.cpu.registers;

/**
 * Created by thatLopesGuy on 28/01/2018.
 */
public class Register {
    private short register = 0;
    private String registerName;

    public void incrementRegisterHi(){
        setRegHi((byte)(getRegHi()+1));
    }
    public void incrementRegisterLo(){
        setRegLo((byte)(getRegLo()+1));
    }
    public void incrementRegister(){
        register+=1;
    }

    public void decrementRegisterHi(){
        setRegHi((byte)(getRegHi()-1));
    }

    public void decrementRegisterLo(){
        setRegLo((byte)(getRegLo()-1));
    }

    public void decrementRegister(){
        register-=1;
    }

    public byte getRegHi() {
        return (byte) (register & 0xff);
    }

    public byte getRegLo() {
        return (byte) ((register >> 8) & 0xff);
    }

    public short getRegister() {
        return register;
    }

    public short nextByte(){
        incrementRegister();
        return register;
    }

    public void setRegHi(byte value) {
        short regVal = (short) value;
        regVal <<= 8;
        register = (short) (regVal | getRegLo());
    }

    public void setRegLo(byte value) {
        short regVal = (short) getRegHi();
        regVal <<= 8;
        register = (short) (regVal | value);
    }

    public void setRegister(short value) {
        register = value;
    }

    public Register(String registerName) {
        this.registerName = registerName;
    }
}
