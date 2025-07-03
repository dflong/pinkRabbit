package com.dfl.pinkRabbit.leetcode;

import java.util.*;

public class _332 {

    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));

        new _332().findItinerary(tickets);
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));

        this.used = new boolean[tickets.size()];
        this.tickets = tickets;
        res.add("JFK");
        backTracking();
        return res;
    }

    List<String> res = new LinkedList<>();
    boolean[] used;
    List<List<String>> tickets;

    public boolean backTracking() {
        if (res.size() == tickets.size() + 1) {
            return true;
        }

        for (int i = 0; i < tickets.size(); i++) {
            if (!used[i] && tickets.get(i).get(0).equals(res.get(res.size() - 1))) {
                res.add(tickets.get(i).get(1));
                used[i] = true;
                if (backTracking()){
                    return true;
                }

//                res.remove(res.size() - 1);
//                used[i] = false;
            }
        }

        return false;
    }
}
