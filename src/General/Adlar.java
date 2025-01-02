package General;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adlar {
    public static void main(String[] args) {

        Map< String, List<String>> adlar = new HashMap<>(); //oglan ve qiz adlari saxlam map

        //oglan ve qiz adlari saxlayan siyahi
        List<String> oglanAdi = new ArrayList<>();
        List<String> qizAdi = new ArrayList<>();
        oglanAdi.add("Samir");
        oglanAdi.add("Tural");
        oglanAdi.add("Fariz");

        qizAdi.add("Lala");
        qizAdi.add("Fatma");
        qizAdi.add("Sebish");
        //Siyahilari Map elave edirik

        adlar.put("Oglan Adi" , oglanAdi);
        adlar.put("Qiz Adi", qizAdi);

       // neticeni cap edrik
        System.out.println("Qiz adi" + adlar.get("Qiz Adi"));
        System.out.println("Oglan adi" + adlar.get("Oglan Adi"));

        }
    }
