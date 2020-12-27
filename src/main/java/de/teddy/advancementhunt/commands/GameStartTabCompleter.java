package de.teddy.advancementhunt.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameStartTabCompleter implements TabCompleter {
    private ArrayList<String> args1 = new ArrayList<>();

    public GameStartTabCompleter()
    {
        args1.add("random");
        args1.add("true");
        args1.add("false");
        args1.add("5");
        args1.add("10");
    }
    @Override
    public List<String> onTabComplete(CommandSender sender,Command command,String alias,String[] args) {
        List<String> return_strings = new ArrayList<>();
        if(args.length == 1)
        {
            return_strings.add("random");
        }

        if(args.length == 2)
        {
            return_strings.add("random");
        }

        if(args.length == 3)
        {
            return_strings.add("5");
        }

        if(args.length == 4)
        {
            return_strings.add("10");
        }

        if (args.length == 5)
        {
            return_strings.add("random");
        }

        if (args.length == 6)
        {
            return_strings.add("true");
            return_strings.add("false");
        }

        if(args.length == 7)
        {
            return_strings.add("true");
            return_strings.add("false");
        }

        if(args.length == 8)
        {
            return_strings.add("10");
        }
        Collections.sort(return_strings);
        return return_strings;
    }
}
