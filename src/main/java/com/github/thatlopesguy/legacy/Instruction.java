package com.github.thatlopesguy.legacy;

/**
 * Created by thatLopesGuy on 26/01/2018.
 */
public enum Instruction {

    //8-bit loads
    LOAD_REGISTER_INTO_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,4),
    LOAD_NUMBER_INTO_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_MEMORY_INTO_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_REGISTER_INTO_MEMORY(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_NUMBER_INTO_MEMORY(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,12),
    LOAD_MEM_BC_INTO_ACCUMULATOR(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_MEM_DE_INTO_ACCUMULATOR(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_MEM_ADDRESS_INTO_ACCUMULATOR(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),
    LOAD_ACCUMULATOR_INTO_MEM_BC(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_ACCUMULATOR_INTO_MEM_DE(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_ACCUMULATOR_INTO_MEM_ADDRESS(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),
    LOAD_IO_OFFSET_INTO_ACCUMULATOR(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,12),
    LOAD_ACCUMULATOR_INTO_IO_OFFSET(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,12),
    LOAD_IO_C_OFFSET_INTO_ACCUMULATOR(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_ACCUMULATOR_INTO_IO_C_OFFSET(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_INCREASE_ACCUMULATOR_INTO_MEM(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_INCREASE_MEM_INTO_ACCUMULATOR(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_DECREASE_ACCUMULATOR_INTO_MEM(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    LOAD_DECREASE_MEM_INTO_ACCUMULATOR(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),

    //16-bit loads
    LOAD_16_NUMBER_INTO_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,12),
    LOAD_HL_INTO_STACK_POINTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    PUSH_REGISTER_INTO_STACK_POINTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),
    POP_STACK_POINTER_INTO_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,12),

    //8-bit arithmetic
    ADD_REGISTER_INTO_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.IMP,4),
    ADD_NUMBER_INTO_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.IMP,8),
    ADD_MEM_INTO_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.IMP,8),
    ADD_CARRY_REGISTER_INTO_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.IMP,4),
    ADD_CARRY_NUMBER_INTO_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.IMP,8),
    ADD_CARRY_MEM_INTO_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.IMP,8),
    SUB_REGISTER_FROM_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,4),
    SUB_NUMBER_FROM_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,8),
    SUB_MEM_FROM_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,8),
    SUB_CARRY_REGISTER_FROM_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,4),
    SUB_CARRY_NUMBER_FROM_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,8),
    SUB_CARRY_MEM_FROM_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,8),
    AND_REGISTER_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.SET,FlagState.OFF,4),
    AND_NUMBER_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.SET,FlagState.OFF,8),
    AND_MEM_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.SET,FlagState.OFF,8),
    XOR_REGISTER_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,4),
    XOR_NUMBER_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,8),
    XOR_MEM_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,8),
    OR_REGISTER_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,4),
    OR_NUMBER_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,4),
    OR_MEM_ACCUMULATOR(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,4),
    EQ_REGISTER_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,4),
    EQ_NUMBER_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,8),
    EQ_MEM_ACCUMULATOR(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.IMP,8),
    INC_REGISTER(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.NOP,4),
    INC_MEM(,FlagState.IMP,FlagState.OFF,FlagState.IMP,FlagState.NOP,12),
    DEC_REGISTER(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.NOP,4),
    DEC_MEM(,FlagState.IMP,FlagState.SET,FlagState.IMP,FlagState.NOP,12),
    DECIMAL_ADJUST(,FlagState.IMP,FlagState.NOP,FlagState.OFF,FlagState.NOP,4),
    COMPLEMENT(,FlagState.NOP,FlagState.SET,FlagState.SET,FlagState.NOP,4),

    //16-bit arithmetic
    ADD_16_REGISTER_INTO_HL(,FlagState.NOP,FlagState.OFF,FlagState.IMP,FlagState.IMP,8),
    INC_16_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    DEC_16_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    ADD_16_SIGNED_NUMBER_STACK_POINTER(,FlagState.OFF,FlagState.OFF,FlagState.IMP,FlagState.IMP,16),
    LOAD_16_STACK_POINTER_OFFSET_INTO_HL(,FlagState.OFF,FlagState.OFF,FlagState.IMP,FlagState.IMP,12),

    //rotate and shift
    ROTATE_ACCUMULATOR_LEFT(,FlagState.OFF,FlagState.OFF,FlagState.OFF,FlagState.IMP,4),
    ROTATE_ACCUMULATOR_LEFT_THROUGH_CARRY(,FlagState.OFF,FlagState.OFF,FlagState.OFF,FlagState.IMP,4),
    ROTATE_ACCUMULATOR_RIGHT(,FlagState.OFF,FlagState.OFF,FlagState.OFF,FlagState.IMP,4),
    ROTATE_ACCUMULATOR_RIGHT_THROUGH_CARRY(,FlagState.OFF,FlagState.OFF,FlagState.OFF,FlagState.IMP,4),
    ROTATE_REGISTER_LEFT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,8),
    ROTATE_MEM_LEFT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,16),
    ROTATE_REGISTER_LEFT_THROUGH_CARRY(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,8),
    ROTATE_MEM_LEFT_THROUGH_CARRY(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,16),
    ROTATE_REGISTER_RIGHT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,8),
    ROTATE_MEM_RIGHT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,16),
    ROTATE_REGISTER_RIGHT_THROUGH_CARRY(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,8),
    ROTATE_MEM_RIGHT_THROUGH_CARRY(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,18),
    SHIFT_REGISTER_LEFT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,8),
    SHIFT_MEM_LEFT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,16),
    SWAP_REGISTER_NIBBLES(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,8),
    SWAP_MEM_NIBBLES(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.OFF,16),
    SHIFT_REGISTER_RIGHT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,8),
    SHIFT_MEM_RIGHT(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,16),
    SHIFT_REGISTER_RIGHT_LOGICAL(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,8),
    SHIFT_MEM_RIGHT_LOGICAL(,FlagState.IMP,FlagState.OFF,FlagState.OFF,FlagState.IMP,16),


    //bit commands
    BIT_TEST_IN_REGISTER(,FlagState.IMP,FlagState.OFF,FlagState.SET,FlagState.NOP,8),
    BIT_TEST_IN_MEM(,FlagState.IMP,FlagState.OFF,FlagState.SET,FlagState.NOP,12),
    SET_BIT_IN_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    SET_BIT_IN_MEM(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),
    RESET_BIT_IN_REGISTER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    RESET_BIT_IN_MEM(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),

    //cpu-control commands
    XOR_CARRY_FLAG(,FlagState.NOP,FlagState.OFF,FlagState.OFF,FlagState.IMP,4),
    SET_CARRY_FLAG(,FlagState.NOP,FlagState.OFF,FlagState.OFF,FlagState.SET,4),
    NOP(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,4),
    HALT(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,0),
    STOP(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,0),
    DISABLE_INTERUPTS(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),
    ENABLE_INTERUPTS(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,8),

    //jump commands
    JUMP_TO_NUMBER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),
    JUMP_TO_HL(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,4),
    JUMP_CONDITIONALLY_TO_NUMBER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,0),
    JUMP__TO_PROGRAM_COUNTER_OFFSET(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,12),
    JUMP_CONDITIONALLY_TO_PROGRAM_COUNTER_OFFSET(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,0),
    CALL_NUMBER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,24),
    CALL_CONDITIONALLY_NUMBER(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,0),
    RETURN(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),
    RETURN_CONDITIONALLY(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,0),
    RETURN_ENABLE_INTERUPTS(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16),
    RESTART(,FlagState.NOP,FlagState.NOP,FlagState.NOP,FlagState.NOP,16); //TODO VERIFY






    private byte opcode;
    private FlagState zeroFlag;
    private FlagState subtractionFlag;
    private FlagState halfCarryFlag;
    private FlagState carryFlag;
    private int clockCycles;

    Instruction(byte opcode, FlagState zeroFlag, FlagState subtractionFlag, FlagState halfCarryFlag, FlagState carryFlag, int clockCycles) {
        this.opcode = opcode;
        this.zeroFlag = zeroFlag;
        this.subtractionFlag = subtractionFlag;
        this.halfCarryFlag = halfCarryFlag;
        this.carryFlag = carryFlag;
        this.clockCycles = clockCycles;
    }

    public byte getOpcode(){
        return opcode;
    }

    public FlagState getZeroFlag() {
        return zeroFlag;
    }

    public FlagState getCarryFlag() {
        return carryFlag;
    }

    public FlagState getHalfCarryFlag() {
        return halfCarryFlag;
    }

    public FlagState getSubtractionFlag() {
        return subtractionFlag;
    }

    public int getClockCycles() {
        return clockCycles;
    }
}
