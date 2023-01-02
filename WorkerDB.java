import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkerDB implements Iterable<Worker> {
    private List<Worker> listWorkers;

    public WorkerDB() {
        this.listWorkers = new ArrayList<>();
    }

    public void addWorker (Worker worker) {
        this.listWorkers.add(worker);
    }

    @Override
    public Iterator<Worker> iterator() {
        return new Iterator<>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < listWorkers.size();
            }

            @Override
            public Worker next() {
                Worker w = listWorkers.get(counter);
                counter++;
                return w;
            }
        };
    }


    //    public static void main(String[] args) {
//        List<Worker> listWorkers = new ArrayList<>();
//        List<Object> list = new ArrayList<>();
//        Worker w1 = new Worker("Dima", "IT", "321321321");
//        Worker w2 = new Worker("Sanya", "IT", "3271");
//        String str = "asdfasdf";
//        listWorkers.add(w1);
//        list.add(str);
//        list.add(w1);
//
//    }
}
