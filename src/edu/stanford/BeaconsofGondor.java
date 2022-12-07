package edu.stanford;

import sun.misc.Signal;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 18:54
 * @Description: edu.stanford
 * @version: 1.0
 */
public class BeaconsofGondor {
    public void run(){
        Tower rohan = craeteTower("Rohan",null);
        Tower halifirien = craeteTower("Halifirien",rohan);
        Tower calenhad = craeteTower("Calenhad",halifirien);
        Tower minRimmon = craeteTower("MinRimmon",calenhad);
        Tower erelas = craeteTower("Erelas",minRimmon);
        Tower nardol = craeteTower("Nardol",erelas);
        Tower eilenach = craeteTower("Eilenach",nardol);
        Tower amonDin = craeteTower("AmonDin",eilenach);
        Tower minasTririth = craeteTower("MinasTririth",amonDin);
        signanl(minasTririth);
    }
    private Tower craeteTower(String name, Tower link){
        Tower t = new Tower();
        t.name = name;
        t.link = link;
        return t;
    }
    private void signanl(Tower start){
        for(Tower cp=start;cp!=null;cp=cp.link){
            System.out.println("Lighting  " + cp.name);
        }
    }
    private static class Tower {
        String name;
        Tower link;
    }

    public static void main(String[] args) {
        new BeaconsofGondor().run();
    }
}
