public class Circle {
    Integer x, y;
    Integer r;
    Double a, b;
    Double c;
    private Double radious;

    public double radius() { return radious; }
    public Circle (Integer x, Integer y, Integer r){
        this.x = x;
        this.y = y;
        this.r = r;
        //System.out.println("我的圓心在座標("+x+","+y+"), 半徑是"+r );
        System.out.println(String.format("我的圓心軸在(%d, %d), 半徑為 %d",x,y,r));
    }
    public Circle (Double  a, Double  b, Double  c){
        this.a = a;
        this.b = b;
        this.c = c;
        //System.out.println("我的圓心在座標("+x+","+y+"), 半徑是"+r );
        System.out.println(String.format("我的圓心軸在(%.2f, %.2f), 半徑為 %.2f",a,b,c));
    }
    public Circle (Double  a, Double  b){
        this.a = a;
        this.b = b;
        this.c = 1.0;
        //System.out.println("我的圓心在座標("+x+","+y+"), 半徑是"+r );
        System.out.println(String.format("我的圓心軸在(%.2f, %.2f), 半徑為 %.2f",a,b,c));
    }

    public Circle (Double radious){
        a = b = 0.0;
        radious = radious;
        //System.out.println("我的圓心在座標("+x+","+y+"), 半徑是"+r );
        System.out.println(String.format("我的圓心軸在(%.2f, %.2f), 半徑為 %.2f",a,b,radious));
    }

//    public Circle (){
//        x = y = 0;
//        r = 1;
//        //System.out.println("我的圓心在座標("+x+","+y+"), 半徑是"+r );
//        System.out.println(String.format("我的圓心軸在(%d, %d), 半徑為 %d",x,y,r));
//    }

}
