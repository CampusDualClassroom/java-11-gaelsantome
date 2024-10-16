package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());


        redRemote.turnOn();
        System.out.println("El mando está: " + redRemote.turnOn());

        redRemote.channelUp();
        System.out.println("El canal es: " + redRemote.channel);

        redRemote.channelDown();
        System.out.println("El canal es: " + redRemote.channel);

        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println("El canal es: " + redRemote.channel);

        redRemote.volumeUp();
        System.out.println("El volumen es: " + redRemote.volume);

        redRemote.volumeDown();
        System.out.println("El volumen es: " + redRemote.volume);

        redRemote.volume =0;
        System.out.println("El volumen es: " + redRemote.volume);
        redRemote.volumeDown();

        String remoteColor = redRemote.getColor();
        System.out.println("El color del mando a distancia es: " + remoteColor);

        redRemote.turnOff();
        System.out.println("El mando esta: " + redRemote.turnOff());
    }

}