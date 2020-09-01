public class Something {
	

   public Forward(String name) {
	super(name);
	Random rOff = new Random();
	int rOffInt = rOff.nextInt(2);
	if(rOffInt == 0) {
		offenceBehavior = new PassBehavior();
	} else if(rOffInt == 1) {
		offenceBehavior = new ShootBehavior();
	}
	
	Random rDef = new Random();
	int rDefInt = rDef.nextInt(2);
	if(rDefInt == 0) {
		defenceBehavior = new ChasePuckBehavior();
	} else if(rDefInt == 1) {
		defenceBehavior = new BlockBehavior();
	}
  }
	
//Use !
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

//No need for checking for Null
public String play() {
	if(defenceBehavior != null && offense == false)
		  return defenceBehavior.play();
	  if(offenceBehavior != null && offense == true)
		  return offenceBehavior.play();
      return "";
 }
	
   //Put {}
   if(rand == 0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
	
//Use ==
public String play() {
		if (offence = true) {
			return this.offenceBehaviors.play();
		} else {
			return this.defenceBehavior.play();
		}
	}
}

//Add protected keyword for #
DefenseBehavior df;
OffenseBehavior off;
