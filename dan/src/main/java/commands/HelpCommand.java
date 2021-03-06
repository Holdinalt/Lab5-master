package commands;

import mainApp.Result;
/*
    выводит скудную инфомарцию о командах...
 */
public class HelpCommand implements Command {
    ControlUnit cu;

    public HelpCommand(ControlUnit cu){
        cu.addCommand("help", this);
        this.cu = cu;
    }
    @Override
    public void execute(String options, Result result) {
        result.writeResult("");
        for (Object command : cu.commandList){
            System.out.println(command.toString());
        }
    }
    @Override
    public String toString() {
        return "help : вывести справку по доступным командам";
    }
}
