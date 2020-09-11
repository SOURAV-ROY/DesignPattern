package TemplateMethodPattern;

public class SandwichSculptor {
    public static void main(String[] args) {

        Hoagie cus12Hoagie = new ItalianHoagie();
        cus12Hoagie.makeSandwich();

        Hoagie cus13Hoagie = new VeggieHoagie();
        cus13Hoagie.makeSandwich();
    }
}
