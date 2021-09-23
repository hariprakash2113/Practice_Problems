package Practices;
class Ex{
    private int x = 0;
    Ex(int x){
        this.x=x;
    }
    void modify(int f){
        x*=10;
        x+=f;
    }

    int get(){
        return ++x;
    }

}
public class Encaps {
    public static void main(String[] args) {
        Ex i = new Ex(7); 
        i.modify(6);
        System.out.print(i.get());
    }
    
}
