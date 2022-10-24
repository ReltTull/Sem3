public class TricycleCar extends Car
{
    public TricycleCar()
    { // задает количество колес, которые для класса TricycleCar всегда будет равно 3.
        this.setWheelsNumber(3);
    }
    
    @Override
    public void moving() 
    {
        fly();
    }
    private void fly() {}
}
