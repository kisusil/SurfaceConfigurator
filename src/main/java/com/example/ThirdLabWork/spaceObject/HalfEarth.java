package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

public class HalfEarth extends BaseDecorator {

    public HalfEarth(Surface surface) {
        this.surface = surface;
        name = "Half Earth";
    }

    @Override
    public void illuminate() {
        surface.illuminate();
        setColor(SurfaceColor.PURPLE);
        setDescription(surface.getDescription() + ", Земля в виде сине-голубого месяца");
    }
}