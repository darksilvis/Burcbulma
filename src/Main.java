import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("dogdugun ayi gir: ");
        month = input.nextInt();

        System.out.println("dogdugun gunu gir: ");
        day = input.nextInt();

        switch (month) {
            case 1:// ocak
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Burcunuz: oğlak ");
                    } else {
                        System.out.println("Burcunuz: kova ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 2:// şubat
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        System.out.println("Burcunuz: kova  ");
                    } else {
                        System.out.println("Burcunuz: Balik  ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 3: // mart
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Burcunuz: Balik ");
                    } else {
                        System.out.println("Burcunuz: koç ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 4: // nisan
                if(day >=1 && day<30){
                    if(day<21){
                        System.out.println("Burcunuz: koç ");
                    }
                    else{
                        System.out.println("Burcunuz: Boga ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 5: // mayis
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Burcunuz: Boga ");
                    } else {
                        System.out.println("Burcunuz: ikizler ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 6: // haziran
                if(day >=1 && day<30){
                    if(day<22){
                        System.out.println("Burcunuz: ikizler ");
                    }
                    else{
                        System.out.println("Burcunuz: yengec ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 7:// temmuz
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz: yengec ");
                    } else {
                        System.out.println("Burcunuz: aslan ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 8://agustos
                if(day >=1 && day<30){
                    if(day<24){
                        System.out.println("Burcunuz:aslan ");
                    }
                    else{
                        System.out.println("Burcunuz:basak ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 9://eylul
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        System.out.println("Burcunuz: basak  ");
                    } else {
                        System.out.println("Burcunuz: terazi ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 10: //ekim
                if(day >=1 && day<31){
                    if(day<24){
                        System.out.println("Burcunuz: terazi ");
                    }
                    else{
                        System.out.println("Burcunuz: akrep ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 11: // kasim
                if(day >=1 && day<30){
                    if(day<23){
                        System.out.println("Burcunuz: akrep");
                    }
                    else{
                        System.out.println("Burcunuz: yay ");
                    }
                }
                else{
                    isError = true;
                }
                break;

            case 12://aralik
                if(day >=1 && day<31){
                    if(day<22){
                        System.out.println("Burcunuz: yay ");
                    }
                    else{
                        System.out.println("Burcunuz: oglak ");
                    }
                }
                else{
                    isError = true;
                }
                break;
            default:
                isError =true;

        }
        if(isError){
            System.out.println("Hatali giris yaptınız,tekrar deneyiniz.");
        }
        else{

        }


    }
}