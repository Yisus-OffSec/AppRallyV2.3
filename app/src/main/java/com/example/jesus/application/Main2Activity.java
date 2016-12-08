package com.example.jesus.application;

import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String vec[]={"Hola omo estas","bien","c","q","sd","como estas ?"};

    private String respuesta_correcta = "";
    private int no_pregunta = 1;
    private int score = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
    //    TextView puntaje = (TextView)findViewById(R.id.textView_puntaje);
        //Uno();

    }

    public void enviar_respuesta(View v){
        EditText leer = (EditText)findViewById(R.id.editText_r);
        //String lectura = String.valueOf(leer.getText());
     //   TextView puntaje = (TextView)findViewById(R.id.textView_puntaje);

        switch(no_pregunta)
        {
            case 0:
                break;
            case 1:
                respuesta_correcta=Uno();
                break;
            case 2:
                respuesta_correcta=Dos();
                break;
            case 3:
                respuesta_correcta=Tres();
                break;
            case 4:
                respuesta_correcta=Cuatro();
                break;
            case 5:
                respuesta_correcta=Cinco();
                break;
            case 6:
                respuesta_correcta=Seis();
                break;
            case 7:
                respuesta_correcta=Siete();
                break;
            case 8:
                respuesta_correcta=Ocho();
                break;
            case 9:
                respuesta_correcta=Nueve();
                break;
            case 10:
                respuesta_correcta=Diez();
                break;
            case 11:
                respuesta_correcta=Once();
                break;
            case 12:
                respuesta_correcta=Doce();
                break;
            case 13:
                respuesta_correcta=Trece();
                break;
            case 14:
                respuesta_correcta=Catorce();
                break;
            case 15:
                respuesta_correcta=Quince();
                break;
            case 16:
                respuesta_correcta=Dieciseis();
                break;
            case 17:
                respuesta_correcta=Diecisiete();
                break;
            case 18:
                respuesta_correcta=Dieciocho();
                break;
            case 19:
                respuesta_correcta=Diecinueve();
                break;
            case 20:
                respuesta_correcta=Veinte();
                break;
            case 21:
                respuesta_correcta=Veintiuno();
                break;
            case 22:
                respuesta_correcta=Veintidos();
                break;
            case 23:
                respuesta_correcta=Veintitres();
                break;
            case 24:
                respuesta_correcta=Veinticuatro();
                break;
            case 25:
                respuesta_correcta=Veinticinco();
                break;
            case 26:
                respuesta_correcta=Veintiseis();
                break;
            case 27:
                respuesta_correcta=Veintisiete();
                break;
            case 28:
                respuesta_correcta=Veintiocho();
                break;
            default:
                RelativeLayout pjuego = (RelativeLayout)findViewById(R.id.pantalla_juego);
                RelativeLayout pfinal = (RelativeLayout)findViewById(R.id.pantalla_final);
                pjuego.setVisibility(View.INVISIBLE);
                pfinal.setVisibility(View.VISIBLE);
                TextView sfinal = (TextView)findViewById(R.id.escorefinal);
                sfinal.setText(String.valueOf(score));
                break;
        }
        String lectura = String.valueOf(leer.getText());
        if(lectura.equals(respuesta_correcta)){
                score = score + 5;
        }
        /*else {
            score = score - 2;
        }*/
        //puntaje.setText(" " + score);
        no_pregunta++;
    }

    public String Uno()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Como se llama el jefe de departamento de ciencias tecnológicas");
        a1.setText("1.- Cnl. DAEN Álvaro Ríos Oliver");
        a2.setText("2.- Cnl DAEN Javier Duran Velasco");
        a3.setText("3.- Tcnl DAEN Gonzalo Veneros Cueto");
        a4.setText("4.- Cnl DAEN Julio Narváez Tamayo");
        correcta = "3";
        return correcta;
    }

    public String Dos()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("La primera derivada de la función f(t)=3t + 4(t)˄2");
        a1.setText("1.- f'(1)=3+4t");
        a2.setText("2.- f'(1)=3t+4");
        a3.setText("3.- f'(1)=3t+8");
        a4.setText("4.- f'(1)=3+8t");
        correcta = "4";
        return correcta;
    }

    public String Tres()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Diríjase al aula 103 y escanee el código QR, la clave es...");
        a1.setText("1.- OSI");
        a2.setText("2.- ASCII");
        a3.setText("3.- ROBOTECA");
        a4.setText("4.- BYTE");
        correcta = "2";
        return correcta;
    }

    public String Cuatro()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Que es el ciclo while?");
        a1.setText("1.- Crea una instrucción a travez de una condición");
        a2.setText("2.- Es el que ejecuta una o más instrucciones mientras la condición se cumpla");
        a3.setText("3.- Es una sentencia de decisión");
        a4.setText("4.- Es una sentencia switch");
        correcta = "2";
        return correcta;
    }

    public String Cinco()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Cuales son las características de la programación orientada a objetos");
        a1.setText("1.- Polimorfismo, principio de abstracción y encapsular");
        a2.setText("2.- Abstracción Encapsulamiento, Principio de ocultación, Polimorfismo Herencia");
        a3.setText("3.- Polimorfismo, Herencia y Encapsulamiento");
        a4.setText("4.- Principio de Abstracción, Polimorfismo y Herencia");
        correcta = "2";
        return correcta;
    }

    public String Seis()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Diríjase al aula 108 y escanee el código QR, la clave es...");
        a1.setText("1.- RISK");
        a2.setText("2.- XAMP");
        a3.setText("3.- BIT");
        a4.setText("4.- HAROLD");
        correcta = "3";
        return correcta;
    }



    public String Siete()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("¿Qué tecnología proporciona una solución al agotamiento de direcciones IPv4, al permitir múltiples dispositivos para compartir una dirección IP pública? ");
        a1.setText("1.- ARP");
        a2.setText("2.- DNS");
        a3.setText("3.- SMB");
        a4.setText("4.- NAT");
        correcta = "4";
        return correcta;

    }


    public String Ocho()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("¿Qué relación establece una sesión segura con cifrado de CLI a un conmutador Cisco? ");
        a1.setText("1.- una conexión Telnet");
        a2.setText("2.- una conexión SSH");
        a3.setText("3.- una conexión de consola");
        a4.setText("4.- una conexión AUX");
        correcta = "2";
        return correcta;

    }

    public String Nueve()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Entregar a la Ing. López un Origami Original y escanear el código QR que ella posee, la clave es...");
        a1.setText("1.- LINUX");
        a2.setText("2.- UNITY");
        a3.setText("3.- WINDOWSXP");
        a4.setText("4.- LARAVEL");
        correcta = "1";
        return correcta;

    }



    public String Diez()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Que segmento de Red es Privado");
        a1.setText("1.- 10.0.0.0/8");
        a2.setText("2.- 11.0.0.0/8");
        a3.setText("3.- 20.0.0.0/8");
        a4.setText("4.- 191.168.0.0/16");
        correcta = "1";
        return correcta;

    }

    public String Once()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Que numero en Decimal representa el siguiente binario 11110001");
        a1.setText("1.- 128");
        a2.setText("2.- 241");
        a3.setText("3.- 249");
        a4.setText("4.- 242");
        correcta = "2";
        return correcta;

    }

    public String Doce()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("El siguiente numero binario es 1111101010101010101001010111101");
        a1.setText("1.- PAR");
        a2.setText("2.- IMPAR");
        a3.setText("3.- PRIMO");
        a4.setText("4.- FIBONACCI");
        correcta = "2";
        return correcta;

    }

    public String Trece()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Diríjase a la garita cercana a la cancha de vóley y escanee el código QR, la clave es...");
        a1.setText("1.- TORRENT");
        a2.setText("2.- UNO");
        a3.setText("3.- TRES");
        a4.setText("4.- DOS");
        correcta = "4";
        return correcta;

    }

    public String Catorce()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("EL Ing. Ruiz es hincha de...");
        a1.setText("1.- REAL MADRID");
        a2.setText("2.- ATLETICO DE BILBAO");
        a3.setText("3.- BARCELONA");
        a4.setText("4.- ESPANYOL");
        correcta = "3";
        return correcta;

    }

    public String Quince()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Selecciona una metodología ágil");
        a1.setText("1.- SCRUM");
        a2.setText("2.- UWE");
        a3.setText("3.- UML");
        a4.setText("4.- CASCADA");
        correcta = "1";
        return correcta;

    }

    public String Dieciseis()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("UML es...");
        a1.setText("1.- Lenguaje de programación");
        a2.setText("2.- Lenguaje de modelado unificado");
        a3.setText("3.- Metodología ágil");
        a4.setText("4.- Plataforma de desarrollo en C++");
        correcta = "2";
        return correcta;

    }

    public String Diecisiete()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Cocomo es una técnica para...");
        a1.setText("1.- Estimar costos de desarrollo SW");
        a2.setText("2.- Documentar casos de uso");
        a3.setText("3.- Desarrollar Apis");
        a4.setText("4.- Hacer la Tesis");
        correcta = "1";
        return correcta;

    }

    public String Dieciocho()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Diríjase a prevención de guardia, la clave en el código QR es...");
        a1.setText("1.- ROBERTO");
        a2.setText("2.- FABRI");
        a3.setText("3.- COCHALO");
        a4.setText("4.- CHAMBI");
        correcta = "2";
        return correcta;

    }




    public String Diecinueve()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Un solo proveedor vende un producto para el que no hay sustitutos perfectos hace referencia a...");
        a1.setText("1.- Polio");
        a2.setText("2.- Oligopolio");
        a3.setText("3.- Monopolio");
        a4.setText("4.- Mercado");
        correcta = "3";
        return correcta;

    }

    public String Veinte()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("El mejor regulador del precio de un producto lo da el...");
        a1.setText("1.- Presidente");
        a2.setText("2.- Calculo matemático");
        a3.setText("3.- Supermercado");
        a4.setText("4.- Mercado");
        correcta = "4";
        return correcta;

    }

    public String Veintiuno()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Basado en UNIX");
        a1.setText("1.- Windows 8");
        a2.setText("2.- MacOS");
        a3.setText("3.- DOS");
        a4.setText("4.- Windows 10");
        correcta = "2";
        return correcta;

    }

    public String Veintidos()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("La arquitectura de las computadoras ");
        a1.setText("1.- Von Neumann");
        a2.setText("2.- De dos pisos");
        a3.setText("3.- Cliente Servidor");
        a4.setText("4.- Windows");
        correcta = "1";
        return correcta;

    }


    public String Veintitres()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("No basado en Linux");
        a1.setText("1.- Ubuntu");
        a2.setText("2.- Debian");
        a3.setText("3.- MacOS");
        a4.setText("4.- Kali");
        correcta = "3";
        return correcta;

    }



    public String Veinticuatro()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Diríjase a la biblioteca y escanee el código QR, la clave es...");
        a1.setText("1.- TERA");
        a2.setText("2.- NANO");
        a3.setText("3.- PICO");
        a4.setText("4.- GIGA");
        correcta = "4";
        return correcta;

    }

    public String Veinticinco()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("No");
        a1.setText("1.- Ubuntu");
        a2.setText("2.- Debian");
        a3.setText("3.- MacOS");
        a4.setText("4.- Kali");
        correcta = "3";
        return correcta;

    }

    public String Veintiseis()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("La Palabra 'FELICIDAD' encriptado por el método Cesar es...");
        a1.setText("1.- IHOLFLGDG");
        a2.setText("2.- HOFLIGDIL");
        a3.setText("3.- FLLGGDHOI");
        a4.setText("4.- DIGLIHOFL");
        correcta = "1";
        return correcta;

    }

    public String Veintisiete()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("La palabra 'ANIMAL' encryptada por el método de transposición con palabra clave 'RIO' es");
        a1.setText("1.- LAMINA");
        a2.setText("2.- NIAALM");
        a3.setText("3.- MALIAN");
        a4.setText("4.- MILANA");
        correcta = "2";
        return correcta;

    }

    public String Veintiocho()
    {
        String correcta;
        TextView q = (TextView)findViewById(R.id.textView_pregunta);
        TextView a1 = (TextView)findViewById(R.id.textView_r1);
        TextView a2 = (TextView)findViewById(R.id.textView_r2);
        TextView a3 = (TextView)findViewById(R.id.textView_r3);
        TextView a4 = (TextView)findViewById(R.id.textView_r4);
        q.setText("Felicidades! este es el último requisito, Busque los 4 Pokemon que falta por el 4to piso, tomese una foto con alguien de Octavo y muestre lo requerido a la Ing Lopes para obtener la Clave Final.");
        a1.setText("CUAL");
        a2.setText("ES");
        a3.setText("LA");
        a4.setText("CLAVE");
        correcta = "5";
        return correcta;

    }

}
