package game;

class CheckSnakeLadder {
  public static final int Ladder=1;
  public static final int snake=2;
	public static void main(String[] args) {
	int currentposition=0,selfposition=0;
	int rollDie=(int) Math.floor(Math.random()*10)%7;
     if(rollDie==Ladder)
     {
    	currentposition=selfposition+rollDie; 
    	System.out.println("player1 postion:"+currentposition);
     }
     else if(rollDie==snake)
     {
    	 currentposition=selfposition-rollDie;
    	 System.out.println("player1 postion:"+currentposition);
     }
     else
     {
    	 currentposition=selfposition;
    	 System.out.println("No Play");
     }
	}
	

}
