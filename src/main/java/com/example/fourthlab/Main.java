package com.example.fourthlab;

import com.example.fourthlab.config.Executor;
import com.example.fourthlab.config.SkyMode;
import com.example.fourthlab.environment.Position;
import com.example.fourthlab.people.Astronaut;
import com.example.fourthlab.people.StateOfHealth;
import com.example.fourthlab.work.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws GroupOverflowException {

		List<Astronaut> astronautsMiners = new ArrayList<>();
		astronautsMiners.add(new Astronaut.AstronautBuilder()
				.setName("Спутник 1")
				.setSkyMode(SkyMode.MoonNightObliqueLight)
				.build());

		List<Astronaut> astronautsInspectors = new ArrayList<>();
		astronautsInspectors.add(new Astronaut.AstronautBuilder()
				.setName("Знайка")
				.setLeader(true)
				.setSkyMode(SkyMode.MoonDay)
				.build());
		astronautsInspectors.add(new Astronaut.AstronautBuilder()
				.setName("Звездочкин")
				.setSkyMode(SkyMode.MoonDay)
				.build());
		astronautsInspectors.add(new Astronaut.AstronautBuilder()
				.setName("Фуксия")
				.setSkyMode(SkyMode.MoonDay)
				.build());
		astronautsInspectors.add(new Astronaut.AstronautBuilder()
				.setName("Селедочка")
				.setSkyMode(SkyMode.MoonDay)
				.build());

		List<Astronaut> astronautsZeroGravity = new ArrayList<>();
		astronautsZeroGravity.add(new Astronaut.AstronautBuilder()
				.setName("Спутник2")
				.setLeader(true)
				.setSkyMode(SkyMode.MoonNightDirectLight)
				.build());
		astronautsZeroGravity.add(new Astronaut.AstronautBuilder()
				.setName("Спутник3")
				.setSkyMode(SkyMode.MoonNightObliqueLight)
				.build());

		List<Astronaut> astronautsFairyTaleTellers = new ArrayList<>();
		astronautsFairyTaleTellers.add(new Astronaut.AstronautBuilder()
				.setName("Пилюлькин")
				.setSkyMode(SkyMode.MoonDay)
				.build());
		astronautsFairyTaleTellers.add(new Astronaut.AstronautBuilder()
				.setName("Незнайка")
				.setCondition(StateOfHealth.VERY_BAD)
				.setSkyMode(SkyMode.MoonDay)
				.build());

		List<Astronaut> astronautsSpaceGroup = new ArrayList<>();
		astronautsSpaceGroup.add(new Astronaut.AstronautBuilder()
				.setName("Спутник 3")
				.setSkyMode(SkyMode.Space)
				.build());

		WorkProcess inspectRocket = new InspectRocket("Обследовать ракету", 1200);
		WorkProcess mineWork = new MineWork("Добыть ископаемые",60);
		WorkProcess tellFairytales = new TellFairytales("Рассказать сказки Незнайке",60);
		WorkProcess zeroGravityProcess = new ZeroGravityProcess("Добраться до места назначения по невесомости",100);
		WorkProcess astronautsSpace = new SpaceGroup("Обследовать орбиту луны", 1000);

		List<Group> groups = new ArrayList<>();

		groups.add(new Group(astronautsInspectors,inspectRocket, Position.ROCKET));
		groups.add(new Group(astronautsMiners,mineWork, Position.FROZEN_MOON_TUNNEL));
		groups.add(new Group(astronautsFairyTaleTellers, tellFairytales, Position.ICICLE_GROTTO));
		groups.add(new Group(astronautsZeroGravity, zeroGravityProcess, Position.CAVE));
		groups.add(new Group(astronautsSpaceGroup, astronautsSpace, Position.SPACE));

		Executor executor = new Executor(groups);
		executor.execute();

	}
}
