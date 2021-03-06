package trc492.trcscoutingcodegen.commands;

import java.io.IOException;
import java.util.List;

import trc492.trcscoutingcodegen.CurSessionHandlerUtil;

public class CmdUnloadFile extends Command
{
    private CurSessionHandlerUtil util;

    public CmdUnloadFile(CurSessionHandlerUtil util)
    {
        super("unload", "Unloads the currently loaded session file, if any.", "Usage: unload");
        this.util = util;
    }

    @Override
    public boolean call(List<String> args) throws IOException
    {
        util.unloadSession();
        System.out.println("Session unloaded.");
        return true;
    }
}
