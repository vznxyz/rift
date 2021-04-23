package com.minexd.rift.bukkit.spoof.command

import net.evilblock.cubed.command.Command
import com.minexd.rift.bukkit.spoof.SpoofHandler
import org.bukkit.ChatColor
import org.bukkit.command.CommandSender

object SpoofToggleCommand {

    @Command(
        names = ["rift secret toggle"],
        description = "Toggles the GS system",
        permission = "op",
        async = true
    )
    @JvmStatic
    fun execute(sender: CommandSender) {
        SpoofHandler.toggle()

        if (SpoofHandler.isEnabled()) {
            sender.sendMessage("${ChatColor.GREEN}GS is now enabled!")
        } else {
            sender.sendMessage("${ChatColor.RED}GS is now disabled!")
        }
    }

}