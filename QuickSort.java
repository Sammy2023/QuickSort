public class QuickSort {

        //returns pivot for the array
        //Like parting the array with all # <pivot is on left
        //and # > pivot is on the right
        static int Partition (int[] v, int left, int right) {

            //Initial pivot targe posistion
            //Initial pivot targe posistion

            int p = left;

            //Pivot value
            int pivot = v[left];

            //Tranverse array
            for(int now = left; now<=right; now++){
                System.out.println(v[now] + " " + pivot+ " " + p);
                if(v[now]<pivot){
                    Swap(v, p, now);
                    p++;
                }

            }

            //Place pivot in target position
            Print(v);
            System.out.println();

            return p;

        }

    static void Sort(int[] v, int left, int right)
    {
        if(left < right)
        {
            int p = Partition(v, left, right);
            Sort(v, left, p -1);
            Sort(v, p+1, right);
        }
    }

    static void Swap ( int v[], int index1, int index2) {
        int temp = v[index1];
        v[index1] = v[index2];
        v[index2] = temp;
    }

    static void Sort( int[] v)
    {
        Sort(v, 0, v.length-1);
    }

    static void Print(int[] v )
    {
        for( int i =0; i<v.length; i++)
        {
            System.out.print(" " + v[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] v = {6, 0, 3, 2, 1};
        Sort(v);
        Print(v);
    }


}



