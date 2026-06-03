import java.util.Scanner;

class Insertelements 
{

    public static void main(String[] args) 
	{
		Insertelements ie =new Insertelements();

        int ar[] = {10, 20, 30, 40, 50};
        int n = ar.length;

        int newArr[] = new int[n + 3];

        for (int i = 0; i < n; i++) {
            newArr[i] = ar[i];
        }

        int size = n;

        size = ie.insert(newArr, size, 15, 2);
        size = ie.insert(newArr, size, 25, 4);
        size = ie.insert(newArr, size, 60, 7);

        for (int i = 0; i < size; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    int insert(int ar[], int size, int element, int position) {

        for (int i = size; i >= position; i--) {
            ar[i] = ar[i - 1];
        }

        ar[position - 1] = element;

        return size + 1;
    }
}



/*class InsertSingle
{
    public static void main(String args[])
    {
        int ar[] = {12,24,36,48,60,72};

        int pos = 4;      // position to insert
        int value = 40;   // value to insert

        int br[] = new int[ar.length + 1];

        int j = 0;  // pointer for old array

        for(int i = 0; i < br.length; i++)
        {
            if(i == pos - 1)
            {
                br[i] = value;   // insert new value
            }
            else
            {
                br[i] = ar[j];   // copy old value
                j++;
            }
        }

        // Traverse
        for(int i = 0; i < br.length; i++)
        {
            System.out.print(br[i] + ", ");
        }
    }
}*/