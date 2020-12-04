package com.example.ThirdLabWork.surface;


public interface Surface {
    void illuminate();

    SurfaceColor getColor();
    void setColor(SurfaceColor color);

    String getDescription();
    void setDescription(String description);
}
