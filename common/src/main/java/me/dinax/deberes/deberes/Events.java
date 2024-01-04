package me.dinax.deberes.deberes;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.*;
import org.spongepowered.asm.mixin.Debug;

import java.util.logging.Logger;

public class Events {
    public static void register(){
        BlockEvent.BREAK.register(
                (level, pos, state, player, xp) -> {

                    if (level == level.getServer().overworld()){
                        DeberesDeRest.LOGGER.info("si es el overwold");
                        return EventResult.interruptFalse();
                    }else {
                        DeberesDeRest.LOGGER.info("no es el overwold");
                        return EventResult.pass();
                    }
                }
        );
    }
}
