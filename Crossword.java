 

public class Crossword
   {
   private Square[][] puzzle;
   
   public Crossword()
      {
      puzzle = new Square[5][5];  
      for(int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            puzzle[row][col] = new Square( true, 0 );    
            } // end inner for
         } // end outer for
         
         
      } // end zero-arg constructor
   
      public Crossword( boolean[][] blackSquares )
      {
       
          int i = 0;
          puzzle = new Square[blackSquares.length][blackSquares[0].length];
        for(int r = 0; r < blackSquares.length; r++){
           for(int c = 0; c < blackSquares[0].length; c++){
               
               if(toBeLabeled(r,c, blackSquares)){
                     i++;
                    
                    puzzle[r][c] = new Square(blackSquares[r][c], i);
                    //puzzle[r][c] = cross;
               } else{
                    puzzle[r][c] = new Square(blackSquares[r][c], 0) ;
                    //puzzle[r][c] = cross;
               }
          }
        }
     }
      // end one-arg constructor 
       
   private boolean toBeLabeled( int r, int c, boolean[][] blackSquares )
      {
       boolean result;
     if(blackSquares[r][c]){
          result = false;
     }else if(r == 0 || c == 0){
          result = true;
     } else if(blackSquares[r-1][c] || blackSquares[r][c-1]){
          result = true;
     } else{
          result = false;
     }
     return result; 
      } // end method toBeLabeled
      
      public String toString()
      {
          String output = new String();
      
          for( int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            if( puzzle[row][col].getIsBlack() == true )
               {
               output += (char)(9608) + "\t";   // 9608 adds a black square
               } 
            else
               {
                   output += puzzle[row][col].getNum() + "\t"; //prints number of square
               
               } // end else 
            } // end inner for
         output += "\n";      
         } // end outer for
         return output;  
      } // end method toString()
} // end class Crossword
