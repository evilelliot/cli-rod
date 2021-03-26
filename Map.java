class Map {
    private int xCorner = 33, yCorner = 33;
    public int x, y;
    public String layout[][] = new String[this.xCorner][this.yCorner];
    // Función para detectar colisiones
    public boolean setPos(int x, int y, String data){
        boolean r = false;
        if(outOfBoundaries()){
            if(this.layout[x][y] != null){
                this.layout[x][y] = data;
                r = true;
            }else{
                r = false;
            }
        }else{
            r = false;
        }
        
        return r;
    }
    private boolean outOfBoundaries(){
        boolean r = false;
        if(this.x <= this.xCorner&& this.y <= this.yCorner){
            r = true;
        }else{
            r = false;
        }
        return r;
    }
}
