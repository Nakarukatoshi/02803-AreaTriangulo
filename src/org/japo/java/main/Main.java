/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        double area, base, altura;

        //Advertencia decimales
        System.out.println("Recuerde, los decimales se separan con un punto.");

        //Bloque principal
        try {
            //Solicitar base
            System.out.printf("%nPor favor, inserte la base del triángulo: ");
            base = SCN.nextDouble();
            SCN.nextLine();

            //Solicitar triángulo
            System.out.print("Por favor, inserte la altura del triángulo: ");
            altura = SCN.nextDouble();
            SCN.nextLine();

            //Calcular área
            area = base * altura / 2;

            //Salida
            System.out.printf(Locale.ENGLISH,
                    "Usted dio la base ..........: %.2f%n"
                    + "También nos dio la altura ..: %.2f%n"
                    + "Y el área es ...............: %.2f%n",
                    base, altura, area);
        } catch (Exception e) {
            System.out.println("El valor introducido no es válido.");
        }
    }
}
