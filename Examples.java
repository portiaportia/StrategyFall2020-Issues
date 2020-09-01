public class Something {
  public void turnover() {
		if(offence == true) {
			offence = false;
		}
		else {
			offence = true;
		}
	}
  
  public Player(String name) {
		this.name = name;
		setOffenceBehavior();
		setDefenceBehavior();	
	}
  
  // Bad style
  switch(num)
		{
			case 0:
				// System.out.println("hand blocks the puck");
				return "hand blocks the puck";
			case 1:
				// System.out.println("catches the puck");
				return "catches the puck";
			case 2:
				// System.out.println("blocks puck with knee pads");
				return "blocks puck with knee pads";
			case 3:
				// System.out.println("blocks puck with stick");
				return "blocks puck with stick";
			default:
				// System.out.println("error");
				return "error";
		}
}
