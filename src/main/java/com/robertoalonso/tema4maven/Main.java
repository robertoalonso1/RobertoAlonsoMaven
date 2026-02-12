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
       System.out.println(banner);

   }
}
