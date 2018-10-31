package com.github.thatlopesguy.internals.cpu;

import com.github.thatlopesguy.internals.cpu.registers.Accumulator;
import com.github.thatlopesguy.internals.cpu.registers.Register;

/**
 * Created by thatLopesGuy on 28/01/2018.
 */
class InstructionExecutorService {
    static void nop() {
        //No operation
    }

    static void load16BitValueToRegister(Register register, short value) {
        register.setRegister(value);
    }

    static void loadAccumulatorToRegisterMemoryAddress(Register register, Accumulator accumulator) {
//todo
    }

    static void incrementRegister(Register register) {
        register.incrementRegister();
    }

    static void incrementRegisterHi(Register register) {
        register.incrementRegisterHi();
    }

    static void decrementRegisterHi(Register register) {
        register.decrementRegisterHi();
    }

    static void load8BitToRegisterHi(Register register, int value) {
        register.setRegHi((byte) (value & 0xFF));
    }

    static void rotateAccumulatorLeftThroughCarry(Accumulator accumulator) {
        short firstAccumulatorBit = (short) (accumulator.getRegister() & 0x08);
        boolean set = false;
        if (firstAccumulatorBit > 0) {
            set = true;
            accumulator.setRegister((byte) (accumulator.getRegister() << 1 | 0x01));
        } else {
            accumulator.setRegister((byte) (accumulator.getRegister() << 1));
        }
        accumulator.setCarryFlag(set);
    }

    static void loadRegisterToMemoryAddress(Short address, Register register) {
        //todo
    }

    static void addRegisterToRegister(Register register, Register additional) {
        register.setRegister((short) (register.getRegister() + additional.getRegister()));
    }

    static void loadRegisterMemoryAddressToAccumulator(Accumulator accumulator, Register register) {
//        accumulator.setRegister(register.getRegister()); todo read from mem
    }

    static void decrementRegister(Register register) {
        register.decrementRegister();
    }

    static void incrementRegisterLo(Register register) {
        register.incrementRegisterLo();
    }

    static void decrementRegisterLo(Register register) {
        register.decrementRegisterLo();
    }

    static void load8BitToRegisterLo(Register register, int value) {
        register.setRegLo((byte) (value & 0xFF));
    }

    static void rotateAccumulatorRightThroughCarry(Accumulator accumulator) {
        short lastAccumulatorBit = (short) (accumulator.getRegister() & 0x01);
        boolean set = false;
        if (lastAccumulatorBit > 0) {
            set = true;
            accumulator.setRegister((byte) (accumulator.getRegister() >> 1 | 0x80));
        } else {
            accumulator.setRegister((byte) (accumulator.getRegister() >> 1));
        }
        accumulator.setCarryFlag(set);
    }

    static void stop(int value) {
        //todo
    }

    static void rotateAccumulatorLeft(Accumulator accumulator) {
        short firstAccumulatorBit = (short) (accumulator.getRegister() & 0x08);
        boolean set = false;
        if (firstAccumulatorBit > 0) {
            set = true;
        }

        if (accumulator.getCarryFlag() > 0) {
            accumulator.setCarryFlag(set);
            accumulator.setRegister((byte) (accumulator.getRegister() << 1 | 0x01));
        } else {
            accumulator.setCarryFlag(set);
            accumulator.setRegister((byte) (accumulator.getRegister() << 1));
        }
    }

    static void jumpRelative(Register register, short value) {
        register.setRegister((short) (register.getRegister() + value));
    }

    static void rotateAccumulatorRight(Accumulator accumulator) {
        short lastAccumulatorBit = (short) (accumulator.getRegister() & 0x01);
        boolean set = false;
        if (lastAccumulatorBit > 0) {
            set = true;
        }

        if (accumulator.getCarryFlag() > 0) {
            accumulator.setCarryFlag(set);
            accumulator.setRegister((byte) (accumulator.getRegister() >> 1 | 0x80));
        } else {
            accumulator.setCarryFlag(set);
            accumulator.setRegister((byte) (accumulator.getRegister() >> 1));
        }
    }

    static void jumpRelativeNegativeCondition(Register register, short flag, short value) {
        if (flag == 0) {
            register.setRegister((short) (register.getRegister() + value));
        }
    }

    static void decimalAdjustAccumulator(Accumulator accumulator) {
        //todo
    }

    static void jumpRelativeCondition(Register register, short flag, short value) {
        if (flag != 0) {
            register.setRegister((short) (register.getRegister() + value));
        }
    }

    static void loadRegisterMemoryAddressToAccumulatorIncrement(Accumulator accumulator, Register register) {
//        accumulator.setRegister(register.getRegister()); todo read from mem
        register.incrementRegister();
    }

    static void complement(Accumulator accumulator) {
        accumulator.setRegister((byte) (~accumulator.getRegister()));
    }

    static void loadAccumulatorToRegisterMemoryAddressDecrement(Register register, Accumulator accumulator) {
//todo
        register.decrementRegister();
    }

    static void incrementRegisterMemoryAddress(Register register) {
        //todo increase value at mem loc
    }

    static void decrementRegisterMemoryAddress(Register register) {
        //todo increase value at mem loc
    }

    static void load8BitToRegisterMemoryAddress(Register register) {
        //todo
    }

    static void setCarryFlag(Accumulator accumulator) {
        accumulator.setCarryFlag(true);
    }

    static void loadRegisterMemoryAddressToAccumulatorDecrement(Accumulator accumulator, Register register) {
//        accumulator.setRegister(register.getRegister()); todo read from mem
        register.decrementRegister();
    }

    static void incrementAccumulator(Accumulator accumulator) {
        accumulator.incrementRegister();
    }

    static void decrementAccumulator(Accumulator accumulator) {
        accumulator.decrementRegister();
    }

    static void load8BitToAccumulator(Accumulator accumulator, short value) {
        accumulator.setRegister((byte) value);
    }

    static void complementCarryFlag(Accumulator accumulator) {
        accumulator.setCarryFlag(!accumulator.getCarryFlagAsBoolean());
    }

    static void loadRegisterHiToRegisterHi(Register recipientRegister, Register valueRegister) {
        recipientRegister.setRegHi(valueRegister.getRegHi());
    }

    static void loadRegisterLoToRegisterHi(Register recipientRegister, Register valueRegister) {
        recipientRegister.setRegHi(valueRegister.getRegLo());
    }

    static void loadRegisterMemoryAddressToRegisterHi(Register recipientRegister, Register valueRegister) {
        //todo recipientRegister.setRegHi();
    }

    static void loadAccumulatorToRegisterHi(Register register, Accumulator accumulator) {
        register.setRegHi(accumulator.getRegister());
    }

    static void loadRegisterHiToRegisterLo(Register recipientRegister, Register valueRegister) {
        recipientRegister.setRegLo(valueRegister.getRegHi());
    }

    static void loadRegisterLoToRegisterLo(Register recipientRegister, Register valueRegister) {
        recipientRegister.setRegLo(valueRegister.getRegLo());
    }

    static void loadRegisterMemoryAddressToRegisterLo(Register recipientRegister, Register valueRegister) {
        //todo recipientRegister.setRegLo();
    }

    static void loadAccumulatorToRegisterLo(Register register, Accumulator accumulator) {
        register.setRegLo(accumulator.getRegister());
    }

    static void loadRegisterHiToRegisterMemoryAddress(Register recipientRegister, Register valueRegister) {
        //todo
    }

    static void loadRegisterLoToRegisterMemoryAddress(Register recipientRegister, Register valueRegister) {
        //todo
    }

    static void halt() {
        //todo
    }

    static void loadRegisterHiToAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister(register.getRegHi());
    }

    static void loadRegisterLoToAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister(register.getRegLo());
    }

    static void addRegisterHiToAccumulator(Accumulator accumulator ,Register register ) {
        accumulator.setRegister((byte) (accumulator.getRegister() + register.getRegHi()));
    }

    static void loadAccumulatorToAccumulator(Accumulator accumulator, Accumulator valueAccumulator) {
        accumulator.setRegister(accumulator.getRegister());
    }

    static void addRegisterLoToAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister((byte) (accumulator.getRegister() + register.getRegLo()));
    }

    static void addRegisterMemoryAddressToAccumulator(Accumulator accumulator, Register register) {
        //todo accumulator.setRegister((byte)(accumulator.getRegister() + register.getRegLo()));
    }

    static void addAccumulatorToAccumulator(Accumulator accumulator) {
        accumulator.setRegister((byte) (accumulator.getRegister() + accumulator.getRegister()));
    }

    static void addRegisterHiAndCarryToAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister((byte) (accumulator.getRegister() + accumulator.getCarryFlag() + register.getRegHi()));
    }

    static void addRegisterLoAndCarryToAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister((byte) (accumulator.getRegister() + accumulator.getCarryFlag() + register.getRegLo()));
    }

    static void addRegisterMemoryAddressAndCarryToAccumulator(Accumulator accumulator, Register register) {
        //todo accumulator.setRegister((byte)(accumulator.getRegister()+ accumulator.getCarryFlag() + register.getRegLo()));
    }

    static void addAccumulatorAndCarryToAccumulator(Accumulator accumulator) {
        accumulator.setRegister((byte) (accumulator.getRegister() + accumulator.getCarryFlag() + accumulator.getRegister()));
    }

    static void subRegisterHiFromAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister((byte) (accumulator.getRegister() - register.getRegHi()));
    }

    static void subRegisterLoFromAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister((byte) (accumulator.getRegister() - register.getRegLo()));
    }

    static void subRegisterMemoryAddressFromAccumulator(Accumulator accumulator, Register register) {
        //todo accumulator.setRegister((byte)(accumulator.getRegister() - register.getRegLo()));
    }

    static void subAccumulatorFromAccumulator(Accumulator accumulator) {
        accumulator.setRegister((byte) (accumulator.getRegister() - accumulator.getRegister()));
    }

    static void subRegisterHiAndCarryFromAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister((byte) (accumulator.getRegister() - accumulator.getCarryFlag() - register.getRegHi()));
    }

    static void subRegisterLoAndCarryFromAccumulator(Accumulator accumulator, Register register) {
        accumulator.setRegister((byte) (accumulator.getRegister() - accumulator.getCarryFlag() - register.getRegLo()));
    }

    static void subRegisterMemoryAddressAndCarryFromAccumulator(Accumulator accumulator, Register register) {
        //todo accumulator.setRegister((byte)(accumulator.getRegister()- accumulator.getCarryFlag() - register.getRegLo()));
    }

    static void subAccumulatorAndCarryFromAccumulator(Accumulator accumulator) {
        accumulator.setRegister((byte) (accumulator.getRegister() - accumulator.getCarryFlag() - accumulator.getRegister()));
    }

    static void andRegisterHi(Accumulator accumulator, Register register){
        accumulator.setRegister((byte)(accumulator.getRegister() & register.getRegHi()));
    }

    static void andRegisterLo(Accumulator accumulator, Register register){
        accumulator.setRegister((byte)(accumulator.getRegister() & register.getRegLo()));
    }

    static void andRegisterMemoryAddress(Accumulator accumulator, Register register){
        //todo accumulator.setRegister((byte)(accumulator.getRegister() & register.getRegLo()));
    }

    static void andAccumulator(Accumulator accumulator){
        accumulator.setRegister((byte)(accumulator.getRegister() & accumulator.getRegister()));
    }

    static void xorRegisterHi(Accumulator accumulator, Register register){
        accumulator.setRegister((byte)(accumulator.getRegister() ^ register.getRegHi()));
    }

    static void xorRegisterLo(Accumulator accumulator, Register register){
        accumulator.setRegister((byte)(accumulator.getRegister() ^ register.getRegLo()));
    }

    static void xorRegisterMemoryAddress(Accumulator accumulator, Register register){
        //todo accumulator.setRegister((byte)(accumulator.getRegister() ^ register.getRegLo()));
    }

    static void xorAccumulator(Accumulator accumulator){
        accumulator.setRegister((byte)(accumulator.getRegister() ^ accumulator.getRegister()));
    }

    static void orRegisterHi(Accumulator accumulator, Register register){
        accumulator.setRegister((byte)(accumulator.getRegister() | register.getRegHi()));
    }

    static void orRegisterLo(Accumulator accumulator, Register register){
        accumulator.setRegister((byte)(accumulator.getRegister() | register.getRegLo()));
    }

    static void orRegisterMemoryAddress(Accumulator accumulator, Register register){
        //todo accumulator.setRegister((byte)(accumulator.getRegister() | register.getRegLo()));
    }

    static void orAccumulator(Accumulator accumulator){
        accumulator.setRegister((byte)(accumulator.getRegister() | accumulator.getRegister()));
    }

    static void compareRegisterHi(Accumulator accumulator, Register register){
        //todo accumulator.setRegister((byte)(accumulator.getRegister() | register.getRegHi()));
    }

    static void compareRegisterLo(Accumulator accumulator, Register register){
        //todo accumulator.setRegister((byte)(accumulator.getRegister() | register.getRegLo()));
    }

    static void compareRegisterMemoryAddress(Accumulator accumulator, Register register){
        //todo accumulator.setRegister((byte)(accumulator.getRegister() | register.getRegLo()));
    }

    static void compareAccumulator(Accumulator accumulator){
        //todo accumulator.setRegister((byte)(accumulator.getRegister() | accumulator.getRegister()));
    }

    static void returnNegativeCondition(Register programCounter, Register stackPointer, short flag) {
        if (flag == 0) {
            //todo returnOperation(programCounter,stackPointer);
        }
    }

    static void pop(Register receivingRegister, Register poppingRegister){
        //todo receivingRegister.setRegister(poppingRegister.getRegister()mem address);
        //todo poppingRegister increment add2
    }

    static void jump16BitRelativeNegativeCondition(Register register, short flag, short value) {
        if (flag == 0) {
            register.setRegister((short) (register.getRegister() + value));
        }
    }

    static void jump16BitRelative(Register register, short value) {
            register.setRegister((short) (register.getRegister() + value));
    }

    static void callNegativeCondition(Register stackPointer, Register programCounter, short flag, short value) {
        if (flag == 0) {
            //todo call(stackPointer, programCounter, value)
        }
    }

    static void push(Register stackPointer, Register pushedRegister){
        //todo stackpointermemaddress = value
        //stackpointer decrement minus 2
    }

    static void add8BitValueToAccumulator(Accumulator accumulator, short value){
        accumulator.setRegister((byte) (accumulator.getRegister() + value));
    }

    static void restart(Register stackPointer, Register programCounter, short value){
        //todo
    }

    static void returnCondition(Register programCounter, Register stackPointer, short flag) {
        if (flag != 0) {
            //todo returnOperation(programCounter,stackPointer);
        }
    }

    static void returnOperation( Register programCounter,Register stackPointer){
        //todo progcounter = stack pointer mem
        //stackpointer increment 2
    }

    static void jump16BitRelativeCondition(Register register, short flag, short value) {
        if (flag != 0) {
            register.setRegister((short) (register.getRegister() + value));
        }
    }

    static void callCondition(Register stackPointer, Register programCounter, short flag, short value) {
        if (flag != 0) {
            //todo call(stackPointer, programCounter, value)
        }
    }

    static void call(Register stackPointer, Register programCounter, short value){
        //todo stack pointer mem = prog counter
        programCounter.setRegister(value);
        stackPointer.setRegister((short) (stackPointer.getRegister() - 2));
    }

    static void add8BitValueAndCarryToAccumulator(Accumulator accumulator, short value) {
        accumulator.setRegister((byte) (accumulator.getRegister() + accumulator.getCarryFlag() + value));
    }

    static void sub8BitValueFromAccumulator(Accumulator accumulator, short value){
        accumulator.setRegister((byte) (accumulator.getRegister() - value));
    }

    static void returnEnableInterupts(Register programCounter, Register stackPointer){
        //todo returnOperation(programCounter,stackPointer);
        //enableInterupts();
    }

    static void sub8BitValueAndCarryToAccumulator(Accumulator accumulator, short value) {
        accumulator.setRegister((byte) (accumulator.getRegister() - accumulator.getCarryFlag() - value));
    }

}
