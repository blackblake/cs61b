package timingtest;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }


    public static void main(String[] args) {
        timeAListConstruction();
    }

    //generates the table above for an AList
    public static void timeAListConstruction() {
        AList<Integer> Ns = new AList<Integer>();
        AList<Double> times = new AList<Double>();
        AList<Integer> opCounts = new AList<Integer>();

        int n=1000;
        for(int i=0;i<8;i++){
            AList<Integer> test = new AList<Integer>();
            Stopwatch sw = new Stopwatch();
            for(int j=0;j<n;j++) {
                test.addLast(j);
            }
            double addtime = sw.elapsedTime();
            Ns.addLast(n);
            times.addLast(addtime);
            opCounts.addLast(n);

            n*=2;
        }

        printTimingTable(Ns,times,opCounts);
    }
}
