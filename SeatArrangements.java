import java.util.ArrayList;
import java.util.List;

public class SeatArrangements {

    public static void main(String args[]) {
        SeatArrangements SA = new SeatArrangements();
        SA.seatArrangements();
    }

    public void seatArrangements() {

        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();
        int n = 6;
        // in.nextInt();//number of students
        String s = "LLRLLL";
        // in.nextLine();//It is a string like "LLRLLL" where i^th character is the
        // class of i^th student
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L')
                L.add(i + 1);
            else
                R.add(i + 1);
        }
        for (int k = 0; k < n / 2; k++) {
            int x = (L.size() > 0) ? L.remove(0) : R.remove(0);
            int y = 0;
            if (L.size() > 0) {
                y = findfrom(x, L, R);
            } else if (R.size() > 0) {
                y = findfrom(x, R, L);
            }
            System.out.println(x + " " + y);
        }

    }

    private int findfrom(int x, List<Integer> L, List<Integer> R) {
        int y = -1;
        int j = 0;
        do {
            y = L.get(j);
            j++;
        } while (Math.abs(y - x) == 1 && j < L.size());
        
        if (Math.abs(y - x) != 1)
            L.remove(new Integer(y));
        else
            y = findfrom(x, R, L);
        return y;
    }

}
