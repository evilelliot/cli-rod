class ClassPlayer extends Character{
    ClassPlayer(String n, String t, float h, float m, int x, int y){
        super(n,t,h,m,x,y);
    }
    @Override
    public String toString(){
        char s = ',';
        return this.name + s + this.type + s + this.hp + s + this.mp + s + this.x + s + this.y;
    }
}
