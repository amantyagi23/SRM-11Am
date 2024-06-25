import java.util.Arrays;

public class minNoPlatform {
    static int findPlatform(int arr[], int dep[], int n) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        // Initialize pointers for arrival and departure arrays
        int i = 1, j = 0;
        int platformsNeeded = 1, maxPlatforms = 1;

        // Traverse through all the trains
        while (i < n && j < n) {
            // If next train is arriving before the last train departs, increment platform
            // count
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } else {
                // Else decrement platform count
                platformsNeeded--;
                j++;
            }

            // Update the result if needed
            if (platformsNeeded > maxPlatforms) {
                maxPlatforms = platformsNeeded;
            }
        }

        return maxPlatforms;

    }
}
