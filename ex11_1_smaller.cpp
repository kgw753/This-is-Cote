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
    sort(numbers.begin(), numbers.end());

    int cnt = 0;
    int answer = 0;

    for(int i = 0; i < N; i++){
        cnt++;
        if(cnt >= numbers[i]){
            cnt = 0;
            answer++;
        }
    }
    cout << answer << "\n";
}