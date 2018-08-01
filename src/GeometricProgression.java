public class GeometricProgression {
    public static void getAllGeometricProgession(int[] arr) {
        if (arr.length < 3)
            return;
        for (int j = 1; j < arr.length - 1; j++) {
            int i = j - 1;
            int k = j + 1;
            while (true) {
                while (i >= 0 && k < arr.length && (arr[j] % arr[i] == 0) && (arr[k] % arr[j] == 0) && arr[j] / arr[i] == arr[k] / arr[j]) {
                    System.out.println("triplets found are ::" + arr[i] + " " + arr[j] + " " + arr[k]);
                    i--;
                    k++;
                }
                if (i < 0 || k >= arr.length)
                    break;

                if (arr[j] % arr[i] == 0 && arr[k] % arr[j] == 0) {
                    if (arr[j] / arr[i] > arr[k] / arr[j])
                        k++;
                    else
                        i--;
                } else {
                    if (arr[j] % arr[i] == 0)
                        k++;
                    else
                        i--;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 6, 8, 9, 12};
        getAllGeometricProgession(arr);

    }

}
