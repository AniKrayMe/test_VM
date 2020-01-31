package com.company;

import java.util.Objects;

public class Command {
    private String row;
    private int colon;

    public Command(String row, int colon) {
        this.row = row;
        this.colon = colon;
    }

    public Command() {
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getColon() {
        return colon;
    }

    public void setColon(int colon) {
        this.colon = colon;
    }

    @Override
    public String toString() {
        return "Command{" +
                "row='" + row + '\'' +
                ", colon=" + colon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return colon == command.colon &&
                Objects.equals(row, command.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, colon);
    }

    public static void convertInputToCommand(String input) {
        if (input.equals("A:1") || input.equals("A:2") || input.equals("A:3") || input.equals("B:1") ||
                input.equals("B:2") || input.equals("B:3") || input.equals("C:1") || input.equals("C:2")
                || input.equals("C:3")) {
            String[] strings = input.split(":");
            Command command = new Command();
            command.setRow(strings[0]);
            command.setColon(Integer.valueOf(strings[1]));
        }else {
            System.out.println(" լավ չես արա նորմալ ինփութ տուր ");
        }
    }

}
