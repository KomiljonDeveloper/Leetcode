class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int a=nums1.length;
        int b=nums2.length;int x=a;
        int c[] = new int[a+b];
        for (int i = 0; i < a; i++) {
            c[i] = nums1[i];
        }
        for (int i = 0; i < b; i++) {
            c[x] = nums2[i];
            x++;
        }
        int y=0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if (c[i]>c[j]){
                    y=c[i];
                    c[i] = c[j];
                    c[j] = y;
                }
            }
        }
        
        double s= 0;
        if (c.length%2==0){
          s=(double) (c[c.length/2] + c[c.length/2-1])/2.;
          return s;
        }else {
            s=c[(c.length-1)/2];
               return s;
        }



    }
    }
