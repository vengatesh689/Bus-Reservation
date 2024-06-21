package BUSreserve;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap){
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;
    }
    public int getbusno(){
        return busno;
    }
    public void setbusno(int no){
        busno = no;
    }
    public boolean getAc(){
        return ac;
    }
    public void setAc(boolean val){
        ac = val;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity = cap;
    }
    void displaybusinfo(){
        System.out.println("Bus no : "+busno+" AC : "+ac+" Capacity : "+capacity);
    }
}
