class Character {
    /**
     * Name, type, health points, magic points
     */
    protected String name;
    protected String type;
    protected float hp;
    protected float mp;
    protected int x, y;
    // Deberá de inicializar el objeto con los atributos mencionados
    Character(String n, String t, float h, float m, int x, int y){
        // Las coordenadas x,y deben cumplir que [x,y] >= 0 [x,y] <= 32
        this.name = n;
        this.type = t;
        this.hp   = h;
        this.mp   = m;
        this.x    = x;
        this.y    = y;
        // Llamar a validar las coordenadas
        if(!validateCoordinates()){
            System.out.println("No puedes iniciar el objeto en dichas coordendas: " + this.x + "," + this.y);
        }
    }    
    // Validar las coordenadas introducidas
    private boolean validateCoordinates(){
        boolean data = false;
        if(this.x < 0 || this.y > 32){
            data = false;
        }else{
            data = true;
        }
        return data;
    }
    
}
