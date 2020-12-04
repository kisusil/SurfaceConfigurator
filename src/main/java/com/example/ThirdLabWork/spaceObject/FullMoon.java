package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

public class FullMoon extends BaseDecorator {


    public FullMoon(Surface surface) {
        this.surface = surface;
        name = "Full Moon";
    }

    @Override
    public void illuminate() {
        surface.illuminate();
        if(getColor() == SurfaceColor.LIGHT) {
            setColor(SurfaceColor.MOON_ECLIPSE_COLOR);
        } else {
            setColor(SurfaceColor.REFLECTED_LIGHT);
        }
        setDescription(surface.getDescription() + ", полная блестящая Луна");
    }
}
