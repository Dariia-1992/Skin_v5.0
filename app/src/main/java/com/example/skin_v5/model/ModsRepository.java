package com.example.skin_v5.model;

import com.example.skin_v5.R;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ModsRepository {

    private static List<Mod>items;

    public static List<Mod> getItems() {
        if (items == null || items.isEmpty())
            initItems();

        return items;
    }

    public static Mod getItemById(String itemId) {
        if (itemId == null || itemId.isEmpty())
            return null;

        for (Mod info : items) {
            if (info.getId().equals(itemId))
                return info;
        }

        return null;
    }

    private static void initItems() {
        items = new ArrayList<>();

        items.add(new Mod(UUID.randomUUID().toString(), "Text Title here post 1",
                R.drawable.logo_image_1,
                "Text Title here post 1, Text Title here post 1,Text Title here post 1, Text Title here post 1",
                new int[] {
                        R.drawable.logo_image_1,
                        R.drawable.logo_image_2,
                        R.drawable.logo_image_3
                }));
        items.add(new Mod(UUID.randomUUID().toString(), "Text Title here post 2",
                R.drawable.logo_image_2,
                "Text Title here post 1, Text Title here post 1,Text Title here post 1, Text Title here post 1",
                new int[] {
                        R.drawable.logo_image_1,
                        R.drawable.logo_image_2,
                        R.drawable.logo_image_3
                }));
        items.add(new Mod(UUID.randomUUID().toString(), "Text Title here post 3",
                R.drawable.logo_image_3,
                "Text Title here post 1, Text Title here post 1,Text Title here post 1, Text Title here post 1",
                new int[] {
                        R.drawable.logo_image_1,
                        R.drawable.logo_image_2,
                        R.drawable.logo_image_3
                }));
        items.add(new Mod(UUID.randomUUID().toString(), "Text Title here post 4",
                R.drawable.logo_image_4,
                "Text Title here post 1, Text Title here post 1,Text Title here post 1, Text Title here post 1",
                new int[] {
                        R.drawable.logo_image_4,
                        R.drawable.logo_image_2,
                        R.drawable.logo_image_3
                }));

    }
}
