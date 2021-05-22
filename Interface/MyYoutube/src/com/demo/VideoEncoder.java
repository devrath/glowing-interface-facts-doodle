package com.demo;

public interface VideoEncoder {
    float ENCODER_VALUE = 10;
    void encode(Video video);

    static double someVideoLogic(double someInput){
        return someInput + ENCODER_VALUE;
    }
}
