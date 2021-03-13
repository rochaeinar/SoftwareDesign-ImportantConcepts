package com.solid;

public class Button {
    private Lamp lamp;

    public void OnButtonListener(boolean state) {
        if (state) {
            lamp.turnOn();
        } else {
            lamp.turnOff();
        }
    }
}
