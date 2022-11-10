package me.realized.duels.data;

import lombok.Getter;
import me.realized.duels.api.user.MatchInfo;

import java.util.UUID;

public class MatchData implements MatchInfo {

    @Getter
    private String id;

    @Getter
    private String winner;
    @Getter
    private String loser;
    @Getter
    private String kit;
    @Getter
    private long time;
    @Getter
    private long duration;
    @Getter
    private double health;

    private MatchData() {}

    public MatchData(String id, final String winner, final String loser, final String kit, final long time, final long duration, final double health) {
        this.id = id;
        this.winner = winner;
        this.loser = loser;
        this.kit = kit;
        this.time = time;
        this.duration = duration;
        this.health = health;
    }

    @Override
    public long getCreation() {
        return time;
    }

    @Override
    public String toString() {
        return "MatchData{" +
            "winner='" + winner + '\'' +
            ", loser='" + loser + '\'' +
            ", time=" + time +
            ", duration=" + duration +
            ", health=" + health +
            '}';
    }
}
