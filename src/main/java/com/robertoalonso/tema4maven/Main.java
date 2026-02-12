package com.robertoalonso.tema4maven;

import com.github.lalyos.jfiglet.FigletFont;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import java.util.List;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) throws Exception {

       String texto = "Roberto Alonso";
       String banner = FigletFont.convertOneLine(texto);

       List<String> infoTotal = new ArrayList<>();


       for (String info : banner.split("\n")) {
           infoTotal.add(info);
       }

       infoTotal.add("Nombre: Roberto Alonso Boix");
       infoTotal.add("Edad: 18");
       infoTotal.add("Email: robaloboi@alu.edu.gva.es");
       infoTotal.add("Telefono: 687562393");
       infoTotal.add("Idiomas: Español Nativo, Ingles B2, Valenciano C1");
       infoTotal.add("Dirección: Calle Ciutat de Laval 13, 4, 13");
       infoTotal.add("Experiencia: 400 horas de practicas de SMX");
       infoTotal.add("Educacion: ESO y grado medio de SMX");
       infoTotal.add("Habilidades: Java, Python, trabajo en equipo");
       infoTotal.add("Objetivo profesional: Desarrollador de software");

       infoTotal.forEach(System.out::println);

       Screen screen = new DefaultTerminalFactory().createScreen();
       screen.startScreen();
       screen.setCursorPosition(null);

   }



}

