      ******************************************************************
      * Author:
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. TORRES.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 NDISCOS       PIC X.
       01 DISCO       PIC 9(1).
       01 DESDE       PIC 9(1) VALUE 1.
       01 AUXIL       PIC 9(1) VALUE 2.
       01 HASTA       PIC 9(1) VALUE 3.
       PROCEDURE DIVISION.
           DISPLAY "INGRESE LA CANTIDAD DE DISCOS"
           ACCEPT NDISCOS

           IF NDISCOS IS NOT NUMERIC
               DISPLAY "DATO INGRESADO NO NUMERICO"
           ELSE
               IF NDISCOS = '0'
                   DISPLAY "EL DATO INGRESADO DEBE SER MAYOR A 0"
               ELSE
                   COMPUTE DISCO = FUNCTION NUMVAL(NDISCOS)
               END-IF
           END-IF

           CALL "MOVERDISCO" USING DISCO, DESDE, AUXIL, HASTA.
       END PROGRAM TORRES.
