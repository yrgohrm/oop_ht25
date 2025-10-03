package se.yrgo.dungeon.colors;

import java.util.*;

public record Ansi(
        Color background,
        Color foreground,
        FontStyle style,
        boolean highIntensityBackground,
        boolean highIntensityForeground) {

    private static final String ESCAPE = "\033[";

    public Ansi() {
        this(Color.NONE, Color.NONE, FontStyle.NORMAL, false, false);
    }

    public Ansi {
        Objects.requireNonNull(background);
        Objects.requireNonNull(foreground);
        Objects.requireNonNull(style);
    }

    public Ansi black() {
        return withForeground(Color.BLACK);
    }

    public Ansi red() {
        return withForeground(Color.RED);
    }

    public Ansi green() {
        return withForeground(Color.GREEN);
    }

    public Ansi yellow() {
        return withForeground(Color.YELLOW);
    }

    public Ansi blue() {
        return withForeground(Color.BLUE);
    }

    public Ansi purple() {
        return withForeground(Color.PURPLE);
    }

    public Ansi cyan() {
        return withForeground(Color.CYAN);
    }

    public Ansi white() {
        return withForeground(Color.WHITE);
    }

    public Ansi onBlack() {
        return withBackground(Color.BLACK);
    }

    public Ansi onRed() {
        return withBackground(Color.RED);
    }

    public Ansi onGreen() {
        return withBackground(Color.GREEN);
    }

    public Ansi onYellow() {
        return withBackground(Color.YELLOW);
    }

    public Ansi onBlue() {
        return withBackground(Color.BLUE);
    }

    public Ansi onPurple() {
        return withBackground(Color.PURPLE);
    }

    public Ansi onCyan() {
        return withBackground(Color.CYAN);
    }

    public Ansi onWhite() {
        return withBackground(Color.WHITE);
    }

    public Ansi bold() {
        return withStyle(FontStyle.BOLD);
    }

    public Ansi underline() {
        return withStyle(FontStyle.UNDERLINE);
    }

    public Ansi normal() {
        return withStyle(FontStyle.NORMAL);
    }

    public Ansi hiBg() {
        return withHiBackground(true);
    }

    public Ansi hiFg() {
        return withHiForeground(true);
    }

    public Ansi withForeground(Color color) {
        return new Ansi(this.background, color, this.style, this.highIntensityBackground,
                this.highIntensityForeground);
    }

    public Ansi withBackground(Color color) {
        return new Ansi(color, this.foreground, this.style, this.highIntensityBackground,
                this.highIntensityForeground);
    }

    public Ansi withStyle(FontStyle style) {
        return new Ansi(this.background, this.foreground, style, this.highIntensityBackground,
                this.highIntensityForeground);
    }

    public Ansi withHiBackground(boolean state) {
        return new Ansi(this.background, this.foreground, style, state, this.highIntensityForeground);
    }

    public Ansi withHiForeground(boolean state) {
        return new Ansi(this.background, this.foreground, style, this.highIntensityBackground, state);
    }

    public String format(String text) {
        StringBuilder output = new StringBuilder();

        if (background != Color.NONE) {
            int start = highIntensityBackground ? 100 : 40;
            int color = start + background.ordinal();
            output.append(ESCAPE).append(color).append("m");
        }

        if (foreground != Color.NONE) {
            int start = highIntensityForeground ? 90 : 30;
            int color = start + foreground.ordinal();

            if (style == FontStyle.NORMAL) {
                output.append(ESCAPE).append(color).append("m");
            } else {
                int kind = style == FontStyle.BOLD ? 1 : 4;
                output.append(ESCAPE).append(kind).append(";").append(color).append("m");
            }
        }

        output.append(text);
        output.append(ESCAPE).append("0m");

        return output.toString();
    }

    public static void clearScreen() {
        // System.out.println(ESCAPE + "H" + ESCAPE + "2J");
        System.out.print("\033\143");
    }

    public static Ansi make() {
        return new Ansi();
    }
}
