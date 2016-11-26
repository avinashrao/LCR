
public class Dice
{int v;
    public Dice()
    {v=0;
    }

    public String roll()
    {v=(int)(3*Math.random())+1;
     if(v==1)return "L";
     if(v==2)return "C";
     if(v==3)return "R";
     return "";
    }
}
