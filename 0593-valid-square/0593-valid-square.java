class Solution {
     public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        if (!halper(p1, p2, set) || !halper(p1, p3, set) || !halper(p1, p4, set) ||
                !halper(p2, p3, set) || !halper(p3, p4, set) || !halper(p2, p4, set)) {
            return false;
        }
        return set.size() == 2 ? true : false ;
    }

    private boolean halper(int[] e, int[] p, Set<Integer> set) {
          if (e[0] == p[0] && e[1] == p[1]) return false;
          int d1 = e[0] - p[0];
          int d2 = e[1] - p[1];

          int s = d1*d1+d2*d2;
          set.add(s);
          return true;
          
        
    }
}