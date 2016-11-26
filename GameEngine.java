
public class GameEngine{
    private int[] player=new int[4];
    int c;
    public GameEngine(){}

    public void run(){
        player[0]=30;
        player[1]=30;
        player[2]=30;
        player[3]=30;
        int pn=0;
        c=0;
        Dice d1=new Dice();
        Dice d2=new Dice();
        Dice d3=new Dice();

        while(c<120){
            for(pn=0;pn<4;pn++)
            System.out.println("Its player "+ (pn+1)+"'s turn");    
            if(pn>2){
                    distribute(d1.roll(),pn);
                    distribute(d2.roll(),pn);
                    distribute(d3.roll(),pn);
                }
                else if(pn>1){
                    distribute(d1.roll(),pn);
                    distribute(d2.roll(),pn);
                }
                else if(pn>0){
                    distribute(d1.roll(),pn);
                }else{}
          
        }

    }

    private void distribute(String s, int pn){
        System.out.println("Rolls a "+s);
        if(s.equals("L")){
        if(pn==0)player[3]+=1;
        else{
        player[pn-1]+=1;
        }
        }
                if(s.equals("R")){
        if(pn==3)player[0]+=1;
        else{
        player[pn+1]+=1;
        }
        }
                if(s.equals("C")){
        c++;
        }
            
    }
}