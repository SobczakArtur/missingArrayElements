package com.sobczak.artur;

public class Main {

    public static void main(String[] args) {

            int[] tab = {1, 5, 7, 11};

            int missingElements = 0;
            boolean elementFound;

            for (int elementToFind = 0; elementToFind <= tab[3]; elementToFind++) {
                elementFound = false;
                    for (int elementInArray : tab) {
                        if (elementToFind == elementInArray){
                        elementFound = true;
                    }
                }
                    if (!elementFound){
                        missingElements = elementToFind;
                        System.out.print(missingElements + " ");
                    }
            }
        }
    }
