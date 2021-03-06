package com.archivesmc.inter.inter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Server {
    private String name;
    private Set<String> players;

    public Server(String name) {
        this.name = name;
        this.players = new HashSet<>();
    }

    public void addPlayers(List<String> players) {
        for (String s : players) {
            this.addPlayer(s);
        }
    }

    public boolean addPlayer(String player) {
        return this.players.add(player);
    }

    public boolean hasPlayer(String player) {
        return this.players.contains(player);
    }

    public boolean removePlayer(String player) {
        return this.players.remove(player);
    }

    public String getName() {
        return this.name;
    }

    public HashSet<String> getPlayers() {
        return new HashSet<>(players);
    }
}
