// This script will randomly pick which Brawlhalla game legend you should play using the weapon of your choice

import java.util.*;

public class BrawlhallaRandomizer {
    public static void main(String[] args)
    {
        Map<String, List<String>> weapon_legends = new HashMap<>();

        // Using Arrays.asList to make it resizable for future add-ons
        // Hammer legends
        weapon_legends.put("hammer", new ArrayList<>(Arrays.asList("Bodvar","Cassidy","Gnash","Scarlet","Sentinel",
                "Teros","Kor","Yumiko","Thor","Magyar")));

        // Sword legends
        weapon_legends.put("sword", new ArrayList<>(Arrays.asList("Bodvar","Hattori","Sir Roland","Thatch","Asuri",
                "Koji","Jhala","Val","Sidra","Jiro","Jaeyun","Ezio")));

        // Blasters legends
        weapon_legends.put("blasters", new ArrayList<>(Arrays.asList("Cassidy","Lord Vraxx","Thatch","Ada","Lucien",
                "Barraza","Diana","Cross","Nix", "Isaiah","Reno","Vivi")));

        // Lance legends
        weapon_legends.put("lance", new ArrayList<>(Arrays.asList("Orion","Lord Vraxx","Sir Roland","Scarlet","Ulgrim",
                "Artemis","Vector","Thea")));

        // Spear legends
        weapon_legends.put("spear", new ArrayList<>(Arrays.asList("Orion","Gnash","Queen Nai","Hattori","Ada","Brynn",
                "Wu Shang","Mirage","Kaya","Dusk","Arcadia","Seven")));

        // Katars legends
        weapon_legends.put("katars", new ArrayList<>(Arrays.asList("Queen Nai","Sentinel","Lucien","Asuri","Ember",
                "Ragnir","Caspian","Lin Fei","Mako","Loki")));

        // Axe legends
        weapon_legends.put("axe", new ArrayList<>(Arrays.asList("Teros","Brynn","Barraza","Azoth","Ulgrim","Jhala",
                "Ragnir","Xull","Rayman","Volkov","Imugi")));

        // Bow legends
        weapon_legends.put("bow", new ArrayList<>(Arrays.asList("Ember","Azoth","Koji","Diana","Yumiko","Kaya","Zariel",
                "Vector","Munin")));

        // Gauntlets legends
        weapon_legends.put("gauntlets", new ArrayList<>(Arrays.asList("Kor","Wu Shang","Val","Cross","Mordex","Caspian",
                "Zariel","Rayman","Petra","Onyx","Tezca")));

        // Scythe legends
        weapon_legends.put("scythe", new ArrayList<>(Arrays.asList("Mirage","Nix","Mordex","Artimis","Jiro","Fait",
                "Volkov","Munin","Loki")));

        // Cannon legends
        weapon_legends.put("cannon", new ArrayList<>(Arrays.asList("Sidra","Xull","Isaiah","Lin Fei","Onyx","Seven")));

        // Orb legends
        weapon_legends.put("orb", new ArrayList<>(Arrays.asList("Dusk","Fait","Teros","Petra","Reno","Ezio","Red Raptor")));

        // Greatsword legends
        weapon_legends.put("greatsword", new ArrayList<>(Arrays.asList("Jaeyun","Mako","Magyar","Arcadia","Imugi")));

        // Boots legends
        weapon_legends.put("boots", new ArrayList<>(Arrays.asList("Tezca","Thea","Red Raptor","Vivi")));

        Scanner input = new Scanner (System.in);

        while(true)
        {
            System.out.print("Pick your weapon: ");
            String weapon_input = input.next().toLowerCase();

            // Checks if weapon_legends has inputted weapon_input
            if (weapon_legends.containsKey(weapon_input))
            {
                // Gets the list from weapon_input key from the weapon_legends hashmap
                List<String> legends = weapon_legends.get(weapon_input);

                // Randomly select a legend from the list
                Random rand = new Random();
                String chosen_legend = legends.get(rand.nextInt(legends.size()));

                System.out.println("You got: " + chosen_legend);
                break;
            }
            else
            {
                    System.out.println("Invalid weapon. Please try again.");
            }
            }
            input.close();
        }

    }
