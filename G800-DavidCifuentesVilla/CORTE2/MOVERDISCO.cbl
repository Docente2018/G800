      ******************************************************************
      * Author:
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. MOVERDISCO.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 CONTADOR        PIC 9(3).
       LINKAGE SECTION.
       01 DISCO       PIC 9(1).
       01 DESDE       PIC 9(1).
       01 AUXIL       PIC 9(1).
       01 HASTA       PIC 9(1).
       PROCEDURE DIVISION USING DISCO, DESDE, AUXIL, HASTA.
           IF DISCO > 0
              SUBTRACT 1 FROM DISCO
              CALL "MOVERDISCO" USING CONTENT DISCO, DESDE, HASTA, AUXIL
              ADD 1 TO DISCO
              ADD 1 TO CONTADOR
              DISPLAY CONTADOR ") MUEVA DISCO " DISCO " DESDE TORRE "
                                                DESDE " HASTA " HASTA
              SUBTRACT 1 FROM DISCO
              CALL "MOVERDISCO" USING CONTENT DISCO, AUXIL, DESDE, HASTA
           END-IF
           GOBACK.
       END PROGRAM MOVERDISCO.
