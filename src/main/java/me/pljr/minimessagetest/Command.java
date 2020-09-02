package me.pljr.minimessagetest;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (args.length > 0){
            MiniMessageTest.getBukkitAudiences().audience(sender).sendMessage((MiniMessage.get().parse(StringUtils.join(ArrayUtils.subarray(args, 0, args.length), " "))));
        }
        return false;
    }
}
