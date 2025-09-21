#include <iostream>
using namespace std;

int reverse(int x) {
    int reversed = 0;
    while (x != 0) {
        int pop = x % 10;
        x /= 10;
        if (reversed > 214748364 || (reversed == 214748364 && pop > 7)) return 0;
        if (reversed < -214748364 || (reversed == -214748364 && pop < -8)) return 0;
        reversed = reversed * 10 + pop;
    }
    return reversed;
}

int main() {
    int num = 123;
    cout << reverse(num) << endl;
    return 0;
}
