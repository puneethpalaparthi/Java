import java.util.*;

class Bs
{    
    
    public static void swap(int[] ar, int i, int j)
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void readarr(int[] ar, int n)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

  
    public static void printarr(int[] ar, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(ar[i]);
        }
    }
    
  
    public static void sort(int[] ar, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (ar[i] > ar[j])
                {
                    swap(ar, i, j);
                }
            }
        }
    }
    
  
    public static void search(int[] ar, int n, int key)
    {
        int start = 0, end = n - 1, mid, pos = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to find the position:");
        key = sc.nextInt();
        
        while (start <= end)
        {
            mid = (start + end) / 2;
            if (key == ar[mid])
            {
                pos = mid;
                break;
            }
            else if (key < ar[mid])
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }
        if (pos >= 0)
        {
            System.out.println("The key is found at index: " + pos);
        }
        else
        {
            System.out.println("The key is not found");
        }
    }
    
    public static void main(String[] args)
    {
        int[] ar = new int[100];
        int n, key;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        
        System.out.println("Enter the elements of array:");
        readarr(ar, n);
        
        sort(ar, n);
        
        System.out.println("The array after sorting:");
        printarr(ar, n);
        
        
        search(ar, n, key);
    }
}
