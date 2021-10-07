package game;

class WinGame {
      public static final int snake=1;
      public static final int ladder=2;
      public static final int win_state=100;
	public static void main(String[] args) {
		int player;
		int selfposition=0;
		int rollDie=(int) Math.floor(Math.random()*10)%7;
		selfposition=selfposition+rollDie;
		if(selfposition>win_state)
		{
			selfposition=selfposition+rollDie;
       System.out.println("palyer position:"+selfposition);
		}
		else if(selfposition<win_state)
		{
			selfposition=selfposition+rollDie;
			System.out.println("player position:"+selfposition);
		}
		else if(selfposition==win_state)
		{
			selfposition=selfposition+rollDie;
			System.out.println("winner");
		}

	}

}
