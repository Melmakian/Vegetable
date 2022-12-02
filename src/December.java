import java.util.ArrayList;
import java.util.List;

public class December {
    public static class Garden{
        public final List<String> fruits = new ArrayList<>();
        public final List<String> vegatables = new ArrayList<>();

        public synchronized  void  addFruit(int index, String fruit){
            fruits.add(index, fruit);
        }
        public synchronized  void removeFruit(int index){
            fruits.remove(index);
        }
        public synchronized void addVegetable(int index, String vegetable){
            vegatables.add(index, vegetable);
        }
        public synchronized void removeVegetable(int index){
            
        }
    }
}
