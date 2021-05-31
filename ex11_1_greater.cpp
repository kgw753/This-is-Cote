#include<bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin >> N;
    vector<int> numbers;
    for(int i = 0; i < N; i++){
        int num;
        cin >> num;
        numbers.push_back(num);
    }
    sort(numbers.begin(), numbers.end(), greater<int>());

    int answer = 0;
    for(int i = 0; i < N; i++){
        i += numbers[i] - 1;
        answer++;
    }

    cout << answer << "\n";
}