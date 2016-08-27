package com.joapet99.busassistant.visualapi;

/**
 * Created by Joakim on 27.08.2016.
 */
public enum ExtraType {
    WALKING("w"),
    PICKUP("p");

    String extraTag;

    ExtraType(String extraTag){
        this.extraTag = extraTag;
    }

    public String getExtraTag(){
        return extraTag;
    }

    public static ExtraType getTypeByTag(String tag){
        for(ExtraType type : values()){
            if(type.getExtraTag().equals(tag)){
                return type;
            }
        }
        System.err.println("Couldn't find extra type with tag:" + tag + " | Returning null");
        return null;
    }
}
