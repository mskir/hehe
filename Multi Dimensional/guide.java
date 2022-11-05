public class guide {

    public static void main(String[] args) throws Exception {
        
    //lagay characters or numbers
    char [][] mdArray = {{'K','I','R'}, {'M','J','R'}, {'G','A','E'}};

    //multi dimensional array is NESTED (has outer and inner loop)
    //OUTER LOOP = for (int i = 0; i < mdArray.length; i++) {}
    for (int row = 0; row < 3; row++) {

    //line break (no line break = K I R M J R G A E)
    System.out.println("  ");

    //INNER LOOP = for (int j = 0; j < mdArray.length; j++) {}
        for (int column = 0; column < 3; column++) {
            System.out.print(mdArray[row][column] + " ");
        }   
    //OUTPUT 
    //K I R
    //M J R
     //G A E  
    }
    //1ST PATTERN = K I R
    System.out.println("\n1. First LETTERS");
    for (int row = 0; row < 3; row++) {
        System.out.println("  ");

            for (int column = 0; column < 3; column++) {
                if (row == 0) {
                System.out.print(mdArray[row][column] + " ");
            }   
      }
  }
    //2ND PATTERN = M J R
    System.out.println("\n2. SECOND LETTERS");
    for (int row = 0; row < 3; row++) {
        System.out.println("  ");

           for (int column = 0; column < 3; column++) {
               if (row == 1) {
               System.out.print(mdArray[row][column] + " ");
           }   
     }
 }
    //3RD PATTERN = G A E
    System.out.println("\n3. THIRD LETTERS");
    for (int row = 0; row < 3; row++) {
        System.out.println("  ");
      
          for (int column = 0; column < 3; column++) {
              if (row == 2) {
              System.out.print(mdArray[row][column] + " ");
          }   
    }
}
    //4TH PATTERN = K M G
    System.out.println("\n4. FOURTH LETTERS");
    for (int row = 0; row < 3; row++) {
        System.out.println("  ");
      
          for (int column = 0; column < 3; column++) {
              if (column == 0) {
              System.out.print(mdArray[row][column] + " ");
          }   
    }
}
     //5TH PATTERN = I J A
     System.out.println("\n5. FIFTH LETTERS");
     for (int row = 0; row < 3; row++) {
        System.out.println("  ");
       
           for (int column = 0; column < 3; column++) {
               if (column == 1) {
               System.out.print(mdArray[row][column] + " ");
           }   
     }
 }
     //6TH PATTERN = K M G
     System.out.println("\n6. SIXTH LETTERS");
     for (int row = 0; row < 3; row++) {
        System.out.println("  ");
       
           for (int column = 0; column < 3; column++) {
               if (column == 2) {
               System.out.print(mdArray[row][column] + " ");
           }   
     }
 }
 //Para makuha yung sa middle
 //(below inner loop) if (condition) and else if ()
  //7TH PATTERN = M J
  //              G A
  System.out.println("\n7. SEVENTH LETTERS");
  for (int row = 0; row < 3; row++) {
     System.out.println("  ");
    
        for (int column = 0; column < 3; column++) {
            if (row == 1 && (column == 0 || column == 1)) {
                System.out.print(mdArray[row][column] + " ");
        //use && to see row and column
            } 
        else if (row == 2 && (column == 0 || column == 1)) {
            System.out.print(mdArray[row][column] + " ");
        }
        else {
            System.out.print(" ");
        }
     }
  }
    //8TH PATTERN 
    //di pwedeng may same na row :))
    System.out.println("\n8. EIGHTH LETTERS");
       for (int row = 0; row < 3; row++) {
           System.out.println("  ");
    
        for (int column = 0; column < 3; column++) {
         if (row == 1 && (column == 1)) {
            System.out.print(mdArray[row][column] + " ");
        }

        else if (row == 0 && (column == 0 || column == 2)) {
            System.out.print(mdArray[row][column] + " ");
        } 

        else if (row == 2 && (column == 0 || column == 2)) {
            System.out.print(mdArray[row][column] + " ");
        }

        else {
            System.out.print(" ");
        }
  }
}
 }
}





