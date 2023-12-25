package org.example;

public class BattleLocation extends Location{
    public BattleLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
