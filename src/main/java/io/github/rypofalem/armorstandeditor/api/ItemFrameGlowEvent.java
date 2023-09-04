package io.github.rypofalem.armorstandeditor.api;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public class ItemFrameGlowEvent extends ItemFrameEvent implements Cancellable {
    /* Generated for Bukkit */
    private static final HandlerList handlers = new HandlerList();
    @Getter
    protected final Player player;
    @Getter
    @Setter
    private boolean cancelled = false;

    public ItemFrameGlowEvent(ItemFrame itemFrame, Player player) {
        super(itemFrame);
        this.player = player;
    }

    public static HandlerList getHandlerList() {
        return (handlers);
    }

    @Override
    public HandlerList getHandlers() {
        return (handlers);
    }
}
