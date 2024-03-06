/*
1. Scrivere un programma in Java che contenga i seguenti metodi:
- getMin(): Prende in input un array di int e restituisce il minimo fra gli elementi presenti
- getMaxEvenLength(): Prende in input un array di stringhe e restituisce la massima lunghezza pari
- getShorterStringInOddIndex(): Prende in input un array di stringhe e restituisce la stringa più corta fra quelle presenti in un indice dispari
2. Implementare una classe Student definita dai seguenti attributi:
- name: String
- bestMark: double
I seguenti vincoli vanno implementati quando si modificano i valori delle variabili d'istanza nel costruttore e nei setter:
- La stringa "name" non può essere vuota
- Il valore di bestMark dev'essere compreso fra 0.0 e 5.0
3. Scrivere un metodo main in cui si effettuano le seguenti operazioni:
- Viene inizializzato un array di 3 oggetti Student
- Viene creato un array di String contenente tutti i nomi degli studenti
- Viene creato un array di int contenente tutti i migliori voti degli studenti trasformati in valori interi
- Vengono chiamati i metodi scritti al punto 1 nell'array appena creato ed il risultato viene stampato a schermo
*/

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Student[] student = new Student[]{new Student("Giorgio", 2),
                new Student("Lucio", 4),
                new Student("Andrea", 3)};
        String[] nameStudents = {student[0].getName(), student[1].getName(), student[2].getName()};
        int[] bestMarks = {(int)student[0].getBestMark(), (int)student[1].getBestMark(), (int)student[2].getBestMark()};
        System.out.println("Names of the student are: " + Arrays.toString(nameStudents));
        System.out.println("Minimum value is: " + getMin(bestMarks));
        System.out.println("Max even length is: " + getMaxEvenLength(nameStudents));
        System.out.println("Shorter string in odd index is: " + getShorterStringInOddIndex(nameStudents));

    }

    public static int getMin(int[] array) {
        int element = array[0];
        for (int i = 0; i < array.length; i++) {
            if (element > array[i]) {
                element = array[i];
            }
        }
        return element;
    }

    public static int getMaxEvenLength(String[] array) {
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            if (element < array[i].length() && array[i].length() % 2 == 0) {
                element = array[i].length();
            }
        }
        return element;
    }

    public static String getShorterStringInOddIndex(String[] array) {
        int minLength = Integer.MAX_VALUE;
        String element = "";
        for (int i = 0; i < array.length; i++) {
            if (minLength > array[i].length() && i % 2 != 0) {
                minLength = array[i].length();
                element = array[i];
            }
        }
        return element;
    }
}