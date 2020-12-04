package com.example.ThirdLabWork;


import com.example.ThirdLabWork.config.Executor;
import com.example.ThirdLabWork.config.SkyModeBuilderSet;
import com.example.ThirdLabWork.config.Viewer;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Viewer> viewers = new ArrayList<>();
		viewers.add(new Viewer(SkyModeBuilderSet.EARTH_ECLIPSE));
		viewers.add(new Viewer(SkyModeBuilderSet.EARTH_DAY));
		viewers.add(new Viewer(SkyModeBuilderSet.EARTH_NIGHT));
		viewers.add(new Viewer(SkyModeBuilderSet.MOON_DAY));
		viewers.add(new Viewer(SkyModeBuilderSet.MOON_ECLIPSE));
		viewers.add(new Viewer(SkyModeBuilderSet.MOON_NIGHT));

		Executor executor = new Executor(viewers);
		executor.execute();
	}
}
