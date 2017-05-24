package com.common.value;

/** @author Hibernate CodeGenerator */
public class CheckingState 
{ 
    public static final String SUBMITTED = "Submitted";
    public static final String PATCH = "Patch";
    public static final String PASS = "Pass";
    public static final String UNPASS = "Unpass";
    
    public static String getStateLabel(String state) 
    {
        if (SUBMITTED.equals(state)) {
            return "���f�d";
        }
        
        if (PATCH.equals(state)) {
            return "�ɥ�";
        }
        if (PASS.equals(state)) {
            return "�q�L";
        }
        if (UNPASS.equals(state)) {
            return "���q�L";
        }
        return state;

    }
}
