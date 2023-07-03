package ru.plumsoftware.robloxclicker.heroes;

import java.util.ArrayList;
import java.util.List;

import ru.plumsoftware.robloxclicker.R;

public abstract class Heroes {
    public static final String[] HEROES_NAMES = new String[]{
            "Капитан Роблокс",
            "Капитан Роблокс (синий)",
            "Капитан Роблокс (зелёный)",
            "Косминус",
            "Динамо",
            "Неоновый овердрайв",
            "Овердрайв",
            "Человек-Роблокс",
            "Супер Роблокс",
            "Тигрис",
            "Секретный Роблокс"

    };
    public static final int[] HEROES_RES_ID = new int[]{
            R.drawable.capitan_roblox_1,
            R.drawable.capitan_roblox_2,
            R.drawable.captain_roblox_8,
            R.drawable.cosminus_5,
            R.drawable.dinamo_3,
            R.drawable.neon_overdrive_roblox_11,
            R.drawable.overdrive_4,
            R.drawable.roblox_9,
            R.drawable.super_roblox_6,
            R.drawable.tigris_roblox_10,
            R.drawable.secret_roblox_7
    };
    public static final int[] HEROES_CLICKS = new int[]{
            1,
            5,
            10,
            15,
            25,
            50,
            100,
            150,
            300,
            500,
            1000
    };
    public static final int[] HEROES_PRICES = new int[]{
            0,
            100,
            500,
            1500,
            5000,
            10000,
            15000,
            30000,
            50000,
            100000,
            500000
    };

    public static List<Hero> buildHeroes() {
        List<Hero> list = new ArrayList<>();
        for (int i = 0; i < HEROES_NAMES.length; i++) {
            list.add(new Hero(HEROES_RES_ID[i], HEROES_NAMES[i], HEROES_PRICES[i], HEROES_CLICKS[i]));
        }
        return list;
    }
}
