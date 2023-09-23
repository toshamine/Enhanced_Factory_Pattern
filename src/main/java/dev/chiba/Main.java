package dev.chiba;

import dev.chiba.factory.AppFactory;
import dev.chiba.model.Computer.Azus;
import dev.chiba.model.Computer.Computer;
import dev.chiba.model.Computer.Dell;
import dev.chiba.model.Computer.Hp;
import dev.chiba.model.OS.Linux;
import dev.chiba.model.OS.Mac;
import dev.chiba.model.OS.OS;
import dev.chiba.model.OS.Windows;

//Created by Mohamed Amine Ben Chiba
public class Main {


    public static void main(String[] args) {

        //Using AppFactory for OS and it's childs
        AppFactory<OS> osFactory = new AppFactory<>();

        osFactory.registerType(Windows.class,"windows");
        osFactory.registerType(Linux.class,"linux");
        osFactory.registerType(Mac.class,"mac");

        osFactory.getInstance("windows").specs();
        osFactory.getInstance("mac").specs();
        osFactory.getInstance("linux").specs();

        //Using AppFactory for Computer and it's childs
        AppFactory<Computer> computerFactory = new AppFactory<>();

        computerFactory.registerType(Dell.class,"dell");
        computerFactory.registerType(Azus.class,"azus");
        computerFactory.registerType(Hp.class,"hp");

        computerFactory.getInstance("dell").specs();
        computerFactory.getInstance("azus").specs();
        computerFactory.getInstance("hp").specs();

    }
}