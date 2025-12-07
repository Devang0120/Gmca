class RectAngle{
   
    
    static int count =0;
    float l, w ;

    RectAngle(){
      this(4,8);
    }


    RectAngle( RectAngle obj ){
        this(obj.l,obj.w);
    }
    RectAngle(float l, float w){
        this.l = l ;
        this.w = w ;
        count++;
    }

    public float area(){
        return l * w ;
    }

    void display(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Length : " + l + "\nWidth : " + w + "\nArea : " + area() );
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        
        RectAngle rect1 = new RectAngle(4,9);
        RectAngle rect2 = new RectAngle(4.2f,7.2f);
        RectAngle rect3 = new RectAngle();
        RectAngle rect4 = new RectAngle(rect2); 
        rect1.display();
        rect2.display();
        rect3.display();
        rect4.display();
        System.out.println("Total Rectangle Objects : "+ RectAngle.count);
    }

}
