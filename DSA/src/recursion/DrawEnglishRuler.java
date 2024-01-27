package recursion;

public class DrawEnglishRuler {
    public static void main(String[] args) {
        drawRuler(2,2);


    }
    static void drawRuler(int inch,int majorLength){
        drawLine(majorLength,0);
        for (int j = 1; j <= inch; j++){
            drawInterval(majorLength-1);
            drawLine(majorLength, j);
        }
    }
    static void drawInterval(int centralLength){
        if(centralLength>0){
            drawInterval(centralLength-1);
            drawLine(centralLength);
            drawInterval(centralLength-1);
        }

    }
    static void drawLine(int tickLength,int tickLabel){
            for(int j=0;j<tickLength;j++){
                System.out.print("-");
            }
            if(tickLabel>=0){
                System.out.print(tickLabel);
            }
        System.out.println();
    }
    static void drawLine(int tickLength){
        drawLine(tickLength,-1);
    }
}
