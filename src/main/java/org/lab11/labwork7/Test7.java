package org.lab11.labwork7;

public class Test7 {
    public static void main(String[] args) {
        Player player = new Player("Antony",0,0,100,10);
        SaveFile saveFile = new SaveFile();
        System.out.println(player);
        saveFile.setSave("First",player.save());
        player.getDamage(105);
        System.out.println(player);
        player.load(saveFile.getSave("First"));
        player.losesArtifacts();
        saveFile.setSave("Second",player.save());
        System.out.println(player);
        player.load(saveFile.getSave("Second"));
        System.out.println(player);
        player.load(saveFile.getSave("First"));
        System.out.println(player);
    }
}
