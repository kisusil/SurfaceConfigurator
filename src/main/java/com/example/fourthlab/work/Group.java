package com.example.fourthlab.work;

import com.example.fourthlab.environment.Position;
import com.example.fourthlab.people.Astronaut;

import java.util.List;

public class Group {
    private List<Astronaut> astronaut;
    private WorkProcess workProcess;
    private Position position;

    public Group(List<Astronaut> astronauts, WorkProcess workProcess, Position position) throws GroupOverflowException {
        if(astronauts.size() > 10) {
            throw new GroupOverflowException("Группа переполнена: " + astronauts.size());
        }
        this.workProcess = workProcess;
        this.astronaut = astronauts;
        this.position = position;
    }

    @Override
    public String toString() {

        this.workProcess.doAction();

        String result = astronaut
                .toString()
                .substring(1, astronaut.toString().length()-1)
                .replaceAll(",","\n");
        return position + "\n" +
                workProcess +
                "\nНад этим работают:\n\n" +
                result + "\n====================================================================================";
    }
}
