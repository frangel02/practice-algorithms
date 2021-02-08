public class ComparingArrays {

    public static void main(String []args){

            int primerArray [] = {1,2,1,3,5};
            int arrayTow [] = {1,6,7,8};
            
            
           int numberMostRepetly =  validateArrays(primerArray,arrayTow);

           System.out.println(numberMostRepetly);


    }
    
    
    public static int validateArrays(int primerArray[], int arrayTow[]){

        int numVeces = 0;
        
        for(int i = 0; i< primerArray.length; i++){

            for(int c = i+1; c < primerArray.length; c++){

                if(primerArray[i] == primerArray[c]){
                    numVeces = primerArray[c];
                    // System.out.println("Numero que mas se repite");
                    //System.out.println(numVeces);
                }
            }

            for(int a = 0; a < arrayTow.length; a++){

                if(numVeces == arrayTow[a]){
                   // System.out.println(numVeces);
                    return numVeces;
                }
            }
        }

        return numVeces;

    }
}
