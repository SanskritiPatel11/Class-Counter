public class Counter {
    
        private int count = 10; 
    
        
        public void increment() {
            count++;
        }
    
       
        public int getCount() {
            return count;
        }
    
        
        public static void main(String[] args) {
            Counter counter = new Counter();
    
            counter.increment();
            counter.increment();
    
            System.out.println("Current count: " + counter.getCount());
        }
    
}
