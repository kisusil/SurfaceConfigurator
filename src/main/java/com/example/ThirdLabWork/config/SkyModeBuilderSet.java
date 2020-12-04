package com.example.ThirdLabWork.config;

public enum SkyModeBuilderSet {
    MOON_DAY(SkyMode.MoonDay),
    MOON_NIGHT(SkyMode.MoonNight),
    MOON_ECLIPSE(SkyMode.MoonEclipse),
    EARTH_DAY(SkyMode.EarthDay),
    EARTH_NIGHT(SkyMode.EarthNight),
    EARTH_ECLIPSE(SkyMode.EarthEclipse);

    private SurfaceColorBuilder builder;
    private SkyMode skyMode;

    SkyModeBuilderSet(SkyMode skyMode) {
        this.skyMode = skyMode;
        this.builder = SurfaceColorBuilder.getDefaultSet(skyMode);
    }

    public SurfaceColorBuilder getBuilder() {
        return builder;
    }

    @Override
    public String toString() {
        return skyMode.toString();
    }
}
