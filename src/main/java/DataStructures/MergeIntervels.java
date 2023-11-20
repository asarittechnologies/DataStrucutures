package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervels {
    public static void main(String[] args) {
        Interval i1 = new Interval(1, 2);
        Interval i2 = new Interval(3, 5);
        Interval i3 = new Interval(6, 7);
        Interval i4 = new Interval(9, 11);
        Interval i5 = new Interval(12, 16);

        Interval newInterval = new Interval(4,9);
        Interval new2 = new Interval(8,10);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(i1); intervals.add(i2); intervals.add(i3); intervals.add(i4); intervals.add(i5);
        MergeIntervels m = new MergeIntervels();
        m.mergeIntervals(intervals).stream().forEach(interval -> {
            System.out.print(interval.start);
            System.out.println();
            System.out.print(interval.end);
        });




    }
    public List<Interval> insertMergeIntervals(List<Interval> intervals, Interval newInterval){
        ArrayList<Interval> result = new ArrayList<Interval>();

        for(Interval interval: intervals){
            if(interval.end < newInterval.start){
                result.add(interval);
            }else if(interval.start > newInterval.end){
                result.add(newInterval);
                newInterval = interval;
            }else if(interval.end >= newInterval.start || interval.start <=
                    newInterval.end){
                newInterval = new Interval(Math.min(interval.start,
                        newInterval.start), Math.max(newInterval.end, interval.end));
            }
        }
        result.add(newInterval);
        return result;
    }
    public List<Interval> mergeIntervals(List<Interval> intervals){
        Collections.sort(intervals,new IntervalComparator());
        ArrayList<Interval> result = new ArrayList<Interval>();
        if(intervals == null){
            return intervals;
        }
        Interval previous = intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            Interval curr = intervals.get(i);
            if(previous.end >= curr.start){
                Interval merged = new Interval(previous.start, Math.max(previous.end,curr.end));
                previous = merged;

            }else{
                result.add(previous);
                previous = curr;
            }

        }
        result.add(previous);
        return result;
    }
    class IntervalComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }
    static class Interval{
        int start;
        int end;
        Interval(int start,int end){
            this.end=end;
            this.start=start;
        }
    }
}
