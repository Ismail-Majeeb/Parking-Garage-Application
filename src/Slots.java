package Garagee
public class Slots {
    private int id;
    private float width;
    private float depth;
    private int   nums_of_vehicles;
    private boolean slot_empty;
    private Vehicle arr[];
    public slots(int i ,float w , float d,int nums_vehicles){
        id = i;
        width = w;
        depth = d;
        slot_empty = true;
        nums_of_vehicles = 0;
        arr = new Vehicle[nums_vehicles];
    }
    public void set_id(int i){
        id = i;
    }

    public void add_car(float w, float d,String m,int y){
        Vehicle v = new Vehicle();
        v.set_width(w);
        v.set_depth(d);
        v.set_model(m);
        v.set_year(y);
        arr[nums_of_vehicles] = v;
        nums_of_vehicles += 1;
        
    }

    public void set_dimantion (int w, int d){
        width = w;
        depth = d;
    }

   

    

    public int get_id(){
        return this.id;
    }

     

    public float get_width (){
        return width;
    }

 

 public float get_depth () {
        return depth;
 }
 public boolean  check_empty() {
        return  slot_empty;
 }

 
public void display_slots(){
        System.out.print("The number of available slots is  ");
        System.out.print("The location of available slots is  ");
}
  
}