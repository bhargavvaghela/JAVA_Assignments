class Tile{
	int s=4;
}

class Floor extends Tile{

	int M=13;
	int N=12;

	int totalTiles(Tile t){

		if (N % s == 0)  
    { 
  
        N = N / s; 
    } 
    else 
    { 
  
      
        N = (N / s) + 1; 
    } 
  
    if (M % s == 0)  
    { 
  
   
        M = M / s; 
    } 
    else 
    { 
          
        // one more tile required 
        M = (M / s) + 1; 
    } 
  		return M * N; 
	}

}

class Q42{
	public static void main(String[] args) {
		
  		Tile t1 = new Tile();
  		Floor f1 = new Floor();

  		f1.totalTiles(t1)
 
	}
}





