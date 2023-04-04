public class Elevator {
    private final int minLevel;
    private final int maxLevel;
    private int curLevel;
    public Elevator(int maxLevel){
        this.minLevel=0;
        this.maxLevel=maxLevel;
        this.curLevel=this.minLevel;
    }
    public Elevator(int minLevel,int maxLevel){
        this.minLevel=minLevel;
        this.maxLevel=maxLevel;
        this.curLevel=this.minLevel;
    }
    public int getCurLevel(){
        return curLevel;
    }
    public void callFrom(int level){
        System.out.println("The elevator was called from level "+level);
        if(level==curLevel){
            System.out.println("The elevator is already in level "+level);
            return;
        }
        else {
            move(curLevel,level);
            System.out.println("The elevator is here");
        }
    }
    public void goTo(int level){
        if(level<minLevel || level>maxLevel){
                System.out.println("Invalid level , please give a number between "+minLevel+" and "+maxLevel);
                return;
        }
        if(level==curLevel){
            System.out.println("You are already in level "+level);
            return;
        }
        move(curLevel, level);
    }


    public void move(int startLevel, int endLevel){
        if(startLevel<endLevel){
            moveUp(startLevel,endLevel);
        } else if (startLevel>endLevel) {
            moveDown(startLevel,endLevel);
        }
    }
    public void moveUp(int startLevel, int endLevel){
        System.out.println("Going up...");
        for(int i=startLevel;i<endLevel;i++){
            curLevel=i;
            System.out.println("Now you are at level "+i);
        }
    }
    public void moveDown(int startLevel, int endLevel){
        System.out.println("Going down...");
        for(int i=startLevel;i>=endLevel;i--){
            curLevel=i;
            System.out.println("Now at level "+i);
        }
    }
}
