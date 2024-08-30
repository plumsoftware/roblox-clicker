package ru.plumsoftware.robloxclicker.heroes;

import java.util.ArrayList;
import java.util.List;

import ru.plumsoftware.robloxclicker.R;

public abstract class Backs {
    public static final String[] BACKS_NAMES = new String[]{
            "Современный задний фон",
            "Лес",
            "Морской порт",
            "Секретный задний фон",
            "Скибиди задний фон",
            "Современный город"
    };
    public static final int[] BACKS_RES_ID = new int[]{
            R.drawable.back_2,
            R.drawable.back_3,
            R.drawable.back_4,
            R.drawable.back_5,
            R.drawable.skibidi_toilet_nackground_1,
            R.drawable.back_7
    };
    public static final int[] BACKS_PRICES = new int[]{
            5000,
            100000,
            2000000,
            5500000,
            8500000,
            1500000
    };

    public static List<Back> buildHeroes() {
        List<Back> list = new ArrayList<>();
        for (int i = 0; i < BACKS_NAMES.length; i++) {
            list.add(new Back(BACKS_RES_ID[i], BACKS_NAMES[i], BACKS_PRICES[i]));
        }
        return list;
    }
}
