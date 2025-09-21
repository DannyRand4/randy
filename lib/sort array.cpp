#include <iostream>
#include <vector>
using namespace std;

vector<int> sortArray(vector<int>& nums) {
    int n = nums.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i -1; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }
    return nums;
}

int main() {
    vector<int> nums = {5, 2, 3, 1, 4};
    nums = sortArray(nums);
    for (int n : nums) cout << n << " ";
    cout << endl;
    return 0;
}
