package com.joapet99.busassistant.visualapi;

/**
 * Created by Joakim on 27.08.2016.
 */
public class Extra{
    public static final int EXTRA_IDENTIFIER = 0;
    public static final int EXTRA_TYPE = 1;
    public static final int BUS_NUMBER = 2;
    public static final String SPLIT_REGEX = "_";
    public static final int SPLIT_LENGTH = 3;
    public static final String EXTRA_IDENTIFIER_TAG = "extra";
    String extra;

    private Extra(String extra){
        this.extra = extra;
    }

    public static Extra parseString(String s){
        if(s.split(SPLIT_REGEX).length != SPLIT_LENGTH){
            System.err.println("ERROR:" + s + "| is not formatted as an extra. " +
                                                "Expected split length:" + SPLIT_LENGTH);
        }
        return new Extra(s);
    }

    public String getExtraIdentifier(){
        return this.extra.split(SPLIT_REGEX)[EXTRA_IDENTIFIER];
    }

    public String getExtraIdentifier(String extra){
        return parseString(extra).getExtraIdentifier();
    }

    public String getExtraTypeAsString(){
        return this.extra.split(SPLIT_REGEX)[EXTRA_TYPE];
    }

    public String getExtraTypeAsString(String extra){
        return parseString(extra).getExtraTypeAsString();
    }

    public ExtraType getExtraType(){
        return ExtraType.valueOf(this.getExtraTypeAsString().toUpperCase());
    }

    public ExtraType getExtraType(String extra){
        return parseString(extra).getExtraType();
    }

    public String getBusNumber(){
        return this.extra.split(SPLIT_REGEX)[BUS_NUMBER];
    }

    public String getBusNumber(String extra){
        return parseString(extra).getBusNumber();
    }
}