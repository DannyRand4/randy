#include <iostream>
#include <vector>
using namespace std;

int partition(vector<int>& nums, int low, int high) {
    int pivot = nums[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (nums[j] < pivot) {
            i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    int temp = nums[i + 1];
    nums[i + 1] = nums[high];
    nums[high] = temp;
    return i + 1;
}

void quickSort(vector<int>& nums, int low, int high) {
    if (low < high) {
        int pi = partition(nums, low, high);
        quickSort(nums, low, pi - 1);
        quickSort(nums, pi + 1, high);
    }
}

vector<int> sortArray(vector<int>& nums) {
    quickSort(nums, 0, nums.size() - 1);
    return nums;
}

int main() {
    vector<int> nums = {5, 2, 3, 1, 4};
    nums = sortArray(nums);
    for (int n : nums) cout << n << " ";
    cout << endl;
    return 0;
}
