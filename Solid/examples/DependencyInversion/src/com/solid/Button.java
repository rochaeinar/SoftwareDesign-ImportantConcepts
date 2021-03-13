package com.solid;

public class Button {
    private Swichable lamp;

    public void OnButtonListener(boolean state) {
        if (state) {
            lamp.turnOn();
        } else {
            lamp.turnOff();
        }
    }
}
