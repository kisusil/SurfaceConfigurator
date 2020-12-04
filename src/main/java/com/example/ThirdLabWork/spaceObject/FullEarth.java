package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

public class FullEarth extends BaseDecorator {

    public FullEarth(Surface surface) {
        this.surface = surface;
        name = "Full Earth";
    }

    @Override
    public void illuminate() {
        surface.illuminate();
        if(getColor() == SurfaceColor.LIGHT) {
            setColor(SurfaceColor.ECLIPSE_COLOR);
        } else {
            setColor(SurfaceColor.REFLECTED_LIGHT);
        }
        setDescription(surface.getDescription() + ", полная сине-голубая Земля");
    }
}
