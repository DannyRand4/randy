#include <iostream>
using namespace std;

class FoodRatingSystem {
    struct Food {
        string name;
        string cuisine;
        int rating;
    };
    
    Food foods[100];
    int count = 0;
    
public:
    FoodRatingSystem(string f[], string c[], int r[], int n) {
        for (int i = 0; i < n; i++) {
            foods[i].name = f[i];
            foods[i].cuisine = c[i];
            foods[i].rating = r[i];
        }
        count = n;
    }
    
    void changeRating(string food, int newRating) {
        for (int i = 0; i < count; i++) {
            if (foods[i].name == food) {
                foods[i].rating = newRating;
                break;
            }
        }
    }
    
    string highestRated(string cuisine) {
        int maxRating = -1;
        string ans = "";
        for (int i = 0; i < count; i++) {
            if (foods[i].cuisine == cuisine) {
                if (foods[i].rating > maxRating || 
                   (foods[i].rating == maxRating && foods[i].name < ans)) {
                    maxRating = foods[i].rating;
                    ans = foods[i].name;
                }
            }
        }
        return ans;
    }
};

int main() {
    string foods[] = {"sushi", "burger", "pizza", "pasta"};
    string cuisines[] = {"japanese", "american", "italian", "italian"};
    int ratings[] = {5, 3, 4, 5};
    int n = 4;
    
    FoodRatingSystem system(foods, cuisines, ratings, n);
    
    cout << system.highestRated("japanese") << "\n";
    system.changeRating("sushi", 2);
    cout << system.highestRated("japanese") << "\n";
    cout << system.highestRated("italian") << "\n";
    system.changeRating("pizza", 6);
    cout << system.highestRated("italian") << "\n";
    
    return 0;
}
