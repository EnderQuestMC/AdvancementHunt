package xyz.regulad.AdvancementHunt.events;

import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import xyz.regulad.AdvancementHunt.game.states.GameState;

public class PostGameStateChangeEvent extends GameStateChangeEvent {
    private static final HandlerList handlers = new HandlerList();

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static @NotNull HandlerList getHandlerList() {
        return handlers;
    }

    public PostGameStateChangeEvent(GameState oldGameState, GameState newGameState) {
        super(oldGameState, newGameState);
    }
}