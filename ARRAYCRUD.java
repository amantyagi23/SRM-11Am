public class ARRAYCRUD {

    int arr[];
    int index;

    ARRAYCRUD(int size) {
        arr = new int[size];
        this.index = 0;
    }

    public void addElement(int ele) {
        arr[index] = ele;
        index++;
    }

    public void printArray() {
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public boolean update(int ele,int i){
        if(){
            arr[i] = ele;
        }
    }

    public static void main(String[] args) {
        int ch = 0;

        do {
            System.out.println("Press 1 for Create Element");
            System.out.println("Press 2 Read array");
            System.out.println("Press 3 Update Array");
            System.out.println("Press 4 delete element");

        } while (ch != 9);
    }
}
