package Garagee
public class Vehicles {
    private int id;
    private float width;
    private float depth;
    private String model;
    private int year;
    
    public void set_id(int i){
        id = i;
    }
    public void set_width(float w){
        width = w;
    }
    public void set_depth(float d){
        depth = d;
    }
    public void set_model(String m){
        model = m;
    }
    public void set_year(int y){
        year = y;
    }
    
    public int get_id(){
        return id;
    }
    public float get_width(){
        return width;
    }
    public String get_model(){
        return model;
    }
    public int get_year(){
        return year;
    }
    public float get_depth(){
        return depth;
    }
    
}