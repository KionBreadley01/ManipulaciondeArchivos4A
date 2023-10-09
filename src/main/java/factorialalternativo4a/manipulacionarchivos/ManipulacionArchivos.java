/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorialalternativo4a.manipulacionarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROBERTO
 */
public class ManipulacionArchivos {
    public static void  leerArchivo(String name){
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        String linea;
        try{
            //Crar un apunatador al archivo fisico 
            archivo = new File("C:\\archivos\\" + name + ".txt");
            //Abrimos el achivos para lectura 
            reader = new FileReader(archivo);
            //Confugurar el bufer para leer datos del archivo 
            bufer = new BufferedReader(reader);
            //lectutra del contenido del archivo 
            while((linea = bufer.readLine())!=null){
                System.out.println("Linea leida:" + linea);
            }
            reader.close();
        }catch( IOException e){
            System.out.println("Error al leer el archivo:" + e.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader (
                new InputStreamReader(System.in));
        String fileName;
        
        System.out.println("lectura de un archivo de texto");
        System.out.println("Escribe el nombre del archivo:");
        fileName = bufer.readLine();
        leerArchivo(fileName);
        
        
        
    }
}
